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
