# Unit 5 Exam

## Question 1

Which of the following would assign ther variable s1 to a default Ship object?

> Ship s1 = new Ship();

## Explination
A default constructor creates a new object without any parameters, and constructs an object from some set of default values.

## Question 2

Which of the follwoing is **not** true about designing classes?

> All methods should be declared private.

## Question 3

> Student s = new Student(20, "Peter");

## Question 4

Consider the complete class definition below:
```
public class lamp{
  public static void toogle(){
  /* Missing code */
  }
}
```

Which of teh folloing is the *proper way* to call the function `toggle()` from another class?

> `Lamp.toggle();`

## Question 5

> I only

## Question 6

> onetwo

## Question 7

Which of the following is the correct way to declare a static int variable named x?

> `public static int x;`

## Question 8

Consider the following method maximum, which is intended to return the largest of three integers.

```
public static int maximum(int a, int b, int c){
  if ((a > b) && (a > c)){
    return a;
  }
  else if (/*missing condition*/){
    return b;
  }
  else{
    return c;
  }
}
```

Which of the following should replace /* missing condition */ so that maximum works as intended?

> `b > c`

## Question 9

> name = n;
>
> ssn = s;

## Question 10

which of the following correctly implemetns the equals method for the Person class, assuming that two people are equal if their ssn values are equal?

```
public boolean equals(Person p){
  return this.ssn.equals(p.getSsn();
}
```

## Question 11
Which of ther following correctly implements a mutator method for Person?

```
public void setName(String n){
  name = n;
}
```

## Question 12

When defining a class, it is a best practice to declare ___ as private.

> variables

## Question 13

> Hello world 0

## Question 14

Consider the following method. 

```
public static int magic(int a){
  int x = 21;
  while (x > 20){
    x /=2;
    x = x + 2;
  }
  return x;
}
```
Which of the following is true about the behavior of method magic?

> The method will result in an ifninte loop for some arguments. but will return a number for all arugments which are sufficiently small.

## Question 15

> `score = 70`

## Question 16

> a = 2.3 b = 4

## Question 17

> Accessor methods must return type void.

## Question 18

> None of the above.

## Question 19

> d1.setBreed("Chocolate Labrador");

## Question 20

> I and III only

