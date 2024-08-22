# Variables:
There are different types of variables in java.

## Examples
    String: Stores Text defined by double quotes

    int: Stores Whole numbers

    float: Stores Floating point numbers i.e. 10.343

    char: Stores a single character i.e. 'f'
    
    boolean: True/False


## Printing Variables

To print a variable in java you can use the ``+`` character.

# Casting

Casting is when you need to convert variables(Data types)

There are two ways to cast

* Widening (``byte -> short -> char -> int -> long -> float -> double``) 

* Narrowing (``double -> float -> long -> int -> char -> short -> byte``)

## Widening
Widening is done automatically and can be done with a ``=``.
Example:
```java
double myDouble = myInt 
```

## Narrowing
Narrowing is when you condense the a data type

```java
int myInt = (int) myDouble; \\ This will store a Double(9.9) as an int(9)
```

**Notice** A Double is bigger than a int and therefore needs to be narrowed

## User Input
If you  want to have input to a program you can use a **Scanner**.

To build a Scanner class you first need to import the class with ``import java.util.Scanner;``

Then inside your ``main()`` you can add:

```java
Scanner myObj = new Scanner(System.in);  // Creates a Scanner object
String userName = myObj.nextLine(); // This reads the user input and stores it as a string
System.out.println(userName); //This will print the user input that was stored as userName
```

## Multi User Input

To get multi user input you can use ```nextLine()`` several time
EX:

```java
Scanner Names = new Scanner(System.in); //starts scanner
System.out.println("Enter 4 Names"); //tells user what to do
    
String one = Names.nextLine(); //defines first string to fourth string
String two = Names.nextLine();
String three = Names.nextLine();
String four = Names.nextLine();
    
System.out.printf("\n%4$s %2$s %3$s %1$s", one, two, three, four); //using printf() it formats the data nicely
```

## Formating 
In the code above the printing function is done with ```System.out.printf("\n%4$s %2$s %3$s %1$s", one, two, three, four);``` 

the ```printf()``` is the like the python ```print(f'')``` equivalent

First the strings need to be stored ```('', Stored strings)```

then the strings can be called with ```%1$s``` 1 being the number of string and s being the data type




