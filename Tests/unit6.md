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

Consider the following method:

```java
public static void doStuff(int[] a, int b){
   if ( /* Missing code */ ){
      for (int i = b; i < a.length; i++){
         a[i] = a[i] * 2;
      }
   }
}
```

What could be used to replace ``/* Mising Code */`` so that there is no out of bounds exception?

> ``b >= 0 && b < a.length``

### Explination

Think of this just as a for loop

### Question 12

Consider hte following code:

```java
int[] a = {64, 66, 67, 37, 73, 70, 95, 52, 81, 82};

for (int i = 0; i < a.length; i++){
   a[i] = a[i] / 10;
}

for (int i = 0; i < a.length; i++){
   System.out.print(a[i] + " ");
}
```

What is output?

> 6 6 6 3 7 7 9 5 8 8

### Question 13

Consider the following instance variable and method.

```java
private int[] nums;
/** @param val any int value
*/

public int mystery(int val){
   int k = 0;
   while (k < nums.length && nums[k] < val){
      k++;
   }
   return k;
}
```

Suppose that the call ``mystery(10)`` returns a value of 7. Which of the following MUST be true about ``nums``?

> The elemtns at indices from 0 to 6 inclusive in nums are all less than 10.

### Question 14

Consider the following code segment

```java
int[] seq = {3, 1, 8, 4, 2, 5};

for (int k = 1; k < seq.length; k++){
   if (seq[k] >= seq[0]){
      System.out.print(seq[k] + " " + k + " ");
   }
}
``

What will be printed as a result of executing the code segment?

> 8 2 4 3 5 5

### Question 15

Given the following method definition:

```java
public static int mystery(int[] a){
   int n = a[0];
   for (int i = 0; i < a.length; i++){
      if (m > a[i]){
         m = a[i];
      }
   }
   return m;
}
```

What would be returned by mystery if it was passed the following array?

``int[] a = {34, 18, 34, 38, 27, 37, 39, 21, 19};``

> 18

### Question 16

Consider the following instance variable and method.

```java
private int[] nums;

/** Precondition: nums.length > 0
 * @param n an int value represengting a valid index of nums
 */

public int numsInfo(int n){
   int result = n;
   for (int k = n - 1; k >= 0; k--){
      if (nums[k] == nums[n]){
         result = k;
      }
   }
   return result;
}
```

Which of the following best describes the value returned by the method numsInfo?

> The index of the first element in teh array which has the same value as the element at position n.

### Question 17

Consider the following instance varibale and method.

```java
private String[] words;

public  void mystery(int n){
   for (int k = n; k < words.length; k += n){
      words[k] = words[k - 1].substring(0, n);
   }
}
```

Assume that words has been initialized with the following values.

``{"abcde", "fghij", "klmno", "pqrest", "uvwxy"}``

Which of the following represents the contents of the array words as a result of the call mystery(2)?

> ``["abcde", "fghij", "fg", "pqrst", "pq"]``

### Question 18

Consider the following methods:

```java
public static double average(int[] nums){
   int sum = 0;
   for (int i = 0; i < nums.length; i++){
      sum += nums[i];
   }
   return (1.0 = sum) / nums.length;
} //average

public static int[] mystery(String[] a){
   int[] temp = new int[a.length];
   for (int i = 0; i < a.length; i++){
      temp[i] - a[i].length();
   }
   return temp;
} //mystery
```

What is output by running the following?

```java
String[] spelling = {"against", "forms", "belief", "government", "democratic", "movement", "understanding", "single", "followed", "scenario"};

System.out.println(average(mystery(spelling)));
```

> 8.1

### Question 19

Consider the following method which is intended to create an array which stores the decimal digits of the positive int num in order of their place value (e.g. units first, then tens etc.)

```java

/** @param nums a positive integer
 *  @return an array containing each digit of num, with the units digit at index 0 and 
 *  higher palce value digits at higher indices.
 */

