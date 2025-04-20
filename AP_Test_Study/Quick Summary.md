# Youtube Summary

## Unit 1 (Java Syntax)

Java is case sensitive

need matching braces ``{}``

### Veriables

how to define

type name = value;

ex: ``String playerName = "Kovas";``

4 types on test

- String
 - stores text

- double
 - decimal values

- int
 - integers

- boolean (no double quotes)
 - True or false values

### Order of operations

PEMDAS

| Arithmetic    | Operator | Example     |
|---------------|----------|-------------|
|Addition       |``+``     | 10 + 4 = 14 |
|Subtraction    |``-``     | 10 - 4 = 6  |
|multiplication |``*``     | 10 * 4 = 40 |
|division       |``/``     | **10 / 4 = 2** <br> 10.0 / 4 = 2.5 <br> 10 / 4.0 = 2.5 <br> 10.0 / 4.0 = 2.5   |
|modulus        |``%``     |10 % 4 = 2   | 

> How can I do modulus on calc

### Modulus (``%``)

Tricks

#### Get digits

``n = 45592``

- last digit
 - ``int lastDigit = n % 10``
 - > 2
- last 2 digits
 - ``int lastDigit = n % 100``
 - > 92
- This add one more 0 will keep repeting

#### Even/Odd

``System.out.println(n % 2)``

> 0 | if ``n`` is even
>
> 1 | if ``n`` is odd

## Unit 3 (Relational Operators)

| Operator       |                                        |
|----------------|----------------------------------------|
| ``<``,``>``    | Greater than or less than              |
| ``<=``, ``>=`` | Greater than or equal to and less than |
| ``!``          | Not equal to                           |

```java
int a = 10;

System.out.println( a < 10);
System.out.println( a == 10);
```

> false
> 
> true

### Logical operators (``&`` and ``|``)

- ``&``
 - Both sides must be True
- ``|`` 
 - Only one side needs to be True
 
```java
int a = 1;
int b = 3;

System.out.println( a == 0 && b == 3);
System.out.pritnln( a == 9 || b == 3);
```

> false (becuase a != 0)
>
> true (this is an or statment therefore both don't apply)

### DeMorgan's Law

adding a ``!`` will inverse the output of an opperator

``!(a <= b || b > c)`` = ``(a > b && b <= c)``

### Conditionals 

if, else, else if are all conditionals

they can be used for decisions

#### Syntax

```java
if (condition){
}
```

```java
else if (condition){
}
```

```java
else (condition){
}
```

## Unit 2 Methods 

- A group of insturctions that performs a task

- Designed to be used like a tool

### Syntax

public void inchToCm(value)

- public/private
 - Who can accesss the veriable

- void/(type)
 - What is outputed

- inchToCm(value) (Name)
 - you can pass a value into the method for interacting with data

```java
public void inchToCm() {
    double inchLength = 3.0;
    double cmLength = inchLength * 2.54;
}
```

### Class

A class defines how to create objects

```java
public class MainPlayer {
    //instance variables
    private String name;
}
```

Class name needs to match filename

k