# Unit 1 Exam

`NOTE: Unlike the other Exam guides this one was created with ChatGPT and may not be accurate.`

## Index

1. [Question 1](#Question 1)
2. [Question 2](#Question 2)
3. [Question 3](#Question 3)
4. [Question 4](#Question 4)
5. [Question 5](#Question 5)
6. [Question 6](#Question 6)
7. [Question 7](#Question 7)
8. [Question 8](#Question 8)
9. [Question 9](#Question 9)
10. [Question 10](#Question 10)
11. [Question 11](#Question 11)
12. [Question 12](#Question 12)
13. [Question 13](#Question 13)
14. [Question 14](#Question 14)
15. [Question 15](#Question 15)
16. [Question 16](#Question 16)
17. [Question 17](#Question 17)
18. [Question 18](#Question 18)
19. [Question 19](#Question 19)
20. [Question 20](#Question 20)

---

### Question 1

**Question:** Assuming that `scan` is a properly initialized `Scanner` variable, which of the following correctly inputs a double?

> **Correct Answer:** `double val = scan.nextDouble();`

**Explanation:**  
`nextDouble()` is the method that reads a double value from the input. The other options either use incorrect method names or attempt to store non-double types into a double variable.

---

### Question 2

**Question:** Consider the following code:

```java
int x = -5;
x++;
System.out.println(x);
```

What is output?

> **Correct Answer:** `-4`

**Explanation:**  
The `x++` increments the value of `x` by 1, changing it from -5 to -4.

---

### Question 3

**Question:** Which of the following data types would be most appropriate to use when recording the answer to a yes or no question?

> **Correct Answer:** `boolean`

**Explanation:**  
A boolean data type can represent two values: `true` (yes) or `false` (no).

---

### Question 4

**Question:** Which of the following is not a primitive data type?

> **Correct Answer:** `String`

**Explanation:**  
`String` is a reference type, not a primitive type. Primitive types in Java include `int`, `double`, and `boolean`.

---

### Question 5

**Question:** What is output by the following code?

```java
int a = 11;
System.out.println(a / 2);
```

> **Correct Answer:** `5`

**Explanation:**  
In integer division, the decimal part is truncated. Thus, `11 / 2` results in `5`.

---

### Question 6

**Question:** Which of the following is a legal variable name in Java?

> **Correct Answer:** `nameOne`

**Explanation:**  
Variable names in Java must begin with a letter, underscore, or dollar sign and can contain letters, digits, underscores, or dollar signs.

---

### Question 7

**Question:** What is `(19 % 7) * 2`?

> **Correct Answer:** `10` ```

**Explanation:**  
Calculating the modulus first: `19 % 7` gives `5`, then multiplying by `2` results in `10`.

---

### Question 8

**Question:** Which of the following would properly create `A` and `B` as double variables?

> **Correct Answer:** `double A; double B;`

**Explanation:**  
This is the correct syntax to declare two double variables in Java.

---

### Question 9

**Question:** Which of the following correctly stores the word "Ford" in a variable called `car`?

> **Correct Answer:** `String car = "Ford";`

**Explanation:**  
This syntax correctly declares a string variable named `car` and assigns it the value "Ford".

---

### Question 10

**Question:** Consider the following code:

```java
int c = 10 - 55 % 2; 
System.out.println(c);
```

What is output?

> **Correct Answer:** `9`

**Explanation:**  
Following the order of operations, `55 % 2` equals `1`, so `10 - 1` results in `9`.

---

### Question 11

**Question:** Consider the following code:

```java
int x = 10;
int y = 3;
System.out.println((x * y) / x);
```

What is output?

> **Correct Answer:** `3`

**Explanation:**  
The expression simplifies to `y` since `(x * y) / x` equals `y`.

---

### Question 12

**Question:** Consider the following variable declaration:

```java
double number = 23;
```

Does a cast need to be added so this code will compile and run successfully?

> **Correct Answer:** `no, nothing`

**Explanation:**  
The assignment of an integer to a double variable is valid in Java without casting.

---

### Question 13

**Question:** For which of the following would modular division be useful?

> **Correct Answer:** `All choices are correct`

**Explanation:**  
Modular division can be used for various purposes, including determining even/odd numbers and extracting digits.

---

### Question 14

**Question:** What is a potential problem with the following code?

```java
System.out.println("Please enter two integers: ");
int a = scan.nextInt();
int b = scan.nextInt();
System.out.println("The average is: " + (a + b) / 2);
```

> **Correct Answer:** `It needs a cast so that the decimal portion will be shown.`

**Explanation:**  
If you want the average to be a double, you need to cast the sum to double before dividing.

---

### Question 15

**Question:** What is output by the following code?

```java
int num = 0;
num++;
num++;
num++;
num++;
num--;
num++;
num--;
num--;
num++;
System.out.println(num);
```

> **Correct Answer:** `3`

**Explanation:**  
The sequence has 6 increments and 3 decrements: `0 + 6 - 3 = 3`.

---

### Question 16

**Question:** What is the value of `num` after executing this segment of code?

```java
int num = 21;
num += 72;
```

> **Correct Answer:** `93`

**Explanation:**  
The operation `num += 72` adds `72` to `21`, resulting in `93`.

---

### Question 17

**Question:** When might you encounter a problem with integer overflow?

> **Correct Answer:** `When trying to store an integer which is too big to be stored in an int variable`

**Explanation:**  
This leads to an overflow error, causing the value to wrap around.

---

### Question 18

**Question:** If in the program, we increase the number of hours by one, which of the following lines of code will correctly update `days` and `hours`?

> **Correct Answer:** `days = days + hours / 24; hours = hours % 24;`

**Explanation:**  
This correctly adjusts `days` and resets `hours` when necessary.

---

### Question 19

**Question:** Correct the following code so that `p` stores the nearest integer below `43.92`.

> **Correct Answer:** `int p = (int) 43.92;`

**Explanation:**  
Casting to `int` will truncate the decimal, giving you `43`.

---

### Question 20

**Question:** Which of the following will print the tens column of an integer stored in `x`?

> **Correct Answer:** `System.out.print(x / 10 % 10);`

**Explanation:**  
Dividing by `10` removes the ones digit, and the modulus `10` operation gives the tens digit.

---
