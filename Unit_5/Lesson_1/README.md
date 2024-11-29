# Void Methods

The `void` method is a return type that indicates the method performs an action but does not produce a result that can be used elsewhere in the code.

## Declaring a Void Method

When declaring a void method you need to make sure you **declare it outside of the main method**

Example:

```java
public static void doStuff() 
{
    System.out.println("This is in another method.");
}

public static void main(String[] args)
{
    doStuff();
}
```

> This is in another method.

## Declaring a Method Within A class

When calling a method defined in a different class, you need a reference (or use the class name for `static` methods)

```java
public class Main {
    public static void main(String[] args) {
        Helper.sayHello(); // Static method call using the class name
        Helper helper = new Helper();
        helper.printMessage(); // Non-static method requires an instance
    }
}

class Helper {
    public static void sayHello() {
        System.out.println("Hello from static method!");
    }

    public void printMessage() {
        System.out.println("This is an instance method.");
    }
}
```
