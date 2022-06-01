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
