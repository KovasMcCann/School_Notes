# Code Tracing

This lesson discusses code tracing, which is like pretending you’re the compiler and writing down what the code would do. This is very important for evaluating code on paper, like you’ll do on the AP test.

## Tracing A While Loop

Consider the following loop. If you were given a question on the AP test that asked you what the first and last numbers printed were, how would you figure that out?

```java
int num = 21;
while (num < 33) {
    System.out.println(num);
    num++;
}
```

A great way to answer questions like this is to make a table that keeps track of the variable and the output:

| num | Printed to screen |
|-----|-------------------|
| 21  | 21                |
| 22  | 22                |
| 23  | 23                |
| 24  | 24                |
| ... | ...               |
| 31  | 31                |
| 32  | 32                |
| 33  |                   |

Answering the question using this method allows us to notice the small differences between the output for the loop above and the loop below, where we increment before we print:

```java
int num = 21;
while (num < 33) {
    num++;
    System.out.println(num);
}
```

| num | Printed to screen |
|-----|-------------------|
| 21  | 22                |
| 22  | 23                |
| 23  | 24                |
| ... | ...               |
| 31  | 32                |
| 32  | 33                |
| 33  |                   |

Finally, consider tracing this loop using the same format:

```java
int num = 13475;
while (num != 0) {
    num = num / 10;
    System.out.println(num);
}
```

| num   | Printed to screen |
|-------|-------------------|
| 13475 | 1347              |
| 1347  | 134               |
| 134   | 13                |
| 13    | 1                 |
| 1     | 0                 |
| 0     |                   |
