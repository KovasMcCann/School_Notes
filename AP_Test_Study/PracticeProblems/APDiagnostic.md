# AP Computer Science A Diagnostic Exam

# Question 1

Consider the following code:

```java
int x = 7 + 4;
double y = x / 2;
```

What is outputted by:

```java
System.out.println(y);
```

> 5

## Explanation

In java for a computation to become a double **one number must be a double**

therefore because both numbers being computed are int's it will output 5 and not 5.5

# Question 2

Assuming the following variable declarations have been made: 

```java
double r = Math.random();
int c;
```

Which of the following assigns a value to `c` that is uniformly distributed between -10 <=  c < 10?

> E. (int) (r * 20 - 10)

## Explanation  

Remember the "formula" (int) (r * range +/- start)

# Question 3

Consider the following code:

```java
String s = "ABCDEFG";
```

What is outputted by:

```java
System.out.println(s.substring(s.length() / 2, s.length()))
```

> `DEFG`

## Explanation

Remember that substring() is inclusive for the first parameter but not for the second.

Also remember that two integers will not create a double

# Question 4

In order to place a phone call on a mobile phone, several factors must be in place. The boolean
variable `isOn` and `isRoaming` indicate the state of the phone. The int bars stores the numbers of
bars from 0 to 5, inclusive.

For a call to be made, `isOn` must be true, `isRoaming` must be false, and bars must be greater than 0.

Which of the following code segments correctly sets the boolean variable canCall to true when it is
possible for a call to be made?

Answer:
```java
if (isOn && !isRoaming && bars > 0)
{
    canCall = true;
}
```

## Explanation

Option number two:

```java
if (isOn)
{
canCall = true;
}
if (!isRoaming)
{
canCall = true;
}
if (bars > 0)
{
canCall = true;
}
```

Would not work because if only one of the values where true (not meeting all requirements) it would run

Option number three:

```java
if (isOn || !isRoaming && bars > 0)
{
canCall = true;
}
```

Would not work because only 1 of the two conditions could be meet for it two run

These two conditions are `isOn` and `isRoaming` because of the `||` statement and not a `&&` statement.

# Question 5

Assume that `x` and `y` are boolean variables and have been properly initialized.

```java
(x || y) && !(x || y)
```

The rest of evaluating the expression above is best described as

> Always False

## Explanation

```ascii
        X
    __T___F__
  T|  F | F  |
Y  |---------|
  F|__F_|_F__|
```

Just create a table

# Question 6

Consider the following code segment:

```java
int a = /* value */;
int b = /* value */;
boolean t = ( a >= b);
t = (a != b) && t;
```

Which of the following best describes the conditions under which t is true after the code is executed?


> a > b

## Explanation

Condense the two lines of code into one:

t = (a != b) && ( a >= b)

Then you can create a table or just look and see that the first statement nullifies the equal sign on the second

# Question 7
# Question 8
# Question 9
# Question 10
# Question 11
# Question 12
# Question 13
# Question 14
# Question 15
# Question 16
# Question 17
# Question 18
# Question 19
# Question 20
# Question 21
# Question 22
# Question 23
# Question 24
# Question 25
# Question 26
# Question 27
# Question 28
# Question 29
# Question 30
