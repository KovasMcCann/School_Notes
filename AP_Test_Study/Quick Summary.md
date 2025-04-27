# Youtube Summary

First Video [link](https://www.youtube.com/watch?v=_mClihsGtjY)

## Unit 1 (Java Syntax)

Java is case sensitive

need matching braces ``{}``

### Variables

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

*PEMDAS*

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
- This add one more 0 will keep repeating

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
System.out.println( a == 9 || b == 3);
```

> false (because a != 0)
>
> true (this is an or statement therefore both don't apply)

### DeMorgan's Law

adding a ``!`` will inverse the output of an operator

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

Methods are a group of instructions that performs a task

   - Designed to be used like a tool

   - They are inside of Classes

### Syntax

public void inchToCm(value)

- public/private
    - Who can access the variable

- void/(type)
    - What is outputted

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
    private String name; //note because private it can only be accessed in the class!!!
    private int livesLeft;

    //constructor
    public MainPlayer(){
        //setters and getters
    public void setName( String n ) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public void setLivesLeft( int lives ) {
        livesLeft = lives;
    }
    public int getLivesLeft() {
        return livesLeft;
    }
    public void run (){
        //code
        System.out.println(name + " is running!")
    }
    public void jump(){
        //code
        System.out.println(name + " is jumping!")
    }
    }
}
```

**Instance Variables**

- Store the data for each class
    - This applies for when a new object is made 
    - i.e every new object has new instance variables

**Constructor**

```java
public MainPlayer()
```

> This is the constructor itself

- it is used when you wan't to run a method in java
- in a main method ``MainPlayer player1 = new MainPlayer();`` would use the default constructor
- there can be multiple types of constructors that may pass variables

**Seters and Getters**

- Setters and Getters are used to alter the data inside of a class

- Outside of the class they would look like this:   

```java
MainPlayer player = new MainPlayer();
player.setName("Alice"); // Set name using setter
```

**Other Methods**
   - Other Methods in this class would be consider the ``run()`` and ``jump()`` methods
   - These can also be run outside of the class and lok like this

```java
MainPlayer player = new MainPlayer();
player.setName("Alice"); // Set the player's name
player.run();  // Output: Alice is running!
```

**Other notes:**

- Class name needs to match filename

### Strings

- While not typically considered a class it still is one
    - Think of how variables (strings) are defined

#### Concatenation

Definition: ``the action of linking things together in a series``

concatenation can be done on strings and looks like

```java
String name = "Kovas";
name = name + " McCann";
System.out.println(name);
```

> name

This is an example of concatenation as ``Kovas`` and ``McCann`` were combined 

**Numbers !!important!!**

When numbers are concatenated into a string **they will not be added** but will when there are in a integer or double

```java
int x = 420;
int y = 69;

//String is first
System.out.println("x + y =" + x + y);

//int is first
System.out.println(x + y + " = x + y");
```

> 42069
>
> 489 = x + y

#### equals()

there are two types of strings

   - String Literals
   - String Objects

**String Literals**

```java
String a = "Hello";
String b = "Hello";

System.out.println(a == b);
System.out.println(a.equals(b));
```

> true
>
> true

**String Objects**

```java
String s1 = new String("Hello");
String s2 = new String("Hello");

System.out.println(s1 == s2);
System.out.println(s1.equals(s2));
```

> false
>
> true

The reason that String Objects and String Literals output different values on the ``==`` is because of the parentheses.

This is because the ``==`` looks at the memory address and in the case of Objects they are different

For more information look at [Reference Vs. Primitive variable types](####-Reference-Vs-Primitive-veriable-types)

#### CompareTo()

``CompareTo()`` is designed to output and integer based on the difference in characters

This is based on the ASCII table

``CompareTo()`` can be thought of as a minus sign

the order is numbers < uppercase < lowercase

**Example**

```java
String String1 = "Apple"; //A is in POS 1 in the alphabet
String String2 = "Apple"; //A is in POS 1
String String3 = "Orange"; //O is in POST 15

System.out.println(String1.CompareTo(String2)) //Apples and Apples
System.out.println(String1.CompareTo(String3)) //Apples and Oranges
```

> 0 //The strings are equal
>
> -14 // This is because 1 - 15 = -14

#### substring()

Used to extract a string from another (take the *sub* of the string)

```java
String game = "Pokemon";
System.out.println(game.substring(0, 4))
```

> Poke

Remember that the starting index is inclusive (n) and the end index in non inclusive (n + 1)

### Math Class

The Math Class is shipped with java and gives you methods like:

- ``abs()``:
    - returns the absolute vale of an numerical variable
    - ```java
      math.abs(-1) //returns: 1
      ```

- ``sqrt()``:
    - returns the square root of an input
    - ```java
      math.sqrt(16) //returns: 4
      ```

- ``pow()``:
    - rases the input to the nth power
    - Syntax: pow(base, exponent)
    - ```java
      math.pow(2, 4) //returns: 16
      ```

- ``random()``:
    - returns a random number from 0-1
    - ```java
      x = math.random();
      System.out.println(x); // Will print a random number
      ```

- ``PI``

#### random()

Using ``math.random()`` to print from a different range

```java
double x = (int) (math.random() * 6) + 1

System.out.println(x);
```

**Explanation**

The `(int)` casts the variable from a boolean (decimal values) into an integer (non decimal values) this gives you only hole numbers

`Math.random()` is multiplied by 6 to give you a range from 0 - 5
   - this works because Math.random gives a number between 0 and 1 and the multiplication spreads it out along a larger distance

The plus one shifts the values from 0 - 5 to 0 - 6

Formula:

```java
(int) (Math.random() * range) + first number in range
```

#### Reference Vs Primitive variable types

Primitive:

- Shipped with java
    - ex: int, double, boolean 

example:

```java
int num1 = 10;

System.out.println(num1);
```

> 10

Reference:

- Used to refer to an Object
- **Doesn't store the Object itself but the memory address to it**

```java
Circle c1 = new Circle("Yellow");
System.out.println(c1);
```

> circle@677327b6

***Notice** how this is returning the memory address*

Difference example:

```java
Circle c1 = new Circle("Yellow");
Circle c2 = new Circle("Blue");

c2 = c1;

c1.setColor("pink")

System.out.println(c1.getColor())
System.out.println(c2.getColor())
```

> pink
> pink

## Unit 4 Iteration

### While loop

runs *while* a conditions is meet

```java
int x = 1;

while (x < 5){
    System.out.println(x);
    x++;
}
```

> 1234


### for loop

This is a "More Condensed" while loop 

```java
for(int x = 1; x < 5; x++){
    System.out.print(x);
}
```

> 1234

### Scope

Accessing variables that are in a for loop can't be done on the outside

Example:

```java
public class scope {
    public static void main(String[] args){
        //int x; (declare the variable before the for loop)
        // This will keep it in "scope"
        for(int x = 0; x < 5; x++){
            System.out.print(x);
        }
        System.out.println(x)
    }
}
```

> java.lang.Error: Unresolved compilation problem: n cannot be resolved to a variable

Right now the program would return an error because the variable x would not be accessible out side of the for loop

To fix this issue uncommenting `int x;` would allow the program to access `x` and print the value of 5

### Nested loops

A Nested loop's are *loops inside of loops*

```java
for (int i; i < 3; i++){ 
    for (int j = 1; j < 4; j++){
        System.out.println(i + ", " + j);
    }
}
```

> 0, 1
>
> 0, 2
>
> 0, 3
> 
> 1, 1
>
> ...
>
> 2, 3

## Unit 6 Arrays

Arrays allow you to store multiple values (of a fixed size) into a single variable

example:

```java
String[] sodaArray = {"Coke", "Dr. Pepper", "Pepsi", "Sprite", "Fanta"}; // Pre Populated

String[] sodaArray = new String[5]; //5 slots

sodaArray[0] = "Coke";
//...
```

### Printing Arrays

```java
System.out.println(sodaArray);
```

> [!@677327b6

****Printing the array will return the memory address or an error****

one way to fix this is a for loop:

```java
for(int x = 0; x < sodaArray.length; x++){
    System.out.print(sodaArray[x] + " ");
}
```

> Coke Dr. Pepper Pepsi Sprite Fanta

### For each loop

You can also use a For each loop

```java
for(String x : sodaArray){
    System.out.println(x);
}
```

> Coke
>
> Dr. Pepper
>
> ...

### Fetching last element

to get the last element of an array you can use the .length method and some simple arithmetic

```java
String lastDrink = sodaArray[sodaArray.length - 1];
```

### Array Lists

While Array's have fixed size Array lists don't

They can be defined like:

```java
ArrayList<type> name = new ArrayList<Type>();
```

**You need to declare an array list with `import java.util.ArrayList;`**

### Array list methods

add()
- This adds an element to an Array List

set()
- this rewrites a variable

remove(int position)
- removes an element

## Unit 8 Two Dimensional Arrays (Matrices)

Second Video [link](https://www.youtube.com/watch?v=Zs_OWyCUWjg)

2D arrays are just regular Array's with rows and columns

How to declare a 2D array:

```java
dataType[][] name = new dataType[row][collum]; //size of rows and column

// declare values
dataType[][] name = {{1,2,3},
                     {4,5,6},
                     {7,8,9}}
```

## Unit 9 Inheritance and Polymorphism

Third Video [link](https://www.youtube.com/watch?v=GsXTroueOMA)

Allows you to easily manage multiple groups of objects

Think of this as a tree where the top has the broadest of characteristics while each sub-class contains more and more granularity

### Inheritance Tree Example

```plaintext
          Animal
         /      \
    Mammal       Bird
    /   \         |
 Dog    Cat      Parrot
```

- **Animal** is the parent class.
- **Mammal** and **Bird** inherit from **Animal**.
- **Dog** and **Cat** inherit from **Mammal**.
- **Parrot** inherits from **Bird**.

**is-a** relation ship
- each sub class *is-a* part of the super class

### Extends (creating a sub class)

here is an example

**Super Class**
```java
public class Superclass{

}
```

```java
public class class extends Superclass{

}
```

now class will inherit all the objects in Superclass


### Overrides

If you have two objects (methods or variables) with the same name in a super class and subclass the subclass will overwrite the superclass

### Code-Along

**NEED TO COMPLETE**

## Unit 10 Recursion

Forth Video [link](https://www.youtube.com/watch?v=W0qeMfPOcfY)

What is Recursion:

recursion is a programming technique where a method calls itself within its own definition

Example:

```java
public class Test {
    public static void main(String[] args){
        minusOne(10);
    }
    public static void minusOne(int n){
        if(n == 0){
            return;
        }
        System.out.print(n)
        return minusOne(n-1);
    }
}
```

> 10987654321

Example 2:

What is returned by the call `re(5)`

```java
public int re(int n){
    if (n == 1)
        return 1;

    return n*re(n - 1);
}
```

To figure out what the program will output we can trace the programs steps

We first start with the output of 5 and because it's not equal to 1 we return `5*re(4)`

We go all the way down until `n` equals 1

Once we get to this point we start completing the operation

it will look like this

> 1 * 2 * 3 * 4 * 5

we know 5! is 120 so the answer is 

> 120

**In-depth explanation**

```plaintext
re(5)
 |
 +-- re(4)
    |
    +-- re(3)
         |
         +-- re(2)
            |
            +-- re(1)
               |
               +-- 1 (base case)
```

Each level represents a recursive call, and the base case is reached at `re(1)`. The computation then resolves back up the chain.

## Other Key points (things to remember)

### integer division

Dividing two integers will not yield a decimal answer

example:

divide(5)

```java
public static int divide(int n){
    System.out.println(n / 2)
}
```

> 2

The reason java outputs `2` and not `2.5` is because both `n` and 2 are integers and integer division will not convert int's ~> doubles
