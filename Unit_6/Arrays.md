# Arrays

To declare an array in Java you can use ``String[] name;``

To add values you can use ``{"",""}``

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

// Another way to declare an array is with
String[] cars = new String[2];
```

## Access

To access elements of an Array you can use the name of the array and the desired position inclosed inside of the ``[]``'s

```java
System.out.println(cars[0])
```

> Volvo

## Modify

To modify an array you specify which location and set it equal to desired input

```java
cars[0] = "Mercedes" //This set up 1 space in memory for storage because of the [0]
System.out.println(cars[0])
```

> Mercedes
