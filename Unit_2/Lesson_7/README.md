# Wrapping Primitive data types

Wrapper classes provide a way to use primitive data types (`int`, `boolean`, etc..) as objects.

```java
Integer x = new Integer(45);
Integer y = new Integer(58);
System.out.println(x.compareTo(y));
```

> -1

The code above is a simple implementation of a wrapper class defining the `x` and `y` integers as objects. These objects can be further manipulated as seen with `.compareTo()`.

## Constant Veriables

`MAX_VALUE` and `MIN_VALUE` are two constant veriables that define the maximum value of a data type.

```java
int maxInt = Integer.MAX_VALUE;
int minInt = Integer.MIN_VALUE;

System.out.println("Value: " + (maxInt + 1);
System.out.println("Value: " + (minInt - 1);
```

> Value: -2147483648
>
> Value: 2147483647

## Autoboxing and Unboxing

**Autoboxing** is the process java performs that coverts the `Integer` into a regular `int`

**Unboxing** is the reverse converting and `int` into an `Integer`

```java
Integer a = 10; // Autoboxing: int to Integer
int b = a; // Unboxing: Integer to int

System.out.println("Autoboxed Integer a: " + a);
System.out.println("Unboxed int b: " + b);
```

> Autoboxed Integer a: 10
>
> Unboxed int b: 10
