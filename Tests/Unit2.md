# Unit 2 Exam

## INDEX

| Question Number    | Question Title                                         |
|--------------------|--------------------------------------------------------|
| [1](#question-1)   | What is the object of the Lego class type?             |
| [2](#question-2)   | How to indicate a new comment?                         |
| [3](#question-3)   | **What happens with checking account objects?**        |
| [4](#question-4)   | What is the output of a specific code segment?         |
| [5](#question-5)   | How to print the third character of a string?          |
| [6](#question-6)   | How to call a non-static method?                       |
| [7](#question-7)   | What is a valid constructor signature?                 |
| [8](#question-8)   | What is the value of `num` after execution?            |
| [9](#question-9)   | What does the given string manipulation output?        |
| [10](#question-10) | **Which is a call to a static method?**                |
| [11](#question-11) | What is printed by the Integer max method?             |
| [12](#question-12) | What is the result of the absolute value operation?    |
| [13](#question-13) | What matches the method signature?                     |
| [14](#question-14) | What is the output of string comparison?               |
| [15](#question-15) | Describe the return type and parameters of compare.    |
| [16](#question-16) | **How to generate random numbers in a range?**         |
| [17](#question-17) | Which constructor call will not compile?               |
| [18](#question-18) | What is the output of indexOf with substrings?         |
| [19](#question-19) | What does the double casting output?                   |
| [20](#question-20) | What is the output of a basic arithmetic operation?    |

> NOTE!: **Review the bolded questions**

## Question 1

Consider the following declaration

`Lego newBlock = new Lego();`

Which of the following best describes the situation?

> newBlock is an object fo the Lego class type

### Explanation

```java
Circle c = new Circle();
^     ^     ^       ^
|     |     |       |
|     |     |       +--- 4. Call the Constructor
|     |     +----------- 3. new is used to create an object
|     +----------------- 2. Variable Name
+----------------------- 1. Call the Class
```

## Question 2

Which of the following is used to indicate a new comment?

- [ ] `\"`
- [ ] `\t`
- [x] `//`
- [ ] `\'`
- [ ] `\n`

> This is pretty self explanatory

## Question 3

Assume that Back is a class that creates a checking account object. By default, the money stored wil be 100 dollars. Also assume that withdrawMoney() is a void method that will update the balance by subtracting 50 dollars toi the current money stored.

```java
Bank checkingAccount1 = new Bank();
Bank checkingAccount2 = checkingAccount1();

checkingAccount1.withdrawMoney();
```

What is true about checkingAccount1 and checkingAccount2

> The value of both checkingAccount1 and checkingAccount2 loses the 50 dollars because checkingAccount2 and checkingAccount1 both point to the same object

### Explanation

This is because typical Class Types are **mutable** and will be changed because they point at the same **memory location** where the `checkingAccount1()` is stored.

## Question 4

Whats is the output if the following code segment?

```java
int y = 15;
int x = 5;
System.out.println("Answer: " + (x + 10) + y);
```

> Answer: 1515

### Explanation

The reason the out put is `Answer: 1515` is beacuse there are 'three combined strings' the first being `"Answer:` the second `(x + 10)` and the third `y`. These strings are combined and printed to `System.out`.

## Question 5

Consider the following code:

```java
String str = "Java";
```

Which of the following statements correctly prints the third character in the String `str`

> `System.out.println(str.substring(3,3));`

### Explanation

The reason this prints the third character is because it starts at the 2 character (including 0) and ends at the very next (keep in mind the last  )

```java
String:  J   a   v   a
         0   1   2   3

Method Call: str.substring(2, 3)
                           ^  ^
                           |  |
                           |  End Index:    3 (exclusive: this number will be included)
                            Start Index:  2 (inclusive: this number will not be included)

Result: "v"
```

## Question 6

The class Computer contains a non-static void method named troubleShoot with a parameter that contains one String argument. Suppose a Computer object mac has been declared as follows:

```java
Computer mac = new Computer();
```

> `mac.troubleShoot("on");`

### Explanation

This is because `troubleShoot` is the non-static void method and `mac` has been defined already from the `Computer()` class.

## Question 7

Which of the following could be the signature of a constructor from a class named `Subject`

> `Subject(String x)`

### Explanation

A signature of a constructor from a class basically means the Class and method have the same name and can be initialized with one signature.

```java
public class MyClass {
    private int value;

    // Constructor with an integer parameter
    public MyClass(int value) {
        this.value = value; // Initialize the instance variable
    }

    // Method to display the value
    public void display() {
        System.out.println("Value: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass(1); // Calls the constructor with 1
        myObject.display(); // Calls the method to display the value
    }
}
```

For the example above the constructor signature would be:
> `MyClass(1);`

Also keep in mind a constructor is used to:

**Initialize an object when it is created. It sets up the initial state of the object.**

And a method is used to:

**Define behavior or functionality that can be performed on an object after it has been created.**

## Question 8

What is stored in the variable num after the following code is executed?

```java
int num = Math.pow(3,2) + 2;
```

> Error: possible loss of precision

### Explanation

This is because `Math.pow()` outputs a double and the code above tries to store it as a `int`

## Question 9

What is printed by the following code?

```java
String a = "Wallet";
String b = a;
a = b.toUpperCase();
System.out.println(b + a);
```

> WalletWALLET

### Explanation

This is pretty simple just keep in mind strings are immutable

## Question 10

Which of the following is a call to a static method?

> `Math.sqrt();`

### Explanation

The definition of a static method is:

A static method in Java is a method that belongs to the class rather than any specific instance and can be called without creating an object of the class. It is defined with the static keyword and can only access static variables and methods directly.

**`Think of it as a function in python`**

## Question 11

What is printed by the follwing code segment?

```java
Integer x = 1500;
int y = x + 50;
System.out.println(x.max(x,y));
```

> 1550

### Explanation

This is because `y` equals `1550` because it is equal to `50 + 1500` because `x = 1550`. All the `.max` method does is print the highest value. Which in this case is `1550`.

## Question 12

Consider the following code:

```java
double x = -67.6;
System.out.println(Math.abs(x)-5)
```

> 62.6

### Explanation

This is a problem of simple arithmetic and is comprised of two parts. The first turns `-67.6` into `67.6`. The Second part performs subtraction by 5. Converting `67.6` into `62.6`.

## Question 13

Suppose a method has a return type of `Double`, the name `firstMethod` and a parameter list of `int num, String word`(in that order). Which of the following methods described below has the same signature as this method?

> return type: `int`, name: `firstMethod`, parameter list: `int num, String word`

### Explanation

**!!!NEED TO MAKE!!!**

## Question 14

What is the output by the following code segment?

```java
String a = "java";
String b = "guava";
System.out.println(a.compareTo(b))
```

> 3

### Explanation

```java
compareTo Method

public int compareTo(T obj)

Functionality:
- Compares this object with the specified object for order.
- Returns:
  - A negative integer if this object is less than the specified object.
  - Zero if this object is equal to the specified object.
  - A positive integer if this object is greater than the specified object.

Example Usage:

String str1 = "apple";
String str2 = "banana";

int result = str1.compareTo(str2);

Comparison Process:
  str1:  a  p  p  l  e
          0  1  2  3  4
  str2:  b  a  n  a  n  a
          0  1  2  3  4  5

Steps:
1. Compare characters at index 0:
   - 'a' (str1) vs. 'b' (str2) -> 'a' < 'b' -> return negative value

Result:
- result < 0 (indicating str1 is less than str2)
```

## Question 15

Which of the following describes the return type and parameters of the Integer method compare?

> Return type: int. Parameters: two Integer parameters

### Explanation

**The answers should be inferred from the question.**

## Question 16

Which of the following correctly gives random numbers between -5 and 0 inclusive?

> `int n = (int)(Math.random() * 6) - 5;`

### Explanation

random numbers with in a range can be created with:

```java
(ran * range) + min;
```

> `ran` is `Math.random()`
>
> `range` is **The range of numbers you want**
>
> `min` is **The smallest number you want**

## Question 17

The image below shows the Java doc for all constructors of a class named Shoe.

![image](https://github.com/user-attachments/assets/73869991-3d18-4d3d-a0ef-270c4f5a18b1)


Which of the following constructor calls will NOT compile correctly?

> `Shoe Nikes = new Shoe("11", true);`

### Explanation

The Shoe constructor only accepts and integer and boolean value and "11" is a string so it becomes an error

## Question 18

Consider the following code:

```java
String language1 = "java";
String language2 = "javascript";
System.out.println(language2.indexOf(language1.substring(1,4)));
```

> 1

### Explanation

First `language1.substring()` takes the letters from `java` and cuts them to `ava`. Then `language2.indexOf()` finds where `ava` and `javascript` match. Which would be `1`

```java
String: "java"
-------------------
Index:  0  1  2  3
         j  a  v  a

String: "javascript"
------------------------
Index:  0  1  2  3  4  5  6  7  8  9
         j  a  v  a  s  c  r  i  p  t

indexOf()

at 1 ava and javascript are the same
```

## Question 19

What is the output?

```java
System.out.println("the answer is:" + (double)(5 * 6))
```

> The answer is: 30.0

## Question 20

Consider the following code:

```java
int x = 3;
int y = 2;
System.out.println((x + y) * x);
```

> 15
