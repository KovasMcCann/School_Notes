# Truth Tables in Java

## Introduction

Truth tables are a fundamental concept in logic, used to determine the truth value of logical expressions based on their inputs. In Java, truth tables can help understand the behavior of boolean expressions.

## Basic Logical Operators

Java supports several logical operators:

- `&&` (AND)
- `||` (OR)
- `!` (NOT)

## Example Truth Tables

### AND Operator (`&&`)

| A     | B     | A && B          |
|-------|-------|-----------------|
| <span style="color: green;">true</span>  | <span style="color: green;">true</span>  | <span style="color: green;">true</span>   |
| <span style="color: green;">true</span>  | <span style="color: red;">false</span> | <span style="color: red;">false</span>  |
| <span style="color: red;">false</span> | <span style="color: green;">true</span>  | <span style="color: red;">false</span>  |
| <span style="color: red;">false</span> | <span style="color: red;">false</span> | <span style="color: red;">false</span>  |

### OR Operator (`||`)

| A     | B     | A \|\| B        |
|-------|-------|-----------------|
| <span style="color: green;">true</span>  | <span style="color: green;">true</span>  | <span style="color: green;">true</span>   |
| <span style="color: green;">true</span>  | <span style="color: red;">false</span> | <span style="color: green;">true</span>   |
| <span style="color: red;">false</span> | <span style="color: green;">true</span>  | <span style="color: green;">true</span>   |
| <span style="color: red;">false</span> | <span style="color: red;">false</span> | <span style="color: red;">false</span>  |

### NOT Operator (`!`)

| A     | !A               |
|-------|------------------|
| <span style="color: green;">true</span>  | <span style="color: red;">false</span> |
| <span style="color: red;">false</span> | <span style="color: green;">true</span>  |


## Usage in Java

```java
public class TruthTableExample {
    public static void main(String[] args) {
        boolean A = true;
        boolean B = false;

        System.out.println("A && B: " + (A && B)); // false
        System.out.println("A || B: " + (A || B)); // true
        System.out.println("!A: " + (!A));         // false
    }
}
```
