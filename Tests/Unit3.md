# Unit 3 Exam

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

### Explination

The reason this both pieces of code perform the same operations is because the ranges for each of the values are the same.

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

## Question 6

## Question 7

## Question 8

## Question 9

## Question 10

## Question 11

## Question 12

## Question 13

## Question 14

## Question 15

## Question 16

## Question 17

## Question 18

## Question 19

## Question 20
