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

Assume that x and y are int values. The expression

```java
!(( x >= y) || !( x < y))
```

evaluates to witch of the following?

> when is x is less than y

## Explanation

You can write out the "wording" for the if statement and then check

# Question 8

Consider the following code segment.

```java
double a = 18.4;
double b = .78;

if ( b * (a - 5) != (a * b + b * -5)){
    System.out.println("error");
}
```

Which of the following best describes why "error" would be printed? Remember that
mathematically b(a - 5) = b * a + b * (-5).

> Round Off error

## Explanation

This is because not every double will have the same granularity.

# Question 9

Consider the following code segment.

```java
int x = 20;
while (x < 25)
{
x++;
System.out.println(x);
}
```

> 21, ... , 25

Questions 10 and 11 refer to the following code:

```java
int x = (random number such that) 1 <= x <= n;

for (int i= 1; i <= x; i++){
    for (int j = 1; j <= x; j++){
        System.out.println("Yo");
    }
}
```

# Question 10

What is the minimum number of times "Yo" will be printed?

> 1

## Explanation

This is because they will both equal one and then stop

# Question 11

What is the maximum number of times "Yo" will be printed?

> n^2

## Explanation

This is because it will start at 1 both times and then run

# Question 12

Consider the following code segment.

```java
String stuff = "VWXYZ";

for (int i = 0; i < stuff.length() - 1; i++){
    System.out.print(stuff.substring(i, i + 1));
}
```

What is printed as a result of executing this code segment?

> VWXY

## Explanation

THERE IS NO EQUAL SIGN

This is an important lesson that I need to pay attention will reading the AP test questions

# Question 13

What is output by the following code?

```java
int x = 95;
while (x > 50){
    System.out.print(x % 7 + " ");
    if (x % 2 == 0){
        x -= 10;
    }
    else{
        x--;
    }
}
```

95%7 4 95 - 1
94%7 3 94 - 10
84%7 0 84 - 10

> D

# Question 14

Consider the following code segment.

```java
for (int i = 1; i < n; i++){
    for (int j = 0; j < n; j++){
        System.out.print(i + j + " ");
    }
}
```

What is the output of n = 3

i  j  (i+j)
-----------
1  0| 1
1  1| 2
1  2| 3
2  0| 2
2  1| 3
2  2| 4

> 123234

## Explanation

Remember to look at the equal signs

# Question 15

```java
int x = 4;
int y = 142;

while (x <= y){
    int m = Math.abs(x - y);
    y = y/x;
    System.out.print(m + " ");
}
```

> 138 31 4

# Question 16

Consider the following code segments:

```java
for (int i= 4; i <= 32; i += 4){
    System.out.print(i + " ");
}
```

```java
int x = 0;
while (x < 32){
    x += 4;
    System.out.print(x + " ");
}
```

```java
for (int i = 4; i <= 32; i++){
    System.out.print(i % 4 + " ");
}
```

Which correctly prints the numbers 4, 8, 12,..., 32?

> I and II

## Explanation

3 doesn't work because it returns 0 first

# Question 17

```java
public void test(int maxNum){
    int first = 0;
    int second = 0;
    int third = 0;

    for (int k = 1; k <=maxNum; k++){
        if (k % 2 == 0 && k % 3 == 0){
            first++;
        }
        
        if (k % 2 == 0){
            second++;
        }
       
        if (k % 3 == 0){
            third++;
        }
    }
    System.out.println(first + " " + second + " " + third);
}
```

What is printed as a result of the call test(30)

>  5 15 10

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
