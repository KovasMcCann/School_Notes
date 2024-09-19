# Constructors

Constructors are special methods used to initialize new objects. When an object of a class is created, the constructor is called to set initial values for its attributes.

Constructors are defined within a class, and their primary role is to initialize the instance variables (data) of that class.

Behavior: Constructors can have different forms:

- **Default Constructor**: Initializes object attributes to default values.
- **Parameterized** Constructor: Accepts parameters to set specific values for the object at the time of creation

> See [ConstructorExample.java](ConstructorExample.java) for an example.

## Using Shapes

### Imports

You can import packages with the ``import`` class

```java
import shapes.*
```

> This line imports all classes from the shapes package which you just added (the * is a wildcard which means import every class in the package).

### Code

```java
Rectangle r1 = new Rectangle();
Rectangle r2 = new Rectangle(4.2);
Rectangle r3 = new Rectangle(1.8, 2.5);
System.out.println("r1: " + r1 + "\nr2: " + r2 + "\nr3: " + r3);
```

> r1: rectangle with length 1.0, width 1.0
>
> r2: rectangle with length 4.2, width 4.2
>
> r3: rectangle with length 1.8, width 2.5
