# Unit 4

## Question 1

What is output to the screen by the following code?

```java
int f = 0
while (f < 7){
  System.out.print(f % 3 + " ")
  f++;
}
```

> 0 1 2 0 1 2 0

### Explanation

The reason for this is because the while loop starts at 0 and goes until 6 **(x < 7 would go to 6)** standard output returns the mode of `f` by `3`

## Question 2

Assuming that `str` is a correctly initialized String, which of the following best describes what the algorithm below does?

```java
int i = str.indexOf("a");
while (i !=  -1){
  System.out.print(str.substring(0,i));
  str = str.substring(i + 1);
  i = str.indexOf("a");
}

System.out.print(str);
```

> Prints each character in the string, `str`, except for the lowercase `a`'s

### Explanation

The code above stops the output of `a`'s in the string by finding where the next `a` occurs and then only print the characters before and then updating the target string two one character above the `a` effectively removing it from standard output.

## Question 3

What is output by the following code?

```java
String str1 = "abcd";
String str2 = "efghi";
int i = 0;
int j = str2.length() - 1;
while (i < str1.length()){
  System.out.print(str2.substring(j, j + 1));
  System.out.print(str1.substring(i, i + 1));

  i++;
  j--;
}
```

> iahbgcfd

### Explanation

What this code does is set pointers for the start of `str1` and the end of `str2`. In the while loop the character the matches the specific pointers is printed and the code will wither add or subtract to reach the next value.

## Question 4 *(Review!!)*

Which of the following statements will return a random **even** number between 6 and 14 inclusive?

> `6 + 2 * (int) (5 * Math.random())`

### Explanation

The expression `6 + 2 * (int) (5 * Math.random())` generates a random even number between 6 and 14 inclusive.

1. `Math.random()` generates a random double between 0.0 (inclusive) and 1.0 (exclusive).
2. Multiplying by 5 scales this to a range of 0.0 to 5.0.
3. Casting to `(int)` truncates the decimal, resulting in an integer between 0 and 4.
4. Multiplying by 2 gives an even number between 0 and 8.
5. Adding 6 shifts the range to between 6 and 14.

Thus, the expression ensures that the result is always an even number within the specified range.

## Unit 5

Choose which three values should replace the blanks in the four loop so that it loops through the numbers: 1 3 5 7 9.

Note that the choices will fill in the three blanks in the order which they appear.

```java
for (int i = ___; i ___; i ___ ){
  System.out.print(i + " ");
}
```

> 1, < 10, += 2

### Explanation

To get the output of `1 3 5 7 9` you need to get all three areas correct:

1. The Reason why the first section is `1` is because the i needs to start at one in order for the program to print `1` at the start.

2. The reason why the second section is `< 10` is because the maximum number needs to be `9`

3. Lastly the third section is `+= 2` because the numbers in the output increment by `2`

## Question 6

What does short circuit evaluation mean in the following code?

```java
if (a < b && c != d){
  System.out.print("True");
}
```

> if `a < b` is `false`, then `c != d` is not evaluated

### Explanation

A short circuit wold stop the program if `a`  **is not** less than `b`. This is because the `&&` requires **both** parameters to be true and if one is false the statement will not be true. **This was discussed in unit 3**

## Question 7

Consider the following code segment:

```java
int a = 20;
while (/*missing condition*/){
  System.out.println("a = " + a);
  a = a + 3
}
```

For which of the following replacements for `/* missing condition */` will hte segment result in an infinite loop (the code will continue running and never stop)?

> `a >= 20`

### Explanation

This is because in and before the while loop `a` will **always** be grater than or equal to `20`

**This one is tricky be careful!!**

## Question 8

Which of the following code segments will print all the multiples of 5 between 1 and 50 inclusive? The numbers may be printed in ascending or descending order.

I.

```java
for (int k = 50; k > 0; k--){
  if ((k % 5) == 0){
    System.out.println(k);
  }
}
```

II.

```java
for (int k = 5; k <= 50; k += 5){
  System.out.println(k);
}
```

III.

```java
for (int k = 50; k >= 0; k -= 5){
  System.out.println(k);
}
```

> I and II only

## Explanation 

both I and II work but they both use different ways to accomplish the same goal.

1. Uses an if statement to only print the number if its devisable by 5 (This will cause each number to go down by 5). This will work but the if statement is very expensive.

2. Counts incrementally by 5 from 5 accomplishing the same task without computation.

3. Is wrong because it will also print `0` this is not a valid output and is caused by `k >= 0` if the code was changed to `k > 0` it would be fine.


## Question 9 *(Review!!)*

Assume that `x` and `y` are boolean variables and have been properly initialized.

``(x && y) || !(x || !y)``

Which of the following best describes the result of evaluating teh expression above?

> true only when y is true

### Explanation 

| `x` | `y` | `(x && y)` | `!x` | `!y` | `(!x \|\|  !y)` |
|-----|-----|------------|------|------|--------------|
| ✅  | ✅  | ✅          | ❌   | ❌   | ❌           |
| ✅  | ❌  | ❌          | ❌   | ✅   | ✅           |
| ❌  | ✅  | ❌          | ✅   | ❌   | ❌           |
| ❌  | ❌  | ❌          | ✅   | ✅   | ✅           |

## Question 10

Cosider the following output.

```ascii
4321
321
21
1
```

Which of the following code segments will produce this output?

```java
for (int j = 4; j > 0; j--){
  for (int k = j; k > 0; k--){
    System.out.println(k + " ");
  }
  System.out.println();
}
```

> 4 3 2 1
>
> 3 2 1
>
> 2 1
>
> 1

```java
for (int j = 1; j <= 4; j++){
  for (int k = 1; k <= j; k++){
    System.out.println(k + " ");
  }
  System.out.println();
}
```

> 1
>
> 1 2
>
> 1 2 3
>
> 1 2 3 4

```java
for (int j = 4; j > 0; j--){
  for (int k = j; k <= j; k++){
    System.out.println(k + " ");
  }
  System.out.println();
}
```

> 4
>
> 3
>
> 2
>
> 1

```java
for (int j = 1; j <= 4; j++){
  for (int k = j; k > 0; k--){
    System.out.println(k + " ");
  }
  System.out.println();
}
```

> 1
>
> 2 1
>
> 3 2 1
>
> 4 3 2 1

```java
for (int j = 4; j > 0; j--){
  for (int k = 1; k <= j; k++){
    System.out.println(k + " ");
  }
  System.out.println();
}
```

> 1 2 3 4
>
> 1 2 3
>
> 1 2
>
> 1

# Answer

> for (int j = 4; j > 0; j--){
>
>  for (int k = j; k > 0; k--){
>
>    System.out.println(k + " ");
>
>  }
>
>  System.out.println();
>
>}

### Explanation

The reason the first code segments works is because it correctly uses nested loops to print the numbers in descending order. The outer loop starts from 4 and decrements to 1, while the inner loop starts from the current value of the outer loop and decrements to 1, printing each number followed by a space. After the inner loop completes, a newline is printed to move to the next line of output.
