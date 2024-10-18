# Concatenation

To concatenate a string in Java you can use a ``+``.

Example:

```java
String h = "Hello";
h += "World";
System.out.println(h);
```

> HelloWorld

## Parentheses

When wanting to output numbers as a string and completed additon you can use ``()``.

Example:

```java
int x = 5;
int y = 3;
System.out.println("The sum is: " + x + y);
```

> The sum is: 53

```java
System.out.println("The sum is: " + (x + y));
```

> The sum is: 8

The reason the output is ``The sum is: 53`` is because of the way Java allocates memory. Once it starts working with Strings, it continues to look at things as Strings. An as seen in the example above all you need to add is ``()`` to fix this issue.

## Escape Sequences

Escape Sequences can be used to add "special" output to a string.

Example:

```java
System.out.print("Hello World\n-Your Computer");
```

> Hello World  
> -Your Computer

List of Escape Sequences
| Escape Sequence | Description                               | Example Usage               | Output                              |
|-----------------|-------------------------------------------|-----------------------------|-------------------------------------|
| `\"`            | Literal double quote                      | `"She said, \"Hello!\""`    | She said, "Hello!"                 |
| `\'`            | Literal single quote                      | `"It\'s a nice day"`        | It's a nice day                    |
| `\\`            | Literal backslash                         | `"This is a backslash: \\ "`| This is a backslash: \             |
| `\n`            | New line                                  | `"First line\nSecond line"` | `First line<br>Second line`         |
| `\t`            | Tab                                       | `"Name:\tJohn"`             | Name:    John                      |
| `\b`            | Backspace                                 | `"abc\b"`                   | ab (the 'c' is erased)             |
| `\r`            | Carriage return (overwrites from start)   | `"Hello\rWorld"`            | World (overwrites "Hello")         |
| `\f`            | Form feed (advances to the next page)     | `"Page 1\fPage 2"`          | Page 1 (new page) Page 2           |
| `\uXXXX`        | Unicode character                         | `"\u0041"` (for 'A')        | A                                  |
| `\0`            | Null character                            | `"\0"`                      | (Invisible, represents null)       |
| `\v`            | Vertical tab (not universally supported)  | `"First\vSecond"`           | First (vertical space) Second      |
| `\xhh`          | Hexadecimal escape sequence               | `"\x41"`                    | A                                  |
