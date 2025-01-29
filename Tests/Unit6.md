# Unit 6 Test

##Main

### Question 1

What return statement may be used in the method p()?

```java
public static int[] p(){
   // ...
}

public static void main(String[] args){
   int[] arr = p();
   // ...
}
```

> ``return new int[3];``

### Explination

The reason this is the correct answer is because it correctly creates a new array of integers and returns it.

### Question 2

What does the following method do?

```java
public static int myster(int[] a, int x){
   int c = 0;
   for (int i = 0; i < a.length; i++){
      if (a[i] == x){
         c++;
      }
   }
   return c;
}
```

> Returns a count of the number of times x appears in the array.

### Explination

The reason this is true is becuase the if statement is check for every character in the array does it match ``x``

### Question 3

Consider the following instance variable and method.

```java
private int[] nums;

/* print the indices of all the elements in nums which are even numbers */
public void printEvenIndices(){
   /* missing code */
}
```

Which of the following replacements for /* missing code */ correctly implements the method ``printEvenIndcies()``?

> for (int k = 0; k < nums.length; k++){
>
> if (nums[k] % 2 == 0){
>
>    System.out.println(k);
>
>    }
>
> }

### Explination

This makes a lot of sense just know that ``% 2`` is what checks if its even

**An Indices is where the element is in the array**

> i.e. {2, 3, 4, 7} the indices for 2 is ``0``

### Question 4

Assume that following mehtod has been defined:

```java
public static int mystery(String[] a, int x){
   int c = 0;
   for (int i = 0; i < a.length; i++){
      if (a[i].length() > x){
         c++;
      }
   }
   return c;
}
```

What is ouptu by the following code?

```java
String[] b = {"aardvark", "banana", "cougar", "daikon", "elephant", "fog", "get"};
System.out.println(mystery(b, 5));
```

> 5

### Explination

This program finds the amount of words with a length greater than 5

Just cout that amount and make sure a word with five letters is not included

### **Question 5**

When you pass an array to a method, the method reveives ______.

> a copy of the reference to the array

### Question 6

What does the following algorithm do?

```java
public static void mystery(int[] nums){
   for (int = 0; i < nums.length; i++){
      if (nums[i] % 2 != 0){
        nums[i]++;
      }
   }
}
```

> Changes all the values in the array to even numbers.

### Explination

Just look at what the if statement is doing (checking if not even)

add 1 to switch

### Question 7

Cosider the follwoing method

```java
public static String mashup(string str, int[] arr){
   String result = "";
   for (int x : arr){
      result = result + str.substring(0, x);
   }
   return result;
}
```

The follwing code apperas in another mehtod in the same class.

```java
int[] nums = {1, 5, 3};
String word = "program";
System.out.println(mashup(word, nums));
```

### Explination

**Rember that the endindex is exclusive**

### Question 8

What does the following alogrithm do?

```java
public static boolean mystery(int[] nums){
   for (int i = 1; i < nums.length; i++){
      if (nums[i - 1] >= nums[i]){
         return false;
      }
   }
   return true;
}
```

> Returns true if each element of the array is greater than the element before.

### Question 9

Cosider the following code segmen.

```java
int[] seq = {0, 1, 2, 5, 3, 7};

for (int k = 1; k < seq.length; k++){
   seq[k] = seq[k - 1];
}
```

Which of the following represents the contents of seq as a result of executing the code segment?


> ``[0, 0, 0, 0, 0, 0]``

### Explination

The reason its all zeros and not [0, 1, 2, 5, 3] is because it's writing directly to the array and not keeping a cache


### Question 10

Cosider the following methods which appear withing thye same class.

```java
public static void mystery(int[] data){
   for (int k = 0; k < data.length - 1; k += 2)}
      int t = data[k];
      data[k] = data[k + 1];
      data[k + 1] = t;
   }
}

public static void toString(int[] data){
   String str = "";
   for (int d : data){
      str = str + d + " ";
   }
   return str;
}
```

The following code segment appears in the main method of the same class.

```java
int[] nums = {1, 2, 7, 3, 5};
mystery(nums);
Sytem.out.println(toString(nums));
```

What is printed as a result of executing the code segment?

> ``2 1 3 7 5``

### Explination

**CREATE EXPLINATION**

### Question 11
### Question 12
### Question 13
### Question 14
### Question 15
### Question 16
### Question 17
### Question 18
### Question 19
### Question 20

##Alternate

### Question 1
### Question 2
### Question 3
### Question 4
### Question 5
### Question 6
### Question 7
### Question 8
### Question 9
### Question 10
### Question 11
### Question 12
### Question 13
### Question 14
### Question 15
### Question 16
### Question 17
### Question 18
### Question 19
### Question 20
