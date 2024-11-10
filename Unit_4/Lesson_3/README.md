# For Loop Basics

A `for` loop is one of the most commonly used looping structures in programming, especially when you know the exact number of iterations you want to perform. It allows you to initialize a loop control variable, specify a condition for the loop to continue, and define how the control variable should change after each iteration.

## Example of a Basic For Loop

Here’s an example of a simple `for` loop in Java that prints numbers from 0 to 9:

```java
for (int i = 0; i < 10; i++) {
  System.out.print(i + " ");
}
```

> 0 1 2 3 4 5 6 7 8 9

## Key Parts of the For Loop Header

A `for` loop header consists of three essential components that define the loop's behavior:

1. **Initialization** (`i = 0`):  
   This part runs only once, setting up the loop control variable. It is where you specify the starting value of the variable that will control the loop. Typically, this is where you declare and initialize the variable (e.g., `int i = 0`).

2. **Condition** (`i < 10`):  
   The loop continues to run as long as this condition evaluates to `true`. This condition is checked before each iteration. If it becomes `false`, the loop stops. The condition usually involves the loop control variable and defines when to terminate the loop (e.g., `i < 10`).

3. **Update** (`i++`):  
   After each iteration, this step is executed. It modifies the loop control variable to prepare for the next iteration. Most commonly, you'll increment or decrement the variable, but other updates can also be used (e.g., `i++`, `i += 2`, or `i--`).

These three parts work together to determine how many times the loop will run, and they are all specified in the `for` loop header, making it a compact and readable structure.

---

## When to Use a For Loop

A `for` loop is ideal in situations where:
- **You know the exact number of iterations**: This is a good fit for problems where you can easily determine how many times the loop needs to execute (e.g., counting from 1 to 100, processing items in an array).
- **You are iterating over a sequence or collection**: When you need to iterate through elements with indices, like the elements of an array or the characters of a string, a `for` loop is an efficient choice.
- **Counting or indexed iteration**: `For` loops are great for counting or performing tasks based on a specific index, like printing the elements of a list or calculating the sum of an array's elements.

---

## Avoiding Out-of-Bounds Errors

When working with a `for` loop that accesses elements in a collection (e.g., an array or a string), it's important to ensure the loop doesn't exceed the valid indices of the collection. Here's how to avoid out-of-bounds errors:

- **Check the collection’s length**: Always ensure your loop’s condition is based on the correct length or bounds of the collection. For example, in the case of a string, you can use the `.length()` method to get the correct length.
  
```java
  String str = "hey";
  for (int i = 0; i < str.length(); i++) {
    System.out.println(str.substring(i, i + 1));
  }
```