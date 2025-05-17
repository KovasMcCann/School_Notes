import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Sphere;
import javafx.scene.AmbientLight;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.PerspectiveCamera;

import javafx.util.Duration;

import javafx.animation.PathTransition;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/*
 * planets
 * Mercury Gray
 * Venus Red
 * Earth Blue
 * Mars Red
 * Jupiter Brown
 * Saturn Yellow
 * Uranus Light Blue
 */

public class Main extends Application {

    private int width = 800;
    private int height = 800;

    String[] Planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

    //sizes should be accurate to the real scale of the planets
    double[] PlanetSizes = {0.4, 0.95, 1, 0.53, 11.2, 9.4, 4, 3.8};
    double[] PlanetDistances = {0.39, 0.72, 1, 1.52, 5.2, 9.58, 19.22, 30.05};
    double[] PlanetSpeeds = {0.24, 0.615, 1, 1.88, 11.86, 29.46, 84.01, 164.8};
    String[] PlanetColorNames = {"gray", "red", "blue", "red", "brown", "yellow", "light blue", "dark Blue"}; // Placeholder value

    ArrayList<Sphere> planets = new ArrayList<>();

    private Color getColorFromName(String name) {
        switch (name.toLowerCase()) {
            case "gray": return Color.DARKGRAY;
            case "red": return Color.GOLDENROD;
            case "blue": return Color.ROYALBLUE;
            case "brown": return Color.INDIANRED;
            case "yellow": return Color.SANDYBROWN;
            case "light blue": return Color.KHAKI;
            case "dark blue": return Color.LIGHTSKYBLUE;
            default: return Color.WHITE; // fallback color
        }
    }
    
    public void createPlanet(String name, double size, double distance, double speed, int x) {
        Sphere planet = new Sphere(size * 10);
        //planet.setMaterial(new javafx.scene.paint.PhongMaterial(Color.GRAY)); 
        //planet.setMaterial(new javafx.scene.paint.PhongMaterial(Color.valueOf(PlanetColorNames[0]))); 
        planet.setMaterial(new javafx.scene.paint.PhongMaterial(getColorFromName(PlanetColorNames[x]))); // Placeholder value
        planet.setTranslateX(width / 2 + distance * 100); // Scale distance for visibility
        planet.setTranslateY(height / 2);
        planet.setTranslateZ(0);
        planets.add(planet);

        Circle orbit = new Circle(width / 2, height / 2, distance * 100);
        //show the orbit as a white circle
        orbit.setStroke(Color.WHITE);
        orbit.setFill(Color.TRANSPARENT);
        orbit.setOpacity(0.5);
        orbit.setStrokeWidth(100 * size);


        PathTransition orbitTransition = new PathTransition();
        orbitTransition.setDuration(Duration.seconds(speed));
        orbitTransition.setPath(orbit);
        orbitTransition.setNode(planet);
        orbitTransition.setCycleCount(PathTransition.INDEFINITE);
        orbitTransition.setInterpolator(javafx.animation.Interpolator.LINEAR);
        orbitTransition.play();


        System.out.println(name + " Orbit radius: " + (distance * 10));
    }

    @Override
    public void start(Stage primaryStage) {
        Sphere sun = new Sphere(25);
        sun.setTranslateX(width / 2);
        sun.setTranslateY(height / 2);
        sun.setTranslateZ(0);
        sun.setMaterial(new javafx.scene.paint.PhongMaterial(Color.YELLOW));

        for (int index = 0; index < Planets.length; index++) {
            String planet = Planets[index];
            createPlanet(planet, PlanetSizes[index], PlanetDistances[index], PlanetSpeeds[index], index);
        }

        /* create a single planet
        Sphere earth = new Sphere(20);
        earth.setMaterial(new javafx.scene.paint.PhongMaterial(Color.BLUE));

        Circle PEarth = new Circle(width / 2, height / 2, 200);
        PEarth.setOpacity(0.5);
        PEarth.setStroke(Color.WHITE);

        PathTransition earthOrbit = new PathTransition();
        earthOrbit.setDuration(Duration.seconds(10));
        earthOrbit.setPath(PEarth);
        earthOrbit.setNode(earth);
        earthOrbit.setCycleCount(PathTransition.INDEFINITE);
        earthOrbit.setCycleCount(PathTransition.INDEFINITE);
        earthOrbit.setAutoReverse(false);
        earthOrbit.setInterpolator(javafx.animation.Interpolator.LINEAR);
        earthOrbit.play();
        */

        AmbientLight ambientLight = new AmbientLight(Color.GRAY);
        ambientLight.setTranslateX(width / 2);
        ambientLight.setTranslateY(height / 2);
        ambientLight.setTranslateZ(0);
        ambientLight.setColor(Color.GRAY);

        //Group root = new Group(sun, ambientLight, earth);
        /*
        Group root = new Group(sun, ambientLight);
        for (Sphere planet : planets) {
            root.getChildren().add(planet);
        }
        */

        Group world = new Group(sun, ambientLight);
        for (Sphere planet : planets) {
            world.getChildren().add(planet);
        }

        Scene scene = new Scene(world, width, height, true);


        //Scene scene = new Scene(root, width, height, true); // true enables 3D rendering
        scene.setFill(Color.BLACK);

        // Set the camera
        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.setTranslateZ(-7000); // Move the camera back
        camera.setTranslateX(width / 2);
        camera.setTranslateY(height / 2);
        camera.setFieldOfView(45);
        camera.setNearClip(0.1);
        camera.setFarClip(10000);
        scene.setCamera(camera);

        // Set the camera and mouse controls
        // Variables to track previous mouse positions

        final double[] mouseOld = new double[2];

        scene.setOnMousePressed(event -> {
            mouseOld[0] = event.getSceneX();
            mouseOld[1] = event.getSceneY();
        });

        scene.setOnMouseDragged(event -> {
            double deltaX = event.getSceneX() - mouseOld[0];
            double deltaY = event.getSceneY() - mouseOld[1];

            // Translate world along X and Y axes
            world.setTranslateX(world.getTranslateX() + deltaX);
            world.setTranslateY(world.getTranslateY() + deltaY);

            // Optional: include depth movement with drag if you like
            // world.setTranslateZ(world.getTranslateZ() + deltaY);

            mouseOld[0] = event.getSceneX();
            mouseOld[1] = event.getSceneY();
        });

        scene.setOnScroll(event -> {
            double zoomAmount = event.getDeltaY(); // Scroll up = positive = zoom in
            world.setTranslateZ(world.getTranslateZ() + zoomAmount);
        });

        //scene.setCamera(new javafx.scene.PerspectiveCamera(true));
        //scene.setFill(javafx.scene.paint.Color.BLACK);
        //sun.setMaterial(new javafx.scene.paint.PhongMaterial(Color.YELLOW));

        primaryStage.setTitle("Space Simulation ©2025 Kovas McCann"); //copyright joke btw
        //primaryStage.setWidth(800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}