# Unit 9 Quiz

## Question 1

All classes in Java inherit from the ____ Class.

> Object

Use this as a reference for the question above

```java
class MyClass {
    // This class implicitly extends Object
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Using methods from Object class
        System.out.println(obj.toString());  // Calls Object's toString() method
        System.out.println(obj.hashCode());  // Calls Object's hashCode() method
        System.out.println(obj.equals(new MyClass()));  // Calls Object's equals() method
    }
}
```

## Question 2

Which of the following keywords allows a child class to access the overridden methods in a parent class?

> super

`super` is a keyword in Java that serves as a reference variable, allowing a subclass to access members (methods and variables) and constructors of its __superclass__.

Problems 3-4 refer to the following class meant to represent the spinner in a board game.

```java
class Spiner{
    private int numOptions;
    private int chosen;

    public Spinner (int n){
        if (n >= 2 &&  n <= 20){
            numOptions = n;
        }
        spin();
    }

    public void spin(){
        chosen = (int) (Math.random () * numOptions) + 1;
    }
}
```

## Question 3

Which of the following is a correct declaration for a Spinner object as written?

> Spinner s = new Spinner(15);

This is the standard way to define and object look at the code reference in Question 2 for an example

## Question 4

Which of the following would be correct declarations for a default constructor

> I and III only

This is because II passes a veriable `n` witch isn't defined anywhere

## Question 5

Which of the following methods is from the Object class and often overridden.

> equals

### All Methods in Object Class

| Method                     | Description                 |
|----------------------------|-----------------------------|
| `protected Object clone()` | Creates and returns a copy of the object (requires Cloneable interface).    |
| `boolean equals(Object obj)` | Compares the current object with another object for equality.              |
| `protected void finalize()` | Called by the garbage collector before an object is removed from memory.   |
| `Class<?> getClass()`       | Returns the runtime class of the object.                                   |
| `int hashCode()`            | Returns a hash code value for the object.                                  |
| `void notify()`             | Wakes up a single thread waiting on this object's monitor.                 |
| `void notifyAll()`          | Wakes up all threads waiting on this object's monitor.                     |
| `String toString()`         | Returns a string representation of the object.                             |
| `void wait()`               | Causes the current thread to wait indefinitely until another thread notifies it. |
| `void wait(long timeout)`   | Causes the current thread to wait for a specified time (in milliseconds).   |
| `void wait(long timeout, int nanos)` | Causes the current thread to wait for a specified time (in milliseconds + nanoseconds). |

## Question 6

Which of the following is true about parent and child classes?

> A child class can access the parent's constructor using the super keyword.

## Question 7 (review)

You have written a class called Frog and have not written a `toString` method.

```java
Frog f = new Frog();
System.out.println(f);
```

What happens when the code above is executed?

> The toString method in Object is called.

## Question 8

What is the rule for a super reference in a constructor?

It must be the first line of the constructor in the child class.

## Question 9

Consider the following class definition. 

```java
public class WhatIt{
    private int length;
    private int width;

    public int getArea (){
        // implementation not shown
    }

    private int getPerimeter() {
        // implementation not shown
    }
}
```

A child class Thingy that extends WhatIt would have access to:

> `getArea()`

## Question 10

Consider the following class:

```java
public class FrozenDesert{
    public FrozenDesert(){
        System.out.println("Yum")
    }
}
```

You write a class, FrozenYogurt, Which extends FrozenDesert. Which is a correct implementation of the constructor for FrozenYogurt?

```java
public FrozenYogurt(){
    super();
    System.out.println("I'm the new ice cream");
}
```

This works because the ``super()`` call is in the first line
