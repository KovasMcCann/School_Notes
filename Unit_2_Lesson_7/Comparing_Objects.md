# Comparing Objects

Comparing two objects can be done with `==`

```java
int a = 20;
int b = 20;

if (a == b)
{
  System.out.println("same");
}
```

> same

## class data types

| Example 1 (Incorrect)                                                                                | Example 2 (Correct)                                                                                  |
|------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------|
| `String a = new String("Howdy");`<br />`String b = new String("Howdy");`<br />`if (a == b) {`<br />&nbsp;&nbsp;`System.out.println("same");`<br />`}` | `String a = new String("Howdy");`<br />`String b = a;`<br />`if (a == b) {`<br />&nbsp;&nbsp;`System.out.println("same");`<br />`}` |

### Explanation

- **Example 1**:
  In the first example, two different `String` objects are created with the same value, `"Howdy"`. However, `a == b` compares their **memory locations**, not their values. Since `a` and `b` refer to different objects in memory, the condition `a == b` evaluates to **false**, so "same" is not printed.

- **Example 2**:
  In the second example, `b` is assigned the reference of `a`. Both `a` and `b` now refer to the **same object** in memory. Therefore, the condition `a == b` evaluates to **true**, and "same" is printed because they point to the same memory location.

## `equals()`

`equals()` can be used to compare class data types (e.g Strings, Arrays and Classes)

```java
String a = new String("Howdy");
String b = new String("Howdy");
if (a.equals(b))
{
  System.out.println("same");
}
```

> same

## "extended" `==` operator

```java
String a = null;
String b = "";
if (a == null)
{
  System.out.println("a is null");
}
if (b != null)
{
  System.out.println("b is not null");
}
```

> a is null
>
> b is not null
