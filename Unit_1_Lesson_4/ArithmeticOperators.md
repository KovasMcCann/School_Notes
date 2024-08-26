
# Arithmetic in Java

Some basic arithmetic operators are

|Char|Meaning|
|----|-------|
|+| Addition|
|-| Subtraction|
|*| Multiplication|
|/| Division|

## Basic Example

``` Java
int x = 9; 
int y = 2; 
int z = y + x * x; \\ This is where the arithmetic is
System.out.println(z); \\ Output: 83
```

### **Warnings**

1. To get the proper out put you want you may need to change the **Data Type**

    ```java
    \\Incorrect
    int x = 9;
    int y = 2;
    System.out.println(x / y); \\ Output: 4

    \\Also Incorrect
    int x = 9;
    int y = 2;
    double z = x / y;
    System.out.println(z); \\ Output:4.0

    \\Correct
    int x = 9;
    int y = 2;
    double z = 1.0 * x / y;
    System.out.println(z); \\ Output: 4.5
    ```

    Notice How the second example use a double to store the arithmetic.

    This will return an unsatisfactory answer because there is now integer added to the calculation

    In the final example its shows correctly because there is a Double in the equation allowing for proper mathematical computation.

2. Divide by Zero
    Avoid Dividing by Zero

    ```java
    int x = 5;
    int y = 0;
    int z = x / y; // This line will cause an error
    ```

## Compound Assignment Operators

To quickly perform arithmetic you can use **Compound Assignment Operators**

```java
int x = 3;
x *= 7; // The value of x is now 21
x -= 3; // The value of x is now 18
x /= 6; // The value of x is now 3
x += 3; // The value of x is now 6
```

To perform an increment of for adding or subtracting use:

```java
int x = 9;
x++; // x is now 10
x--; // x is now 9
```
