Question 1:
Methods used to obtain variables from a class are called ____.

~> accessors
equals
toString
void
mutators

Question 2:
What Java keyword is used for a child / subclass methods from a parent class?

super

Question 3:
Which of the following is true about the immediate parent and child classes of a class?

a. Every class can have only one child class and only one parent class
~> b. Every class can have many different child class and only one parent class
c. Every class can have only one child class but many different parent classes
d. Every class can have many different child classes and many different parent classes
e. Every class can have either one parent class or one child class, not both

Question 4:
Suppose you wan tto create a child class, which keyword would you use in order to do this?

extends

Question 5:
What is on method from Object that is often overridden?

Object toString()

Question 6 - 8 refer to the follwoing class hierachy:

```java
Equilateral extends Triangle
Triange extends Shape
```

Question 6: !!! 0/5 Possible
Which of the follwoing is true?

a. This class hierachy will cause an error since Equilateral can only have one parent class.
b. When a Equilateral is instantiated the constructors in Triangle and Shape are not Called.
c. Equilateral has access to all methods and variables in Triangle.
d. Equilateral does not have access to any methods in Trianble or Shape.
~> e. Equilateral has access to all public methods and variables in Trianble.

Question 7: !!! 1/5

Which of the following stements must be true in order for Equilateral to access a specific constructor in Shape?

a. Equilateral must have direct access to all public methods and variables in Shape.
b. The call to Shapes's constructor must be the last line in Equilateral's constructor.
~> c. Equilateral;s constructor must call a constructor from Trianble which calls Shapes's constructor.
d. The call to Shape's constructor must be the first line in Equilateral's constructor.
e. Square's constructor must be declared private

Question 8:

If a class Square is added, which of the following woould make the most sense?

a. Square should be a child of Triangle.
b. Square should be a child of Equilateral.
~> c. Square should be a child of Shape.
d. Square should be a parent of Shape.
e. Square should be a parent of Triangle.

Questions 9 - 11 refer to the following:

```java
public class Boss
{
	public Boss()
	{
		System.out.print("A ");
	}
	public Boss(int z)
	{
		System.out.print("B ");
	}
	public void doStuff()
	{
		System.out.print("C ");
	}
}

public class Worker extends Boss
{
	public Worker()
	{
		super();
		System.out.print("D ");
	}
	public Worker(int val)
	{
		super(val);
		System.out.print("E ");
	}
}
```


Question 9:

What is printed when the following line of code is exectued?

```java
Worker steve = new Worker();
```

A D

Question 10:

What is printed when the following line of code is executed?

```java
Worker jim = new Worker(2);
```

B E

Question 11:

Assume that variable karen has been instantiated as a Worker object. What is printed when the following line of code is executed?

C

Question 12:

Consider the following two classes.

```java
public class Conversation
{
	public void hi(){
		System.out.println("Hi");
	}
	public void greeting()
	{
		hi();
		System.out.println("How are you?");
	}
}

public class Suprised extends Conversation
{
	public void hi()
	{
		super.hi();
		System.out.pritnln("You suprised me!");
	}
	public void greeting()
	{
		super.greeting();
		System.out.println("You frighened me.");
	}
}
```

Assume that the following declartion appears in a class other than Converation  or Suprised.
```java
Conversation con = new Suprised();
```

What is printed as a result of the call conv.greeting();

Hi
You surprised me!
How are you?
You frightened me.

d

Question 13:

Conside the following declaration for a class that will be used to represent rectangles.

```java
public class Rectangle
{
	private double height;
	private double width;
	
	public Rectangle()
	{
		height = 2.0;
		width = 1.0;
	}
	
	public Rectangle(doudle w, double h)
	{
		height = h;
		width = w;
	}

	public double getHeight()
	{
		return height;
	}


	public double getWidth()
	{
		return width;
	}

	public void setHeight(double h)
	{
		height = h;
	}

	public void setWidth(double w)
	{
		width = w;
	}
	//Other methods not shown
}
```

A square class which extends the Rectangle class is to be written. Which of the following constructors will cause an error upon compilation when added to this class.

a.
public Square() {
    setHeight(2.0);
    setWidth(2.0);
}
b.
public Square() {
    super(2.0, 2.0);
}
c.
public Square(double side) {
    height = side;
    width = side;
}
d.
public Square(double side) {
	super();
	setHeight(size);
	setWidth(size); 
}
e.
public Square(double side) {
    super(size, size);
}

Question 14:

A  hostpital needs a program to store information about their patient rooms. Each of the rooms will be represented by an object which will store the number of beds in th room, and the floor it is on. Some rooms at the hospital are upscale rooms. in which case in addition to the information aboce they also need to store the size of the room. Which of the following is the best object-iriented program design?