public int[] digits(int num){
   int length = 0;
   int pv = 1;

   while (num >= pv){
      length += 1;
      pv *= 10;
   }

   int[] dig = new int[length];

   for (int k = 0; k < length; k++){
      /* missing code */
   }

   return dig;
}
```

Which of the following could replace /* missing code */ so the method digits works as intended?

> dig[k] = num % 10;
>
> num /= 10;

### Question 20

Consider the following method.

```java
public static int mystery(int[] data){
   int times = 0;
   int counter = 0;

   for (int j = 0; j < data.length; j++){
      counter = 0;
      for (int k = j; k < data.length; k++){
         if (data[j] == data[k]){
	    counter++;
	 }

      }
      if (counter > times){
         times = counter;
      }
   }
   return times;
}
```

Assume that data has been defclared and initialized as an array of integer values. Which of the following best describes the value returned by the call mystery(data)?

> The number of times that a most frequently occurring value appears in data

## Alternate (100% chance)

### Question 1

What return statement may be used in the method s()?

```java
public static String[] s(){
   // ...
}

pubic static void main(String[] args){
   String[] words = s();
   // ...
}
```

> ``return String[] {"apple", "banana", "orange"};``


### Expliation 

All the program is asking for is the way to properly return a string

### Question 2

What does the following method do?

```java
public static int mystery(double[] a, double x){
   int s = 0;
   for (int i = 0; i < a.length; i++){
      if (a[i] != x){
         s = s + a[i];
      }
   }
   return s;
}
```

> Returns the sum of all elements **other** than x in the array.

### Explination 

Keep in mind that the if statement has a ``!=``

### Question 3

Consider the following instance variable and method.

```java
private int[] nums;

/* ptrint the elemtns in nums which are a multiple of three */
public void printMultiplesOfThree(){
   /* missing code */
}
```

Which of the following replacements for /* missing code */ correctly implements the method printMultiplesOfThree()?

> for (int x: nums){
>
>    if (x % 3 == 0){
>
>       System.out.pritnln(x);
>
>    }
>
> }

### Question 4

Assume the following mehtod has been defined:

```java
public static int myster(String[] a, int x){
   int c = 0;
   for (int i = 0; i < a.length; i++){
      if (a[i].length() <= x){
         c++;
      }
   }
   return c;
}

```

What is output by the following code?

```java
String[] b = {"rain", "beach", "any", "love", "emotion", "sunny", "go"};
System.out.printl(mystery(b, 4));
```

> 4

### Question 5

If you want to use an array as an argument in a method, you must first put in ______.

> data **type** of the array

### Question 6

What does the following algorithm do?

```java
public static void mystery(int[] nums){
   for (int i = 0; i < nums.length; i++){
      if (nums[i] % 5 == 0){
         nums[i]++;
      }
   }
}
```

> Changes all values to **not** be a multiple of 5.

### Question 7

Consider the following method

```java
public static String combineCertainWords(String[] words, int start, int end){
   String result = "";
   for (String str : words){
      result = result + str.substring(start, end);
   }
   return result;
}
```

The following code appears in another method in the same class.

```java
String[] animals = {"bunny", "bird", "dog"};

System.out.println(combineCertainWords(animals, 2, 3));
```

What is printed when the code above is executed?

> nrg

### Explination

Remember that Substing is non inclussive for the end value

### Question 8

What does the following algorithm do?

```java
public static boolean mystery(int[] nums){
   for (int i = 1; i < nums.length; i++){
      if (nums[i] < nums[ i - 1]){
         return false;
      }
   }
   return true;
}
```

> Returns true if each element of the array is less than or equal to the element after.

### Question 9

Consider the following code segment.

```java
int[] seq = {0, 18, 9, 6, 3, 1};

for (int k = 1; k < seq.length - 1; k++){
   seq[k] = seq[k + 1];
}
```

Which of the following represents the contents of seq as a result of executing the code segment?

> ``[0, 9, 6, 3, 1, 1]``

### Question 10

Consider the following methods which appear within the same class.

```java
public static void mystery(int[] data){
   for (int k = data.length; k > 0; k--){
      data[k - 1] = k;
   }
}

public static String toString(int[] data){
   String str = "";
   for (int d : data){
      str = str + d + " ";
   }
   return str;
}
```

The following code segment appears in the main method of the same class.

```java
int[] nums = {2, 4, 6, 8, 10};
mystery(nums);

