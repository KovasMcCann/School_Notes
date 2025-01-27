# For Loop's in java

There are two different kids of for loops
 - For loop
 - For each loop

## For Loop

```java
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
```

Statement 1 is executed (one time) before the execution of the code block.
Statement 2 defines the condition for executing the code block.
Statement 3 is executed (every time) after the code block has been executed.

- Statement 1
  - executed before the execution of the code block
  - **Typically the starting value** ``i = 0``
- Statement 2
  - Defines the condition to keep the code block running
  - ``i < 5``
- Statement 3
  - Defines what to do after the code is run for each iteration
  - ``i ++``

```java
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
```

## For each loop

A "for-each" loop, is used exclusively to loop through elements in an array (or other data sets).

```java
for (type variableName : arrayName) {
  // code block to be executed
}
```

Here is an example:

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
```

> Volvo
>
> BMW
>
> Ford
>
> Mazda
