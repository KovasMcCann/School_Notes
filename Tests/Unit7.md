# Unit 7

# Question 1

Wich of the following is true about the linear search algorithm? Select all that apply?

The Algorithm Can work with both ordered and unorderd lists or arrays. 

The algorithm will give an exact location of the thing you are searching for    

The algorithm can work on any list or array. but is quite slow for large lis    ts.

# Question 2

Consider the following code segment: 
 
```java
ArrayList<Light> bulbs = new ArrayList<Light>();
bulbs.add(new Light());
bults.add(new Light());
Light b = new Light();
bulbs.add(2, b);
bulbs.add(new Light());
bulbs.remove(0);
bulbs.add(new Light());
bulbs.remove(2);
bulbs.add(new Light());
```

> 4

# Question 3

Consider the following code segment:

```java
int n = (int) (Math.random() * 15) + 1;
ArrayList list = new ArrayList(n);
```

Which of the following gives the index of the final element of ``list``?

> list.size() - 1

# Question 4

Which of the following is NOT ture about ArrayLIst objects? Select all that apply.

> The ArrayList checks for and deletes duplicate values.
>
> ArrayList is a primitive data type.

**Array List Start**

# Question 5

Wou have written a program to create a grocery list. As each item is placed into your basket you call the ``removeItem`` method and it should remove the item from your list. Which of the statements about the code below are true?

```java
public class groceryList{
   Public static void removeItem(ArrayList<String> li, String item){
      for (int i = 0: i < li.size(); i++){
         if (li.get(i).equals(item)){
            li.remove(i);
            i--; 
         }
      }
   }
   public static void main (String[] args){
      ArrayList<String> a = new ArrayList<String>();
      a.add("chips");
      a.add("veggies");
      a.add("iceCream");
      removeItem(a, "veggies");
      System.out.println(a):
   }
}
```

> The list will print [chips, iceCream].

# Question 6

Questiosn 6 and 7 refer to the follwoing methdo which sorts and ArrayList of integers into increasing order.

```java
public static void sort(ArrayList<Integer> list){
   for (int start = 0; start < list.size(); start++){
      int mInd = start;
      for (int j = start; j < list.size(); j++){
        if (list.get(j) < list.get(mInd)){
          mInd = j;
        }
      }
      list.add(start, list.remove(mInd));
   }
}
```

Suppose the following comments to describe what the code does were to be added.

```java
I. // Make the minimum index into the current one
II. // Iterate thorugh indices of remaining unsorted list
```
Atr which lines should these comments be inserted?

> I - line 10, II - line 6

# Question 7 [Confused]

Consider the follwoing code which apperas in another mehod in the same class:

```java
ArrayList<Integer> a = new ArrayList<Integer>();
a.add(1);
a.add(2);
a.add(3);
a.remove(2);

ArrayList<Integer> a = new ArrayList<Integer>();
b.add(4);
b.add(3);
b.add(2);
b.add(1);

sort(a);
sort(b);
```

Which of the two calls ``sort(a), and sort(b) will result in line 8 being executed more times?

> sort(b) will result in line 8 being executed more times.

# Question 8 [Review]

Consider the following code segment.

```java
ArrayList<String> musicGenre = new ArrayList<String>();

musicGenre.add("jazz");
musicGenre.add("rocknRoll");
musicGenre.add("hipHop");
musicGenre.add(musicGenre.remove(1));
musicGenre.set(1, musicGenre.remove(1));
System.out.println(musicGenre);
```

What is printed as a result of executing the code segment?

> [jazz, hipHop]

# Question 9

Consider the following method:

```java
public static int search(ArrayList<String> list, String target){
  for (int i = 0; i < list.size(); i++){
    if (list.get(i).equals(target)){
      return i;
    }
  }
return -1;
}
```

The following code appears in teh main method of the same class:

```java
ArrayList<String> beverages = new ArrayList<String(); 
beverages.add("juice");
beverages.add("water");
beverages.add("coffee");
beverages.add("tea");
System.out.pritnln(search(beverages, "gatorade"))
```

What is printed when this code is exectued?

> -1