System.out.println(toString(nums));
```

What is printed as a result of executing the code segment?

> 1 2 3 4 5

### Question 11

Consider the following method:

```java
public static void doStuff(int[] arr, int num(){
   if (/* Missing Code */){
      for (int i = num; i < arr.length; i++){
         arr[i] = arr[i] % 4;
      }
   }
}
```

What could be used to repalce ``/* Missing Code */`` so that there is no out of bounds exception?

> ``num >= 0 && num < arr.length``

### Question 12

Consider the following code segment:

```java
double [] a = {2, 2, 2, 2, 2};

for (int i = 0; i < a.length; i++){
   a[i] = Math.pow(a[i], i);
}

for (int i = 0; i < a.length; i++){
   System.out.print(a[i] + " ");
}
```

What is output?

> 1.0 2.0 4.0 8.0 16.0

### Question 13

Consider the following instance variable and method.

```java
private int[] nums;
/** @param val any int value
*/

public int mystery(int val){
   int k = 0;
   while (k < nums.length && nums[k] < val){
      k++;
   }
   return k;
}
```

Suppose that the call ``mystery(8)`` returns a value of 5. Which of the following MUST be true about ``nums``?

> The elements at indices from 0 to 4 inclusive in nums are all less than 8.

### Question 14

Consider the following code segment.

```java
int[] seq = {5, 4, 2, 8, 6, 5};

for (int k = seq.length - 1; k >= 0; k--){
   if (seq[k] <= seq[0]){
      System.out.pritn(seq[k] + " ");
   }
}
```

What will be printed as a result of executing the code segment?

> 5 2 4 5

### Question 15

Given the following method defintion:

```java
public static int mystery(int[] a){
   int m = a[0];
   for (int i = 0; i < a.length; i++){
      if (m < a[i]){
         m = a[i];
      }
   }
   return m;
}
```

What would be returned by mystery if it was passed the following array?

```java
int[] a {5, 3, 6, 8, 9};
```

> 9

### Question 16

Consider the following instance varibale and method.

```java
private int[] nums;

/* Precondition: nums.length > 0
 * @param n an int value representing a valid index of nums
 */

public int numsInfo(int n){
   int result = n;
   for (int k = n + 1; k < nums.length; k++){
      if (nums[k] == nums[n]){
         result = k;
      }
   }
   return result;
}
```

Which of the following best describes the value returned by the mehtod numsInfo?

> The index of the last element in the array which has the same value as the element at position n.

### Question 17

Consider the following instance variable and method.

```java
private String[] words;

public void mystery(int n){
   for (int k = n; k < words.length - 1; k++){
      words[k] = words[k + 1].substring(0, n);
   }
}
```

Assume that words has been initialzed with the following values.

```java
{"dragon", "ogre", "troll", "goblin", "knight"}
```

Which of the follwoing represents the contents of the array words as aresult of the call mystery(1)?

> ``{"dragon", "t", "g", "k", "knight"}``

### Question 18

Consider the following methods:

```java
public static int sum(int[] nums){
   int sum = 0;
   for (int i = 0; i < nums.length; i++){
      sum += nums[i];
   }
   return sum;
} //sum


public static int sum(int[] nums){
   int[] temp = new int[a.length];
   for (int i = 0; i < a.length; i++){
      temp[i] = a[i].length();
   }
   return temp;
} //mystery

public static void main(String[] args){
   String[] spelling = {"boat", "bridge", "hat", "house"};
   System.out.println(sum(mystery(spelling)));
}
```

Which of the following will be printed by the main method of the program?

> 18

### Question 19

Consider the following method which is inteded to create an array which stores the decimal digits of the positive int num in order of their place value (e.g. units first, then tens etc.)

```java
/** @param num a positive integer
 *  @return an array containing each digit of num, with the units digit at index 0 and 
 * higher palce value digits at higher indices.
 */

public int[] digits(int num){
   int length = 0;
   int pv = 1;

   while (num >= pv){
      length += 1;
      pv *= 10;
   }

   int[] dig = new int[length];

   for (int k = 0; k < length; k++){
      /* missing code */
   }
   return dig;
}
```

Which of the following coudl replace /* missing code */ so the method digits works as intended?

> dig[k] = num % 10;
>
> num /= 10;

### Question 20

Consider the followinfg class.

```java
public staic int mystery(int[] data){
   int times = 0;
   int counter = data.length;
   for (int j = 0; j < data.length; j++){
      counter = 0;
      for (int e : data){
         if (e == data[j]){
            counter++;
	 }
      }
      times = times + counter;
   }
   System.out.pritnln(times);
   return times;
}

public staic void main(String[] args){
   int[] arr = {1, 2, 2, 4, 4};
   mystery(arr);
}
```

What will be printed as a result of executing the code segment?

> 9

