# Parameters

A parameter is a local variable in a method header that holds the data sent in. The data type of the parameter makes a huge difference in what the method can do.

```java
public static void square(double x) 
{
  System.out.println(x * x); 
}

double val = scan.nextDouble();

system.out.println(val);
```

> 1.2

```java
system.out.println(square(val));
```

> 1.44

Notice how the `square()` function is able to use (gets passed) a double. This is called a **parameter** and allows for more functionality.

Also while inside the `()` is consider the parameter the **argument* or actual value or actual parameter. Is the part that calls the method.

```java
public static void squareIt(double x) 
{
  System.out.println(x * x);
}

double val = scan.nextDouble();
square(val);
```

> The **Val** is considered the Argument
