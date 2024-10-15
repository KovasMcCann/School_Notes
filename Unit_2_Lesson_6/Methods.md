# Methods

A method is a block of code which **only runs when it is called**. You can pass data, known as parameters, into a method. Methods are used to perform certain actions, and they are **also known as functions**. Why use methods? To reuse code: define the code once, and use it many times.

## Calling a method

```java
Circle c = new Circle();
System.out.println(c);
c.setRadius(17.5);
System.out.println(c);
```

> circle with radius 1.0
>
> circle with radius 17.5

Above are two examples of calling methods.

### What does this do?

```ascii
Circle c = new Circle();
^     ^     ^       ^
|     |     |       |
|     |     |       +--- 4. Call the Constructor
|     |     +----------- 3. new is used to create an object
|     +----------------- 2. Variable Name
+----------------------- 1. Call the Class
```

## Void

Void Methods are methods that do not return data.

```java
Circle c = new Circle();
System.out.println(c);
c.setRadius(17.5);
System.out.println(c);
```

> In this code the `setRadius()` methods is void because it doesn't return data.

## Non-Void

Non-Void methods are methods that return data.

```java
Rectangle r = new Rectangle(2.5, 4.5);
double a = r.getArea();
System.out.println(a);
```

> Notice how the `r.getArea()` "computation" was stored in a variable and outputted.

## Overloaded methods

Method overaloading is when multiple methods can have the **same name** with **different parameters**.

```java
int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)
```

> `myMethod()` is overloaded because there are multiple "versions" that have the same name but different parameters.

## `indexOf()` 

The `indexOf()` method returns the position of the first occurrence of specified character(s) in a string.

![image](https://github.com/user-attachments/assets/13387060-03fd-49a6-a330-26b7533384da)

```java
String myStr = "cat,dog";
System.out.println(myStr.indexOf("dog"));
```
> 4
