# If statements

## Conditionals

| Conditional                | Syntax    |
|----------------------------|-----------|
| Less than                  | `a < b`   |
| Less than or equal to      | `a <= b`  |
| Greater than               | `a > b`   |
| Greater than or equal to   | `a >= b`  |
| Equal to                   | `a == b`  |
| Not equal to               | `a != b`  |
| `if`                   | Specifies a block of code to be executed if a specified condition is true |
| `else`                 | Specifies a block of code to be executed if the same condition is false |
| `else if`              | Specifies a new condition to test if the first condition is false |
| `switch`               | Specifies many alternative blocks of code to be executed |

## Syntax

``` java
if (condition) {
  // block of code to be executed if the condition is true
}
```

## Example

``` java
int x = 20;
int y = 18;
//In this case the statement is "true"
if (x > y) {
    System.out.println("x is greater than y");
} else {
    System.out.println("y is greater than x")
}
```

> x is greater than y

## Logical Operators in Java: `&&` and `||`

In Java, `&&` and `||` are logical operators used to combine Boolean expressions:

### `&&` (Logical AND)
- The `&&` operator returns `true` only if **both** operands are `true`.
- If either operand is `false`, the result is `false`.
- Java uses **short-circuit evaluation** with `&&`. This means that if the first operand is `false`, Java will not evaluate the second operand because the overall result is guaranteed to be `false`.

**Example**:
```java
boolean a = true;
boolean b = false;

if (a && b) {
    System.out.println("Both are true");
} else {
    System.out.println("One or both are false");
}
```

> One or both are false

### `||` (Logical OR)

```java
boolean a = true;
boolean b = false;

if (a || b) {
    System.out.println("At least one is true");
} else {
    System.out.println("Both are false");
}
```

> At least one is true
