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

| A     | B     | A && B |
|-------|-------|--------|
| ✅ true  | ✅ true  | ✅ true   |
| ✅ true  | ❌ false | ❌ false  |
| ❌ false | ✅ true  | ❌ false  |
| ❌ false | ❌ false | ❌ false  |

### OR Operator (`||`)

| A     | B     | A \|\| B |
|-------|-------|--------|
| ✅ true  | ✅ true  | ✅ true   |
| ✅ true  | ❌ false | ✅ true   |
| ❌ false | ✅ true  | ✅ true   |
| ❌ false | ❌ false | ❌ false  |

### NOT Operator (`!`)

| A     | !A     |
|-------|-------|
| ✅ true  | ❌ false |
| ❌ false | ✅ true  |

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
