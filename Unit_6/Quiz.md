# Unit 6 Quiz

## Question 1
Assume you have th following array: 

``int[] a = {1,2,3,4,5,};``

How would you incremnt the third element in the array by one?

> `a[2]++;`

## Explination

This is pretty simple think of the third element only as an `int`

## Question 2
Consider the following code:

``double[] list = new double[100]``

The index of the first value is __ and the last index is __ .

> `0, 99`

## Explination

Remember that the first element of an array is **always** stored at `0`

## **Question 3**

A standard arry can hold:

> Either class or primitive types.

## Question 4

Consider the following code:

```java
int[] a = {2, 6, 8, 10, 12, 14, 16, 18};
int sum = 0;
for (int i = 0; i < a.length; i++){
  if (i % 3 == 0){ 
     sum += a[i];
  }
}
System.out.println(sum);
```

> 28

## Question 5

Consider the following code, intended to search an array for a value and print the position where the value was found:

```java
int[] array = /* Assume array is correctly initialized */;
int num = /* Input from the keyboard */;
int position = -1;
for (int i = 0; i < array.length; i++){
   if (array[i] == num){
      /* Missing Code */
      //position = i; **ANSWER**
      break;
   }
}

if (position == -1){
   System.out.println("Value not found");
}

else{
   System.out.println("Value found at position " + position);
}
```

> position = i

## Question 6
The following is intended to count the number of times the number 87 is listed in an array of test scores:

```java
int[] d = /* Assume array is initialized */;
int scoreCount = 0;
for (int i = 0; i < d.length; i++){
   if (/* Missing Code */){
      // d[i] == 87
      scoreCount++;	
   }
}
System.out.println("Number of 87's: " + scoureCount);
```

Which of the following could repalce `/* Missing Code */` so that the code works as intended?

> d[i] == 87

## Question 7

Consider the follw9oing code, intended ot count the number of words in the array a length less than or equal to 6.

```java
String[] vocabulary = /* Array initialzied with Strings */;
int c = 0;
for (int i = 0; i < vocabulary.length; i++){
   if (/* Missing Code*/){
   //vocabulary[i].length() <= 6
   	C++
   }
}
System.out.println("Number of words with length less than or equal to 6: " + c);
```

Which of the following could repalce `/* Missing Code */` so that the code works as intended?

> vocabulary[i].length() <= 6

## Question 8

Consider the following code:

```java
String[] words = {"avalanche", "budget", "cannot", "center", "meaning", "clear", "furnature", "deep", "piccolo", "friendly", "potatoes", "nanotechnology"};
int c = 0;
for (int i = 0; i < words.length; i++){
   if (words[i].substring(0, 3).indexOf("o") >= 0){
      c++;
   }
}
System.out.println(c);
```

What is output?

> 1

# Expliation

**Rember that the substring is not inclusive on the last char**

Once you keep that in mind it should be straight forward to just look and count the amount of words that have `o` in there first three letters

## Question 9

The following is intended to return the location fo the frist instance of the String the user enters from the keybard, -1 if not found.

```java
String[] names = new String[20];
//assume array is initialized

System.out.println("Enter a name to search for: ");
String lookingFor = scan.nextLine();

int found = -1;

for (int i = 0; i < names.length; i++){
   if (/* Missing Code */){
   	found = i;
	break;
   }
}
```

Which of the following could repalce `/* Missing Code */` so taht it works as indended

> `lookingFor.equals(names[i])`

## Question 10

Consider the follwing method, hasRepetes, which is intended to return true if an array of integers contains the same value more than once and false otherise.

```java
/** @param arr an array of integers
 *  @return true if an element in the array is repeated
 */

public static boolean hasRepeats(int[] arr){
   for (int k = 0; k < arr.length; k++){
      for (/* missing code */){
         if (arr[j] == arr[k]{
	    return true;
	 }
      }
   }
}

```

Which of the following could repalce `/* Missing Code */` so taht it works as indended


> int j = k + 1; j < arr.length; j++