This is becuase there is no gatorade and the position is from 0 ~> N

# Question 10

consider the following methods which appear within the same class.

```java
|           |
| VERY LONG |
|           |
```

To add a method that can count how many Battery objects in the ArrayLIst inventory are fullty cahyred, which of the following is true?

> The method should be implemented in Inventory. [Private array?]

# Question 11

Which accessor method could **not** be implemented in Battery?

> printInventory()

# Quesiton 12 

The following method in Inventory is inteded to count how many bastteries are more then 50% charged. What shouyld repalce /*Missing Code*/ so that the mehtod works as intended.

```java
pulic int countFullyCharged(){
  int c = 0;

  /* Missing Code */

  return c;
}
```


> for (Battery b : inventory){
> 
>   if (b.charge > 50){
>
>     c++;
>
>   }
>
> }

# Question 13

Which of the follwoing methods correctly removes duplicate words from an ArrayList?

> III Only

# Question 14

Consider the following sort method. This method correctly sorts the elements of array arr into increasing order.

```java
public static void sort(int[] arr){
  for (int j = arr.length - 2; j >= 0; j--){
    int move = arr[j];
    int k = j + 1;

    while (k < arr.length && move > arr[k]){
      arr[k - 1] = arr[k];
      k++;
    }

    arr[k - 1] = move;
  }
}
```

Assume that sort is called with the array {7, 4, 3, 6, 0, 1}. What will the value of arr be after two passes of the for loop (i.e. when j = 4 at the point indicated by /* end of for loop */)?

> {7, 4, 3, 0, 1, 6}

# Question 15

Consider the following sort method. This method correctly sorts the elements of array arr into increasing order.

```java
public static void sort(int[] arr){
  for (int j = arr.length - 2: j >= 0; j--){
    int move = arr[j];
    int k = j + 1;

    while (k < arr.length && move > arr[k]){
      arr[k - 1] = arr[k];
      k++; 
    }
    arr[k - 1] = move;
  }
}
```

Assume that sort is called with the array {10, 8, 6, 2, 0}. How many times will the expression indicated by /* Shuffle elements upwards */ and the statement indicated by /* Insert value in position */ execute?

> Shuffle elements upwards: 10, Insert value into position: 4

[10, 4]

# Question 16

Consider the following code segment:

```java
public static void doStuff(ArrayList<String> a){
  for (int i = 0; i < a.size(); i++){
    a.set(i, a.get(i) + " ");
  }
}

public static void doStuff(int a){
  a = a * 2
}

public static void main(String[] args){
  int g = 4;
  doStuff(g);
  System.ourt.print(g + " ");
  ArrayList<String> list = new ArrayList<String>();
  list.add("bannana");
  doStuff(list);
  System.out.print(list);
}
```

What is printed as a result of executing the code segment?

> 4 banana

[Look At Main values]

# Question 17

Conisder the following code segment:

```java
ArrayList<String> list = new ArrayList<String>();


list.add("Book");
list.add("flashLight");
list.add("tent");
list.add("Trailmix");

for (String s : list){
  if (s.tolowerCase().substring(0, 1).equals(s.substring(0,1))){
    System.out.print(s + " ");
  }
}
```

When the program is run, what will be its output?

> flashLight tent

# Question 18

Consider the following declaration for an ArrayList:

```java
ArrayList<String> list = new ArrayList<String>();
```

After values have been added to the array, the following segment processes the ArrayList:

```java
list.add(list.get(list.size()%2);
list.remove(list.size()%2);
```

Which of the following best descrigbes what this segment does?

> Adds the first or second String onto the end.

# Question 19 


the combinList mehtod is intended to retrun an ArrayLIst which contains every word which appears on list1 or list3 without any duplicate words. For which of the following values of list1 and list2 will the method now work as intended?

>List1 = ["pick", "key", "lock"]
>
>List2 = ["anvil", "pick", "steel"]

# Question 20

Suppose that you wich to change the code so that it correctly sorts teh integers in elements into desending order rather than asending order. Which of the following best describes which combionatiosn of the proposed changes would achieve this goal?

> Only enacting change II
