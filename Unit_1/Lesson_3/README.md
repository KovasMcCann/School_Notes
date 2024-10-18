# Data Types

# List
```Taken from w3schools```

|Type|Size|Info|
-----|----|----
|byte|1 bytes | Stores whole numbers from -128 to 127 |
|short| 2 bytes | Stores whole numbers from -32,768 to 32,767 |
|int| 4 bytes | Stores whole numbers from -2,147,483,648 to 2,147,483,647 |
|long | 8 bytes | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
|float | 4 bytes | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits |
|double | 8 bytes | Stores fractional numbers. Sufficient for storing 15 decimal digits |
|boolean | 1 bit | Stores true or false values |
|char | 2 bytes | Stores a single character/letter or ASCII values |

# Input

If you want to store or process user input with different data types you can use different functions

```java 
//byte
byte x = scan.nextByte();

//short
short x = scan.nextShort();

//int 
int x = scan.nextInt();

//long
long x = scan.nextLong();

//float
float x = scan.nextFloat();

//double
double y = scan.nextDouble();

//boolean
boolean x = scan.nextBoolean();

//char
char x = scan.nextChar();
```

# Computations 

Mathematical computations with data types are relatively easy. 

You just put the two numbers of variables you want to together with ``(+,-,*)``

Example
```java
int a = 5;
int b = 2 * a;
System.Out.println(b) //will return "10"
```

# MAX_value

The ``Integer.MAX_VALUE`` can assign the maximum value to a variable. 

```java
int x = Integer.MAX_VALUE;
x = x + 1; //Output:-2147483648 
```

Be careful because it will cause an **integer overflow** 

# Read Only

To make a Datatype read only you can use ``final`` before assigning the variable

Example
```java
final double pi = 3.14159265;  //this will assign pi to a readonly value of 3.14159265
```


