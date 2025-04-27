What is returned by the call `re(5)`?

```java
public static int re(int n){
    
    if (n <= 1)
        return n;

    return re(n - 1) + re(n - 2)
}
```

Work:

```ascii
re(5)

re(4) + re(3)

re(3) + re(2) + re(2) + 1

re(2) + 1     + 1     + 0     + 1     + 0     + 1

1     + 0     + 1     + 1     + 0     + 1     + 0     + 1     
```

> 5

What is returned by the call `re(5)`

```java
public static int re(int n){
    if (n <= 1) //if n is less than or equal to 1
        return 1;

    return n + re(n / 2);
}
```

Work: (Need to remember truncation of values)

```ascii
5 + re(2)

5 + 2 + re(1)

5 + 2 + 1
```

> 8

What is returned by the call re("FIZZ")

```java
public static String re(String t){

    if (t.length() > 6)
        return t;

    return re(t + t.substring(t.indexOf("ZZ")));
    /* the return statement above will 
       return the string plus two z's
    */
}
```

> FIZZZZZZZZ
>
> 12345678910


What is returned by the call re(30)

```java
public static int re(int n){
    if (n < 9)
        return n * 3;

    return re(re(n / 5));

}
```

re(30)

re(re(6))

re(18)

re(re(3))

re(9)

re(re(9))

re(3)

> 9