~> a. Create a Room class with the instance variables in numBeds, and int floor. Create a sublclass Upscale of Room which will inherit the instance variables of Room and has an additional instance variable double size.
b. Create a Room class withthe instance variables int numBeds, and int floor. Create a separate class Upscale with the instance variable boolean size.
c. Create a Upscale which will inherit the instance variables numBeds and floor from Upscale, but not the instance bariable double size.
d. Create a single RoomOrUpscale class with the instance variables int numBeds, int floor, and double size.
e. Create each of the following as as separete classes: Room, Beds, Floor, Upscale, Size.

Question 15:

Considrer the following two classes.

```java
public class Parent
{
	public String myType()
	{
		retrun "Parent";
	}
}

pubic class Child extends Parent
{
	public String myType(){
		return "Child";
	}
}
```

What is printed as a result of executing the following code segment?

```java
Parent obj = new Child();
System.out.println(obj.myType());
```

Child

Question 16 - 18 refer to the following classes:

```java
public class Thing
{
	private int value;
	public Thing()
	{
		value = (int) (Math.random() * 100);
	}
	public String toString()
	{
		retrun "" + value;
	}
	// other methods not shown
}

public class Cog extends Thing
{
	private int num;
	public Cog();
	{
		num = (int) (Math.random() * 100);
	}
	public String toString()
	{
		return "" + num;
	}
}
```

Question 16: 2/5!!!

Consider the following declaration:

```java
public class Gear extends Cog
```

Which of the following is true?

a. Gear cannot access any methods in Thing directly or indirectly
b. Gear cannot extend Cog since classes can only inherit from one class.
c. Gear's constructor calls the constructor in Cog and Thing directly.
d. Gear can access all constructors in Cog.
~> e. Gear's constructor calls the constructor in Thing

Question 17: 3/5!!!

a. Cog is a parent of Thing.
b. Thing can call the constructor in Cog.
c. Thing can only call the toString method in Cog.
d. The constructor in Cog cannot call any constructors in Thing.
~> e. Cog can call the toString method in Thing.

Question 18:

You need to change the toString in Cog to also return the data in the variable value in Thing. Which of the following would correclty do this?

a.
```java
public String toString()
{
	return "" + num + " " + super.value;
}
```
~> b.
```java
public String toString()
{
	return "" + num + " " + super.toString();
}
```
c.
```java
public String toString()
{
	return "" + num + " " + toString();
}
```
d.
```java
public String toString()
{
	return "" + num + " " + value;
}
```
e.
```java
public String toString()
{
	return "" + num + " " + value;
}
```

Question 19: 4/5 !!!
Consider the following code segment that appears in a class other than Student or Graduate.

Line 1: Student me = new Graduate("Brian", 2007, 2011);
Line 2: System.out.Println(me.toString());
Line 3: System.out.Println("Years studied: " + me.yearsStudied());

When this compliation and execution of this code attempted, which of the following best describes the results?
a. Line 2 will cause an error at compiation as there are two methods name toString().
~> b. Line 3 will cause an error at compilation as the object me is defined as Student, but the method yearsStudied() is only in the Graduate class.
c. The code will compile, and when exectued will print the lines "Brian. Enrolled: 2007 Graduated: 2011" and "Years studied: 4".
d. The code will compile, and when exectued will print the lines "Brian. Enrolled: 2007" and "Years studied: 4".
e. The code will compile, and when exectued will print the lines "Brian. Enrolled: 2007" and nothing else.

Question 20: 5/5 !!!

```java
Math, Science, English, Course, Schedule
```

Which should not be included in a class hierarchy?

a. Math
b. Science
c. English
d. Course
~> e. Schedule

Regular Test

Question 1:
mutators

Question 2:
Extends

Question 3:
Every class can have many different child classes but only one parent class

Question 4:
super

Question 5:
toString, equals

Question 6:
Rhombus has access to all public methods and variables in Quadrilateral.

Question 7:
Rhombus' constructor must call a constructor from Quadrilateral which calls Polygon's constructor.

Question 8:


Question 9:
one orange three oranges

Question 10:
two oranges for oranges

Question 11:
six oranges

Question 12:

Hello
What a pleasant suprise!
Nice to meet you
I hope you're doing well

Question 13:
Public Square(double w)
{
	height = w;
	width = w;
}

Question 14:
Create a Room Class with the instance variables int numBeds, and boolean hasBath. Create a subclass a subclass Suite of Room which will inherit the instance variables of Room and has an additional instance variable int numSubrooms.

Question 15:
Kid

Question 16:
Gear;s constructor calls the constructor in Cog, which calls the constructor in Thing.

Question 17:
Thing can call the toString method in Cog.

Question 18:
public String toString()
{
	return "" = super.toString() + " " + num;
}

Question 19:
Line 3 will cause an error at compilation as the object me is defined as a Student, but the method yearsStudied() is only in the Graduate class.

Question 20:
StorageBox