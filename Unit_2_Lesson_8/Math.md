# Math Class

Methods that will be used from the `Math` class.

- Absolute Value - `abs(double num)`
- Powers/Exponents - `pow(double base, double exponent)`
- Random Numbers - `random()`
- Square Root - `sqrt(double, num)`

## Absolute Value

```java
double x = 9.6;
double y = 2.1;
double dist = Math.abs(y - x);
System.out.println(dist);
```

> 7.5

```java
int y = -2;
System.out.println(Math.abs(y));
```

> 2

Above are the two ways you can use `Math.abs()'

## Powers

```java
int a = 2
int b = 6
double answer1 = Math.pow(a, b);
System.out.println(answer1);
```

> 64.0

## Sqare root

```java
double answer2 = Math.sqrt(answer1);
System.out.println(answer2);
```

> 8.0

## Random

```java
double ran = Math.random();
int range = 100;
int min = 1;
double answer = (int) (ran * range) + min;
System.out.println(answer);
```

> 24
