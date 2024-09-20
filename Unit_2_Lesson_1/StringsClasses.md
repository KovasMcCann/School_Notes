# Strings and Classes

## Primitive and Class Data Types

There are two data types in java Primitive and Class Types

### Primitive

Primitive data types only hold one piece of data at a time.

When you create(Declare) a Primitive Data Type Java creates a space in memory and stores the data there. This is the same location were the variable name is stored.

### Class

When you create a Class Data Type Java allocates a space in memory called a **reference** a reference only shows were that data is stored. This could help with large data types

## NULL

If you want a data type to be blank you can use NULL to set a class to blank.

```java
String a = null;
```

## Immutable Objects

Immutable Objects are objects whose state cannot be modified after they are created in Java.

### Strings
This allows for things like:

```java

String name = "Bob";

String Helper = name;

String name = "Rick";

System.out.println(name + Helper); //Will output Bob Rick
```

You can also use ``final`` to state an object can't be changed

```java
final String name = "KovasMcCann";
name = "Kovas...";
System.out.println(name);
```
> KovasMcCann

### Classes 

```java
class Money {
    private final double amount;
    private final Currency currency;

    // ...
}
```

#### Using ``this.``

``this.`` can be used for 

- clarify that you are talking about a field, when there's also something else with the same name as a field
- refer to the current object as a whole
- invoke other constructors of the current class in your constructor

```java
class Money {
    // ...
    public Money(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }
}
```

This allows you to keep the imutable strings while not creating any confilicts.
