# Unit 10

## Question 1

Which of the following is not a step in teh Binary-Search algorithm?
(c)

Repeat until we find the target value or low < high

## Question 2

When you pass a double variable to a method, the mothod receives ____ .

(a)

A copy of the variable

This is so you cant rewrite the variable

## Question 3

Consider the following method.

```java
public static void recurMethod(String str)
{
if (str.length() > 2)
{
recurMethod(str.substring(1, str.length() - 1));
}
System.out.println(str);
}
```

av 
Java

## Question 4

Consider the following recursive method.

```java
    public static void wackyPrinter(String str){
        if (str.length() < 12){
            wackyPrinter("!" + str + "!");
        }
        else{
            System.out.println(str);
        }
    }
```

> !!computer!!

## Question 5

Which methods would produce the following output if they were passed the paramter, "gerbil"?

g
ge
ger
gerb
gerbi
gerbil

> II only

## Question 6

You need to search an ordered list of 1500 students for the student id #1124. Which search would be effective?

(a)

> binary

## Question 7

(a)

```java
    public static int mystery(int[] array, int target, int low, int high)
        int mid = (low + high)/2;
        if (target == array[mid]){
            return mid;
        }
        if (high < low){
            return -1; // not found
        }
        if (target < array[mid]){
            return mystery(array, target, low, mid - 1);
        }
        if (target > array[mid]){
            return mystery(array, target, mid + 1, high);
        }
        return -1;
    }
```

> Binary Search

## Question 8

Consider the following method

```java
public static int goRound(int num){
    if (num > 100){
        return 10 * ((num + 50) / 10);
    }
    return 10 * goRound(num * 10);
    }
```

## Question 9

Consider the following recursive method:

```java
public static int recur(int x)
{
if (x >= 0)
{
return x - recur(x - 1);
}
return 0;
}
```

```java
private String word;
public boolean hasRepeat(){
    return hasRepeatHelper(word.length() - 1);
}

private boolean hasRepeatHelper(int pos){
    if (pos < 1){
        return false;
    }
    
    String letter1 = word.substring(pos,pos+1);
    
    for (int i = pos-1; i > 0; i--){
        String letter2 = word.substring(i, i+1);
        
        if (letter1.equals(letter2)){
            return true;
        }
    }
    return hasRepeatHelper(pos-1);
}
```

## Question 10

The algorithm above has a mistake. Which of the calls to hasRepeat below will demonstrate the mistake?

(a)

> I only

## Question 11
Which of the following should be used to replace the for loop header for (int i = pos-1; i > 0; i--) so
that hasRepeat will work as intended?

(a)

> for (int i = pos-1; i >= 0; i--)

## Question 12

Which of the following are NOT real advantages of using the merge-sort algorithm?

> I II and III

## Question 13

```java
public static String recur(int val){
    if (val == 0){
        return "";
    }
    if (val % 2 == 0){
        return recur(val / 2) + "a";
    }

    else{
        return recur(val / 2) + "b";
    }
}
```

## Question 14

```java
/** Precondition: num > 0 */
public static int mystery(int num){
    if (num % 2 == 1){
        return 0;
    }
    else{
        return 1 + mystery(num / 2);
    }
}
```

> The exponent of the largest power of 2 which divides x evenly

## Question 15

```java
public static int mystery( int [] list, int val){
    for (int i = 0; i<list.length; i++){
        if (list[i] == val){
            return i;
        }
    }
    return -1;
}
```

(e)

> Linear Search

## Question 16

```java
public static void doWhat(int num){
    if (num < 12){
        System.out.print(num + " ");
        doWhat(num + 3);
    }
}
```

(d)

> 2 5 8 11

## Question 17

The two methods below are intended to implement the merge sort algorithm when used in conjunction.

```java
/** Main method to sort an array of ints.
* @param arr the array to be sorted
* @return an array with the same contents as arr, sorted in
* increasing order
*/
public static int[] mergeSort(int[] arr){
    
    // Base case: if list length is 1 then it is already sorted
    if (arr.length <= 1){
        return arr;
    }
    // Split list into two half-lists
    /* missing code */
    for (int i = 0; i < lowerHalf.length; i++){
        lowerHalf[i] = arr[i];
    }
    for (int i = 0; i < upperHalf.length; i++){
        upperHalf[i] = arr[i + arr.length / 2];
    }
    return merge(mergeSort(lowerHalf), mergeSort(upperHalf));
}

/** Helper method which merges two ordered arrays of ints
* @param arr1 the first ordered array
* @param arr2 the second ordered array
* @return an array containing contents of both arr1 and arr2,
* sorted into increasing order
*/

private static int[] merge(int[] arr1, int[] arr2){
    /* implementation not shown */
}
```

(a)

> int[] lowerHalf = new int[arr.length/2];
>
> int[] upperHalf = new int[(arr.length+1)/2];

## Question 18

Conside the following recursive method.

```java
public int recur(int x){
    if (x > 0){
        return 2 * recur(x / 2);
    }
    if (x < 0){
        return recur(x - 10) / 2;
    }
    return 10;
}
```

(d)

> 80

## Question 19

Consider the following recursive method.

```java
public static void mystery(String s){
    if (s.length() > 4){
        mystery(s.substring(0, s.length() / 2));
        mystery(s.substring(s.length() / 2));
    }
    else{
        System.out.println(s);
    }
}
```

> Mi
>
> ssi
>
> ssi
>
> ppi

## Question 20

```java
private ArrayList<Integer> vals;
// vals is sorted into increasing order
public void binaryInsert(int num){
    int low = 0;
    int high = vals.size();
    while (high > low){
        int mid = (low + high) / 2; /* calculate midpoint */
        if (vals.get(mid).intValue() < num){
            low = mid + 1;
        }
        else{
            high = mid;
        }
    }
    vals.add(low, new Integer(num)); /* insert new number */
}
```

> 3