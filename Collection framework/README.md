## Coder : Subham Maity

### Note: Just look at the code ,and you will understand the code and the logic behind it also definition of the code

* [Array List](#array-list)
* [Stack](#stack)
* [Queue(Linked List)](#queuelinked-list)
* [Linked List(list)](#linked-listlist)
* [Priority Queue](#priority-queue)
* [Array Deque](#array-deque)
* [Hash Set](#hash-set)
* [Linked Hash Set](#linked-hash-set)
* [Custom Class HashSet](#custom-class-hashset)
* [Hash Map](#hash-map)
* [Tree Map](#tree-map)
* [Array Class](#array-class)
* [Collection Class](#collection-class)

![image2-1](https://user-images.githubusercontent.com/97989643/171506183-b340a26c-9536-4b4d-b4c3-e3f58e560f76.png)


************************
<p>List implementations:</p>

<pre><code>                      get  add  contains next remove(0) iterator.remove
ArrayList             O(1) O(1) O(n)     O(1) O(n)      O(n)
LinkedList            O(n) O(1) O(n)     O(1) O(1)      O(1)
CopyOnWrite-ArrayList O(1) O(n) O(n)     O(1) O(n)      O(n)
</code></pre>

<p>Set implementations:</p>

<pre><code>                      add      contains next     notes
HashSet               O(1)     O(1)     O(h/n)   h is the table capacity
LinkedHashSet         O(1)     O(1)     O(1) 
CopyOnWriteArraySet   O(n)     O(n)     O(1) 
EnumSet               O(1)     O(1)     O(1) 
TreeSet               O(log n) O(log n) O(log n)
ConcurrentSkipListSet O(log n) O(log n) O(1)
</code></pre>

<p>Map implementations:</p>

<pre><code>                      get      containsKey next     Notes
HashMap               O(1)     O(1)        O(h/n)   h is the table capacity
LinkedHashMap         O(1)     O(1)        O(1) 
IdentityHashMap       O(1)     O(1)        O(h/n)   h is the table capacity 
EnumMap               O(1)     O(1)        O(1) 
TreeMap               O(log n) O(log n)    O(log n) 
ConcurrentHashMap     O(1)     O(1)        O(h/n)   h is the table capacity 
ConcurrentSkipListMap O(log n) O(log n)    O(1)
</code></pre>

<p>Queue implementations:</p>

<pre><code>                      offer    peek poll     size
PriorityQueue         O(log n) O(1) O(log n) O(1)
ConcurrentLinkedQueue O(1)     O(1) O(1)     O(n)
ArrayBlockingQueue    O(1)     O(1) O(1)     O(1)
LinkedBlockingQueue   O(1)     O(1) O(1)     O(1)
PriorityBlockingQueue O(log n) O(1) O(log n) O(1)
DelayQueue            O(log n) O(1) O(log n) O(1)
LinkedList            O(1)     O(1) O(1)     O(1)
ArrayDeque            O(1)     O(1) O(1)     O(1)
LinkedBlockingDeque   O(1)     O(1) O(1)     O(1)
</code></pre>
****************************
# Array List
```java
import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {
    public static void main(String[] args) {

        //1.creating an arrayList
        //ArrayList is a class that can store multiple data types
        ////timecomplexity - O(1)
        ArrayList<String> studentName = new ArrayList<>();//creating an arrayList of strings
        ArrayList<Integer> studentAge = new ArrayList<>();//creating an arrayList of integers
        studentName.add("Raj");//adding elements to the arrayList
        studentName.add("Raju");//adding elements to the arrayList
        studentName.add("Ramesh");//adding elements to the arrayList
        studentName.add("Rana");//adding elements to the arrayList
        studentName.add("Rakesh");//adding elements to the arrayList
        studentAge.add(20);//adding elements to the arrayList
        studentAge.add(21);//adding elements to the arrayList
        studentAge.add(22);//adding elements to the arrayList
        studentAge.add(23);//adding elements to the arrayList
        studentAge.add(24);//adding elements to the arrayList

        System.out.println(studentName);
        System.out.println(studentAge);

        //2.size = n then size increase = n + n/ + 1

        System.out.println(studentName.size());//size of arrayList
        System.out.println(studentAge.size());//size of arrayList


        //3.add value to arrayList - this will add the value at the end of the arrayList
        studentName.add("Raju");//add value at the end of arrayList
        studentAge.add(25);//add value at the end of arrayList
        System.out.println(studentName);
        System.out.println(studentAge);


        //4.add value at specific index
        studentName.add(1, "Sashi");//add value at specific index
        studentAge.add(1, 26);//add value at specific index
        System.out.println(studentName);
        System.out.println(studentAge);


        //5.add new list to our arrayList
        ArrayList<String> studentName1 = new ArrayList<>();
        studentName1.add("Mandy");
        studentName1.add("Sandy");
        studentName1.add("Candy");

        studentName.addAll(studentName1);//add new list to our arrayList
        System.out.println(studentName);


        //6.get value from arrayList
        //time complexity = shifting the rest of the elements causes overall O(N) time complexity
        System.out.println(studentName.get(3));//get value from arrayList


        //7.remove value from arrayList
        studentName.remove(3);//remove value from arrayList
        System.out.println(studentName);


        //8.remove direct element from arrayList
        studentName.remove("Raj");//remove direct element from arrayList
        System.out.println(studentName);


        //9.update value in arrayList
        studentName.set(3, "Kaju");//update value in arrayList
        System.out.println(studentName);

        //10.check if arrayList contains specific value
        //time complexity = O(N)
        System.out.println(studentName.contains("Kaju"));//check if arrayList contains specific value


        //11.iterate through arrayList

        //1.for loop
        for (int i = 0; i < studentName.size(); i++) {
            System.out.println(studentName.get(i));
        }

        //2.for each loop
        for (String name : studentName) {
            System.out.println(name);
        }

        //3.iterator
        Iterator<String> iterator = studentName.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
```
## Output

```java
[Raj, Raju, Ramesh, Rana, Rakesh]
[20, 21, 22, 23, 24]
5
5
[Raj, Raju, Ramesh, Rana, Rakesh, Raju]
[20, 21, 22, 23, 24, 25]
[Raj, Sashi, Raju, Ramesh, Rana, Rakesh, Raju]
[20, 26, 21, 22, 23, 24, 25]
[Raj, Sashi, Raju, Ramesh, Rana, Rakesh, Raju, Mandy, Sandy, Candy]
Ramesh
[Raj, Sashi, Raju, Rana, Rakesh, Raju, Mandy, Sandy, Candy]
[Sashi, Raju, Rana, Rakesh, Raju, Mandy, Sandy, Candy]
[Sashi, Raju, Rana, Kaju, Raju, Mandy, Sandy, Candy]
true
Sashi
Raju
Rana
Kaju
Raju
Mandy
Sandy
Candy
Sashi
Raju
Rana
Kaju
Raju
Mandy
Sandy
Candy
Sashi
Raju
Rana
Kaju
Raju
Mandy
Sandy
Candy
```

# Stack

```java
import java.util.Stack;

public class stackList {
    public static void main(String[] args) {
        //stack - last in first out (LIFO)
        //timecomplexity - O(1)
        Stack<String> animanls = new Stack<>();
        animanls.push("cat");//adds to the top of the stack
        animanls.push("dog");//adds to the top of the stack
        animanls.push("bird");//adds to the top of the stack
        animanls.push("fish"); //adds to the top of the stack

        System.out.println(animanls);

        //1.peek - returns the top element of the stack
        System.out.println(animanls.peek());//looks at the top of the stack

        //2.pop - removes the top element of the stack
        animanls.pop();//removes the top element of the stack
        System.out.println(animanls.peek());

        //3.isEmpty - returns true if the stack is empty
        System.out.println(animanls.isEmpty());

        //4.search - returns true if the element is in the stack
        System.out.println(animanls.search("dog"));

        //5.size - returns the number of elements in the stack
        System.out.println(animanls.size());

        //6.clear - removes all elements from the stack
        animanls.clear();




    }
}

```
## Output

```java
[cat, dog, bird, fish]
fish
bird
false
2
3

```
# Queue(linked list)



```java
import java.util.LinkedList;
import java.util.Queue;
public class LinkedListQueue {
    public static void main(String[] args) {

        //queue is a collection of elements that are inserted and removed according to FIFO
        //queue is a linear data structure
        //queue is a first-in first-out structure [FIFO]
        Queue<String> queue = new LinkedList<>();
        queue.offer("nancy");
        queue.offer("tom");
        queue.offer("jerry");
        queue.offer("kitty");
        System.out.println(queue);

        //1.poll() - removes and returns the head of the queue
        System.out.println(queue.poll());

        //2.peek() - returns the element at the head of the queue without removing it
        System.out.println(queue.peek());

        //3.element() -  returns the element at the head of the queue without removing it
        System.out.println(queue.element());

        //4.remove() - removes the first element
        System.out.println(queue.remove());

        //5.contains() - returns true if the queue contains the specified element
        System.out.println(queue.contains("nancy"));

        //6.add - add element at the end of the queue
        queue.add("jerry");
        System.out.println(queue);

    }
}

```
## Output

```java
[nancy, tom, jerry, kitty]
nancy
tom
tom
tom
false
[jerry, kitty, jerry]
```
# Linked List(list)

```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class linkedList {
    public static void main(String[] args) {

        //LinkedList - double ended queue - first in last out (FIFO)
        //timecomplexity - O(1)



        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);  // This will add 4 at the end of the List.
        System.out.println(list);

        list.add(1, 50); // This will add 50 at index 1. All the other elements will be shifted to right.
        System.out.println(list);

        List<Integer> newList = new ArrayList(); // Creating a new List which will be added to original list.
        newList.add(150);
        newList.add(160);

        list.addAll(newList); // This will add all the elements present in newList to list.
        System.out.println(list);

        System.out.println(list.get(1));

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(70);
        list2.add(80);

        System.out.println(list2);

        for (int i = 0; i < list2.size(); i++) {
            System.out.println("the element is " + list2.get(i));
        }

        for (Integer element: list2) {
            System.out.println("foreach element is " + element);
        }

        Iterator<Integer> it = list2.iterator();

        while (it.hasNext()) {
            System.out.println("iterator " + it.next());
        }

        list2.set(2, 1000);

        System.out.println(list2);

        System.out.println(list2.contains(500));

        list2.remove(1);  // This will remove the element at index 1 i.e 20.
        System.out.println(list2);

        list2.remove(Integer.valueOf(30)); // This will remove 30 from the list
        System.out.println(list2);

        list2.clear(); //This will remove all the elements from the list.
        System.out.println(list2);



    }
}



```

## Output

```java
[1, 2, 3]
[1, 2, 3, 4]
[1, 50, 2, 3, 4]
[1, 50, 2, 3, 4, 150, 160]
50
[10, 20, 30, 40, 50, 60, 70, 80]
the element is 10
the element is 20
the element is 30
the element is 40
the element is 50
the element is 60
the element is 70
the element is 80
foreach element is 10
foreach element is 20
foreach element is 30
foreach element is 40
foreach element is 50
foreach element is 60
foreach element is 70
foreach element is 80
iterator 10
iterator 20
iterator 30
iterator 40
iterator 50
iterator 60
iterator 70
iterator 80
[10, 20, 1000, 40, 50, 60, 70, 80]
false
[10, 1000, 40, 50, 60, 70, 80]
[10, 1000, 40, 50, 60, 70, 80]
[]
```


# Priority Queue

```java
import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    //priorityQueue - ordered collection of unique elements and sorted in ascending order by default
    //timecomplexity - O(log n)
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(121);
        pq.offer(20);
        pq.offer(303);
        pq.offer(40);

        //1. poll() - here we get the highest priority element and remove it from the queue which is the smallest element
        System.out.println(pq.poll());
        System.out.println(pq);


        //2. peek() - here we get the highest priority element ,but it does not remove it from the queue which is the smallest element
        System.out.println(pq.peek());
        System.out.println(pq);

        //3.reverseOrder() - here we reverse the order of the elements in the queue
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.offer(121);
        pq1.offer(20);
        pq1.offer(303);
        pq1.offer(40);

        System.out.println(pq1.poll());
        System.out.println(pq1);

        System.out.println(pq1.peek());
        System.out.println(pq1);
    }
}

```
## Output

```java
20
[40, 121, 303]
40
[40, 121, 303]
303
[121, 40, 20]
121
[121, 40, 20]

```

# Array Deque

```java
import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        //deque - double ended queue
        //timecomplexity - O(1)
        ArrayDeque<String> deque = new ArrayDeque<>();
        //offer - add
        deque.offer("b");
        deque.offerFirst("a");//offerFirst - addFirst
        deque.offerLast("c");//offerLast - addLast

        System.out.println(deque);

        deque.offer("d");//add - addLast
        System.out.println(deque);


        //peek - getFirst
        System.out.println(deque.peek());//getFirst -a
        System.out.println(deque.peekFirst());//getFirst -a
        System.out.println(deque.peekLast());//getLast - d



        //poll - removeFirst
        System.out.println(deque.poll());//removeFirst - a
        System.out.println(deque.pollFirst());//removeFirst - b
        System.out.println(deque.pollLast());//removeLast - d



    }
}


```
## Output

```java
[a, b, c]
[a, b, c, d]
a
a
d
a
b
d

```


# Hash Set

```java
import java.util.Set;
import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {

        //hashSet - unordered collection of unique elements
        //timecomplexity - O(1)
        Set<Integer> set = new HashSet<>();
        set.add(125);
        set.add(225);
        set.add(35);
        set.add(426);
        set.add(58);
        set.add(66);
        System.out.println(set);

        set.add(66);//no duplicate elements allowed in hashSet
        System.out.println(set);

        //1.remove element from hashSet
        set.remove(66);//remove element from hashSet
        System.out.println(set);

        //2.contains - returns true if element is present in hashSet
        System.out.println(set.contains(66));//check if element is present in hashSet

        //3.isEmpty - check if hashSet is empty
        System.out.println(set.isEmpty());//check if hashSet is empty

        //4.size - returns size of hashSet
        System.out.println(set.size());//return size of hashSet

        //5.clear - remove all elements from hashSet
        set.clear();
        System.out.println(set);

    }
}


```
## Output

```java
[225, 66, 35, 426, 58, 125]
[225, 66, 35, 426, 58, 125]
[225, 35, 426, 58, 125]
false
false
5
[]
```


# Linked Hash Set

```java
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;

public class linkedHashSet {
    public static void main(String[] args) {

        //linked hashSet - ordered collection of unique elements
        //timecomplexity - O(1)
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(125);
        set2.add(225);
        set2.add(35);
        set2.add(426);
        set2.add(58);
        set2.add(66);
        System.out.println(set2);

        set2.add(66);//no duplicate elements allowed in hashSet
        System.out.println(set2);

        //1.remove element from hashSet
        set2.remove(66);//remove element from hashSet
        System.out.println(set2);

        //2.contains - returns true if element is present in hashSet
        System.out.println(set2.contains(66));//check if element is present in hashSet

        //3.isEmpty - check if hashSet is empty
        System.out.println(set2.isEmpty());//check if hashSet is empty

        //4.size - returns size of hashSet
        System.out.println(set2.size());//return size of hashSet

        //5.clear - remove all elements from hashSet
        set2.clear();
        System.out.println(set2);

    }
}

```

## Output

```java
[125, 225, 35, 426, 58, 66]
[125, 225, 35, 426, 58, 66]
[125, 225, 35, 426, 58]
false
false
5
[]
```


# Custom Class HashSet

### Student class (studentForSetOfCustomClasses.java)

```java 
import java.util.Objects;

public class studentForSetOfCustomClasses implements Comparable<studentForSetOfCustomClasses> {

    String name;//instance variable
    int rollNo;//rollNo is unique for each student

    public studentForSetOfCustomClasses(String name, int rollNo) {//constructor
        this.name = name;//this keyword is used to refer to the current object
        this.rollNo = rollNo;//constructor
    }

    @Override
    public String toString() {//toString method
        return "studentForSetOfCustomClasses{" +//print hashSet
                "name='" + name + '\'' +//print name
                ", rollNo=" + rollNo +//print rollNo
                '}';
    }

    @Override
    public boolean equals(Object o) {//overriding equals method
        if (this == o) return true;//if both objects are same
        if (o == null || getClass() != o.getClass()) return false;//if both objects are not same
        studentForSetOfCustomClasses student = (studentForSetOfCustomClasses) o;//casting
        return rollNo == student.rollNo;//if both objects are same
    }

    @Override //overriding
    public int hashCode() {//overriding
        return Objects.hash(rollNo);//overriding
    }

    @Override//overriding
    public int compareTo(studentForSetOfCustomClasses that) {//overriding
        return this.rollNo - that.rollNo;//overriding
    }
}

```


### HashSet(setOfCustomClasses.java)

```java
import java.util.HashSet;
import java.util.Set;
public class setOfCustomClasses {
    public static void main(String[] args) {
        Set<studentForSetOfCustomClasses> studentSet = new HashSet<>(); //hashSet - unordered collection of unique elements

        studentSet.add(new studentForSetOfCustomClasses("Anuj", 2));//add element to hashSet
        studentSet.add(new studentForSetOfCustomClasses("Ramesh", 4));
        studentSet.add(new studentForSetOfCustomClasses("Shivam", 3));

        studentSet.add(new studentForSetOfCustomClasses("Rohit", 2));

        studentForSetOfCustomClasses s1 = new studentForSetOfCustomClasses("Sanju", 2);//add element to hashSet
        studentForSetOfCustomClasses s2 = new studentForSetOfCustomClasses("Rohit", 2);//add element to hashSet

        System.out.println(s1.equals(s2));//check if element is present in hashSet
        System.out.println(studentSet);//print hashSet
    }
}

```
## Output

```java
true
        [studentForSetOfCustomClasses{name='Anuj', rollNo=2}, studentForSetOfCustomClasses{name='Shivam', rollNo=3}, studentForSetOfCustomClasses{name='Ramesh', rollNo=4}]
```

# Hash Map

```java
import java.util.Map;
import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        //Map - Map is a collection of key-value pairs.
        //The keys are unique and the values are not.
        //The keys can be of any type, but the values can only be of one type.
        //Time complexity: O(1)
        //Space complexity: O(n)

        Map<String, Integer> maps = new HashMap<>();
        maps.put("a", 1);
        maps.put("b", 2);
        maps.put("c", 3);
        maps.put("d", 4);
        System.out.println(maps);

        //1. we can't do this because we can't change the value of a key if we do then it will overwrite the value
/*       maps.put("a", 5);
       System.out.println(maps);*/



       //2.if else contains - if the key is present then it will return the value of the key
        if (!maps.containsKey("a")){
            maps.put("a", 5);//if the key is not present then it will add the key and value (overwrite)
        }
        maps.putIfAbsent("a",1); //if the key is present then it will not add the key and value(not override)

        //3.iterator - it will return the key and value of the hashMap
        for (Map.Entry<String, Integer> entry : maps.entrySet()){ //entrySet() will return the key and value of the hashMap in the form of set
            System.out.println(entry.getKey() + " " + entry.getValue());//getKey() will return the key and getValue() will return the value and getValue() will return the value of the key
        }

        //4.only iterate over the keys
        for (String key : maps.keySet()){
            System.out.println(key);
        }

        //5.only iterate over the values
        for (Integer value : maps.values()){
            System.out.println(value);
        }

        //6.Check if the hashMap is empty or not
        if (maps.isEmpty()){
            System.out.println("Map is empty");
        }
        else {
            System.out.println("Map is not empty");
        }

        //7.containsKey() - check if the key is present or not
        if (maps.containsKey("a")){
            System.out.println("Key is present");
        }
        else {
            System.out.println("Key is not present");
        }

        //8.containsValue() - check if the value is present or not
        if (maps.containsValue(1)){
            System.out.println("Value is present");
        }
        else {
            System.out.println("Value is not present");
        }

    }
}

```
## Output

```java
{a=1, b=2, c=3, d=4}
a 1
b 2
c 3
d 4
a
b
c
d
1
2
3
4
Map is not empty
Key is present
Value is present
```


# Tree Map

```java
import java.util.Map;
import java.util.TreeMap;
public class treeMap {
    public static void main(String[] args) {
        //treeMap - TreeMap is a collection of key-value pairs.
        //The keys are unique and the values are not.
        //The keys can be of any type, but the values can only be of one type.
        //Time complexity: O(log n)
        //Space complexity: O(n)

        Map<String, Integer> numbers = new TreeMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        System.out.println(numbers);

        numbers.remove("One");
        System.out.println(numbers);
    }
}


```
## Output

```java
{Five=5, Four=4, One=1, Three=3, Two=2}
{Five=5, Four=4, Three=3, Two=2}
```

# Array Class

```java
import java.util.Arrays;

public class arraysClass {

    public static void main(String[] args) {
         //array - array is a collection of elements of the same type.
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        //1.binarySearch - binarySearch is a search algorithm that finds the position of a target value within a sorted array.
        //Time complexity: O(log n)
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println("The index of element 4 in the array is " + index);


        Integer[] numbers2 = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };

        //2.sort - sort is a method that sorts the elements of an array in place.
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        //3.copyOf - copyOf is a method that copies the elements of an array into a new array.
        Integer[] numbers3 = Arrays.copyOf(numbers2, numbers2.length);
        System.out.println(Arrays.toString(numbers3));

          //4.copyOfRange - copyOfRange is a method that copies the elements of an array into a new array.
        Integer[] numbers4 = Arrays.copyOfRange(numbers2, 2, 5);
        System.out.println(Arrays.toString(numbers4));

          //5.ParallelSort - parallelSort is a method that sorts the elements of an array in place.
        Arrays.parallelSort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        //6.fill - fill the array with the specified value
        Arrays.fill(numbers2, 12);
        System.out.println(Arrays.toString(numbers2));
        

        //7.iterate over the array
        for (int i : numbers2) {
            System.out.print(i + " ");
        }



    }
}

```

## Output

```java
The index of element 4 in the array is 3
[2, 9, 10, 12, 15, 17, 32, 48, 76, 79]
[2, 9, 10, 12, 15, 17, 32, 48, 76, 79]
[10, 12, 15]
[2, 9, 10, 12, 15, 17, 32, 48, 76, 79]
[12, 12, 12, 12, 12, 12, 12, 12, 12, 12]
12 12 12 12 12 12 12 12 12 12 
```


# Collection Class

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class collectionClass {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Anuj", 2));
        list.add(new Student("Ramesh", 4));
        list.add(new Student("Shivam", 3));
        list.add(new Student("Rohit", 1));

        Student s1 = new Student("Anuj", 2);
        Student s2 = new Student("Rohit", 3);

        System.out.println((s1.compareTo(s2)));//compareTo method is used to compare two objects

        System.out.println(list); //print list

        Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name)); //sort by name lambda expression

        System.out.println(list);//print list


        List<Integer> lists = new ArrayList<>();
        lists.add(34);
        lists.add(12);
        lists.add(9);
        lists.add(9);
        lists.add(9);
        lists.add(76);
        lists.add(29);
        lists.add(75);
         //Collection.min - returns the minimum element in the collection
        System.out.println("min element " + Collections.min(lists));

        //Collection.max - returns the maximum element in the collection
        System.out.println("max element " + Collections.max(lists));

        //Collection.frequency - returns the frequency of the element in the collection
        System.out.println(Collections.frequency(lists, 9));

        //Collection.reverseOrder - returns a reverse order comparator
        Collections.sort(lists, Comparator.reverseOrder());
        System.out.println(lists);

        //Collection.shuffle - shuffles the collection
        Collections.shuffle(lists);
        System.out.println(lists);

        //Collection.swap - swaps the elements at the specified positions
        Collections.swap(lists, 0, 1);
        System.out.println(lists);

        //Collection.rotate - rotates the collection by the specified number of elements
        Collections.rotate(lists, 2);
        System.out.println(lists);

        //Collection.reverse - reverses the order of the elements in the collection
        Collections.reverse(lists);
        System.out.println(lists);

        //Collection.fill - fills the collection with the specified element
        Collections.fill(lists, 9);
        System.out.println(lists);

        //Collection.replaceAll - replaces all the elements in the collection with the specified element
        Collections.replaceAll(lists, 9, 10);
        System.out.println(lists);


        //Collection.copy - copies the elements in the specified collection to the end of the collection
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        Collections.copy(lists, list2);
        System.out.println(lists);





    }

}

```


### Student Class

```java
import java.util.Objects;

public class Student implements Comparable<Student> {

    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public int compareTo(Student that) {
        return this.rollNo - that.rollNo;
    }
}

```

## Output

```java
-1
[Student{name='Anuj', rollNo=2}, Student{name='Ramesh', rollNo=4}, Student{name='Shivam', rollNo=3}, Student{name='Rohit', rollNo=1}]
[Student{name='Anuj', rollNo=2}, Student{name='Ramesh', rollNo=4}, Student{name='Rohit', rollNo=1}, Student{name='Shivam', rollNo=3}]
min element 9
max element 76
3
[76, 75, 34, 29, 12, 9, 9, 9]
[9, 76, 34, 9, 75, 9, 12, 29]
[76, 9, 34, 9, 75, 9, 12, 29]
[12, 29, 76, 9, 34, 9, 75, 9]
[9, 75, 9, 34, 9, 76, 29, 12]
[9, 9, 9, 9, 9, 9, 9, 9]
[10, 10, 10, 10, 10, 10, 10, 10]
[1, 2, 3, 4, 10, 10, 10, 10]

```