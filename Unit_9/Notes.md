# Notes

## Inheritance

There are Parent Classes (Superclasses) that have code that can be **inherited** by a Child Class (Subclass).

**is-a** Relation ship

There is only one super class

anything with ``private`` is not inherited

### Graphical Explanation

Below is a simple diagram to illustrate the inheritance relationship:

```ascii
        Animal (Parent Class)
        +-------------------+
        | - name: String    |
        | + speak(): String |
        +-------------------+
                 ▲
                 |
                 |
        Dog (Child Class)
        +-------------------+
        | + speak(): String |
        +-------------------+
```

- The `Animal` class is the parent class with a `name` attribute and a `speak` method.
- The `Dog` class is the child class that inherits from `Animal` and overrides the `speak` method.
- The arrow represents the inheritance relationship.

## Overriding Methods

Overriding Replaces a Method instead of inheriting it

> **This can only be done with non-static methods**

```java
@Override
public static void doWork(){
    System.out.println("Hello Everyone");
}
```

> This method would override and existing `doWork()` method

## Using `Super()` Keyword

Can call methods that have been overwritten

When dealing with superclasses hard check each instruction ie.

when super.applybreaks is called you should go to the super class then check again where you are.

## Polymorphism

Is witch veriables can be overwriten