# Unit 3 Exam

## Index

| Question Number  | Description                                                                                   |
|------------------|-----------------------------------------------------------------------------------------------|
| [1](#question-1) | Compares two conditional statements that evaluate ranges for output based on a grade value.   |
| [2](#question-2) | Evaluates a series of conditional checks on an integer variable and determines the output.    |
| [3](#question-3) | Analyzes an if statement checking snowfall against defined thresholds.                        |
| [4](#question-4) | Matches a truth table to a boolean condition, focusing on logical OR operations.              |
| [5](#question-5) | Evaluates a boolean expression for exclusivity between two boolean variables.                 |
| [6](#question-6) | Transforms a negated condition into an equivalent form for clarity.                           |
| [7](#question-7) | Outputs based on two boolean variables, showcasing multiple conditions.                       |
| [8](#question-8) | **Transforms a complex boolean expression into a simpler equivalent form.**                   |
| [9](#question-9) | Evaluates a boolean expression that is always true, no matter the input.                      |
| [10](#question-10)| **Discusses object reference comparison in Java and its output based on memory addresses.**  |
| [11](#question-11)| **Evaluates integer operations in conditional statements leading to a specific output.**     |
| [12](#question-12)| **Identifies potential replacements that ensure a certain output in a conditional check.**   |
| [13](#question-13)| Reformulates a customer count condition into nested if statements for clarity.               | 
| [14](#question-14)| Matches a truth table to a simplified boolean expression reflecting logical operations.      |
| [15](#question-15)| Tests a grade range using appropriate conditional operators to check for a specific range.   |
| [16](#question-16)| Evaluates a boolean expression that is guaranteed to be true, reinforcing logical consistency.|
| [17](#question-17)| Explains short circuit evaluation in a boolean expression involving two variables.           |
| [18](#question-18)| Matches a truth table to a boolean condition involving logical operations on two variables.  |
| [19](#question-19)| Transforms a negated boolean condition into a simpler equivalent expression.                 |
| [20](#question-20)| Evaluates a boolean expression that checks the truth of two conditions and their outputs.    |

**Truth Table Examples! :** [link](https://docs.google.com/spreadsheets/d/1RDB3rBd2oTatUZvxorPyOYx6THjnI4G40j-bvkgvc7k/edit?usp=sharing)

## Question 1

```java
if (grade >= 100){
 System.out.println("Great");
}
else if (grade > 75){
  System.out.println("Good");
}
else{
 System.out.println("Eh");
}
```

Which of the following wil always produce the same result as the code above, regardless of the value of grade?

> ```java
> if (num <= 75){
>  System.out.println("Eh");
> }
> else if (num >= 100){
>   System.out.println("Great");
> }
> else{
>   System.out.println("Good");
> ```

### Explanation

The reason for this is because both pieces of code perform the same operations and because the ranges for each of the values are the same.

## Question 2

What is the output of the following code?

```java
int x = 10;
if (x * 3 <= 30){
  x++;
}
if (x > 31){
  x += 4;
}
System.out.println(x);
```

> 11

### Explanation

The reason this question could be tricky is because you have to include the multiplication  **only** inside of the first if statement. Otherwise you just have to systematically go though each operation.

## Question 3

The following if statement test the snowfall in Alaska during the months of December, January and February. Assume low represents a threshold determined to be the least amount of snow required to be normal and high represents a threshold determined to be the most amount of snow required to be normal and snow represents the amount of snow in inches for that month. All variables are doubles.

```java
if (snow > low && snow < high){
  System.out.println("Snowfall amount is normal.")
}
else{
  System.out.println("Snowfall amount is abnormal.")
}
```

It could be replaced with:

> ```java
> if (snow > low){
>   if (snow < high){
>     System.out.println("Snowfall amount is normal.")
> }
> else{
>   System.out.println("Snowfall amount is abnormal.")
> }
> else{
>   System.out.println("Snowfall amount is abnormal.")
> }

### Explanation

Think of this problem as a short circuit implementation. You take the first part of the `&&` statement and perform the check then nested inside the first you conclude if the second part of the `&&` is applicable. If not `True` in both cases the program will output `Snowfall amount is abnormal.`

## Question 4

The following truth table matches which boolean condition?

| A     | B     |        |
|-------|-------|--------|
| ✅ 1  | ✅ 1   | ✅ 1   |
| ✅ 1  | ❌ 0   | ✅ 1   |
| ❌ 0  | ✅ 1   | ✅ 1   |
| ❌ 0  | ❌ 0   | ❌ 0   |

> `A ||(A || B)`

### Explanation

First exclude the first `A` in `A ||(A || B)` because both `A`'s cancel out.

Then, the problem becomes a simple boolean condition of `A || B`.

## Question 5

Consider the following expression. Assume that x and y are properly initialized boolean variables.

```java
(x || y) && !(x && y)
```

The result of evaluating is best described as:

> true only when x and y have different values

## Explanation

`(x || y) && !(x && y)` checks if at least `x` or `y` is true with `(x || y)`. Then it Checks if they aren't the same with `(x && y)`.

## Question 6

Consider the following code fragment, assume val is an int:

```java
if(!(val != 50 && val >= 0))
```

Which of the following code fragments would have the same effect?

> `if( val == 50 || val < 0)`

## Explanation

Keep in mind the question includes a `!` at the start making it confusing.

## Question 7

Assume that x and y are boolean variables and have been properly initialized.

```java
if (!(x || y) || (x && y)){ // both FALSE and both TRUE
  System.out.print("One");
}
if (!((x && y) && (x || y))){ // both are different or FALSE
  System.out.print("Two");
}
else{
  System.out.print("Three"); // both are TRUE
}
```

What will be output if the value of x is true and the value of y is false:

> Two

## Explanation

See comments in code

![image](https://github.com/user-attachments/assets/c13dcf5b-1a8b-4213-b540-84d7358a12eb)


## Question 8

Assume that x and y have been defined  and initialized as int values. The expression

```java
!(!(x <= y) || (y == 5))
```

is equivalent to which of the following?

> `(x <= y) && (y!= 5)`

## Explanation

this checks if __x less than or equal to y__ and __y is not 5__

## Question 9

Assume that x and y are boolean variables and have been properly initialized.

```java
(x || y) || !(x && y)
```

The result of evaluating the expression above is best described as:

> Always true

## Explanation

Always true remember to keep in mind what each function does. The first one `(x || y)` print when a least x or y is true. Then `!(x && y)` prints ture when both are false.

## Question 10

What is output by the following code segment? Assume a Triangle class exists and each triangle is correctly created.

```java
Triangle t1 = new Triangle(5, 6, 7);
Triangle t2 = new Triangle(5, 6, 7);

if (t1 == t2){
  System.out.print("equal")
}
else{
  System.out.print("not equal")
}
```

> not equal

## Explanation

The code above will print `not equal` because they don't refer to the same memory address

## Question 11

What is the output of the following code?

```java
int x = 14;
if ((x * 2) / 3 >= 9){
  x++;
}
if (x <= 15){
  x += 2;
}
System.out.println(x);
```

> 17

## Explanation

The program will print 17 because both if statements are true.

## Question 12

Consider the following incomplete code segment.

```java
int x = /* missing code */;
if (x == 15){
  System.out.println("yes");
}
else{
  System.out.println("no");
}
```

Consider the following potential replacements for `/* missing code */`. Which of these replacements will cause the code segment to always print no

> `(int) (Math.random() * 10) + 5`

## Explanation

Will always return `no` because it will never equal 15

keep in mind this example

```java
answer = (int) (ran * range) + min;
```

## Question 13

The following if statement determines the amount of customers that come in at the Java restaurant. It uses the double variables `low`, `amount` and `high`

```java
if (low < amount && amount < high){
  System.out.println("Amount of customers could be better.");
}
else{
  System.out.println("Amount of customers is great!");
}
```

could be replaced with:

> I only

## Explanation

Keep in mind a number within the range would return `Amount of customers could be better.`

```java
if (amount > low){
  if (amount < high){
    System.out.println("Amount of customers could be better.");
  }
  else{
    System.out.println("Amount of customers is great!");
  }
}
else{
  System.out.println("Amount of customers is great!");
}
```

## Question 14

The following truth table matches which boolean condition?

| A        | B       |           |
|----------|---------|-----------|
| ✅ true  | ✅ true  | ❌ false  |
| ✅ true  | ❌ false | ❌ false  |
| ❌ false | ✅ true  | ✅ true   |
| ❌ false | ❌ false | ❌ false  |

> `!A && (A || B)`

## Explanation

equivalent to `!A && B` which the table reflects

## Question 15

To test if a grade (represented by the variable g) is a D between 69 and 59, including 69 but excluding 59) you would use the following if statement:

```java
if ( g ____ 69 ____ g ____ 59)
```

What set of three symbols correctly fills the blanks in the order they appear?

> `if (g <= 69 && g > 59)`

## Explanation

this is correct because `g` must be lower than or equal to 69 and it must be higher than 59

## Question 16

Consider the following expression. Assume that x and y are properly initialized boolean variables.

```java
(x || y) || !(x && y)
```

The result of evaluating the expression above is best described as:

> always true

## Explanation

Keep in mind of the `||` oporator which will allow it to be allways true.

## Question 17

Consider the code:

```java
if (y == 5 && x * y > 50)
```

Which of the following is an example of short circuit evaluation?

> if `y == 5` is false it doesn't evaluate `x * y > 50`

## Question 18

The following truth table matches which boolean condition?

| A        | B       |           |
|----------|---------|-----------|
| ✅ true  | ✅ true  | ✅ true   |
| ✅ true  | ❌ false | ✅ true   |
| ❌ false | ✅ true  | ✅ true   |
| ❌ false | ❌ false | ❌ false  |

> A || (!A && B)

## Question 19

`!(x >= y && w != 2)` is the same as which boolean expression?

> `x < y || w == 2`

## Question 20

Assume that x and y are boolean variables and have been properly initialized.

```java
(x || y) && (x || y)
```

The result of evaluating the expression above is best described as:

> True when x is true or when y is true
