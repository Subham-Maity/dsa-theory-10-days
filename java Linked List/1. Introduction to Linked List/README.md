# Linked list
## **Theory**

*****************

## 1. Basic Notes
- Searching in linked list time complexity is O(n)

- Searching in Array List time complexity is O(1)

**1. so O(1) < O(n) so we can use ArrayList for searching.**


- Insertion in linked list time complexity is O(1)

- Insertion in Array List time complexity is O(n)

**2. so O(1) < O(n) so we can use linked list for insertion add operation.**

## 2. Basic Properties

- variable size - we can insert and delete any number of elements in linked list.
- Non-contiguous memory - Elements are not necessarily in adjacent locations in memory.
- Insert Time Complexity - O(1)
- Search Time Complexity - O(n)

**Extra**

- Delete Time Complexity - O(1)
- Access Time Complexity - O(1)
- Memory Usage - O(n)
- Iteration Time Complexity - O(n)
- Sorting Time Complexity - O(n^2)
- add operation - O(1)
- remove operation - O(1)
- get operation - O(1)
- set operation - O(1)
- contains operation - O(n)
- clear operation - O(n)
- size operation - O(1)
- isEmpty operation - O(1)
- toArray operation - O(n)
- toString operation - O(n)
- equals operation - O(n)


## Node


![1_5G07dDNWd8Rjl8Ytjbm8_Q](https://user-images.githubusercontent.com/97989643/171975448-83de74de-5061-40c1-b04c-814f5b01b6e7.gif)


### **Node** 
- is a class which contains data and reference to next node.
- Node class has two properties:
    - data
    - next
Data is the data stored in the node.
Next is a reference to the next node.

### **Empty node** 
- is a node which contains no data and no reference to next node. 
- Empty node is a special node which is used to represent the end of the linked list.

### Head 
- Head is a special node which is used to represent the beginning of the linked list.
- If we have a linked list with only one node, then head is the only node. 
- If we have a linked list with more than one node, then head is the first node.

## Type of Linked List

1. Circular Linked List
2. Doubly Linked List
3. Singly Linked List


### 1. Singly Linked List
- Singly linked list is a linear data structure in which each element is connected to the previous element by a direct pointer called next.
### 2. Circular Linked List
- Circular linked list is a linked list in which the last node's next pointer points back to the first node.
### 3. Doubly Linked List
- Doubly linked list is a linked list in which each element is connected to the previous and next element by two pointers called next and previous.


## Practical 
****************************************

## 1. Linked List Class Scratch Implementation 

![Linked List Add Remove Funtion Work](https://user-images.githubusercontent.com/97989643/171987038-04b2c485-b2ec-43da-becb-76f123f22090.png)

### Code

```java
public class linkedListScrachImplementation {// class
  Node head;// head of the list
  private int size;// size of the list

  linkedListScrachImplementation () {// constructor
    size = 0;// initializing the size of the list
  }




  //a. Create a node class
  public class Node {//1. Node class is created
    String data; //2. data of the node is string
    Node next;//3.node class has a next node and a data field to store the data

    Node(String data) {//4. constructor
      this.data = data; //5. this is the current node
      this.next = null;//6. next node is null by default
      size++;//7. increment size of the list by 1 each time a node is added to the list (size++)
    }
  }






  //c. how we add first a node to the list - Initially, we create a new node that points to null.Now it points to the head of the list, and we make the head our new node and remove the old head.
  public void addFirst(String data) {//9. addFirst method is created
    Node newNode = new Node(data); //10. new node is created
    newNode.next = head; //11. new node points to the head of the list
    head = newNode; //12. head is now the new node
  }









  //d. how we add last node to the list - We create a new node and now this one point it to null. We then traverse the list until we find the last node.
  // We then point the (already present in linked list)last node's next to the new created node and make the new node the last node ,and last node already points to null.

  // NOTE: NEVER MANIPULATE THE HEAD OF THE LIST DIRECTLY BECAUSE IF WE DO SO, WE LOSE THE LINK TO THE NEXT NODE
  //SO ALWAYS TRY TO CREATE A CURRENT NODE AND THEN USE IT TO TRAVERSE THE LIST AND MAKE CHANGES TO THE LIST
  public void addLast(String data) {//13. addLast method is created
    Node newNode = new Node(data);//14. new node is created

    if(head == null) {//15. if head is null, we add the new node to the list
      head = newNode;//16. head is now the new node
      return;//17. return
    }

    Node currNode = head;// 18. current node is head
    while(currNode.next != null) { // 19. while current node's next is not null
      currNode = currNode.next; // 20. current node is now the next node
    }

    currNode.next = newNode;// 21. current node's next is now the new node
  }









  //e.how we print the list - We create a current node and point it to the head.
  // We then print the data of the current node and then point the current node to the next node.
  // We continue this until we reach the end of the list.
  public void printList() {//22. printList method is created
    if (head == null) {//23. if head is null, we return
      System.out.println("list is empty");//24. print list is empty
    }
    Node currNode = head;//25. current node is head

    while(currNode != null) {//26. while current node is not null
      System.out.print(currNode.data+" -> ");//27. print the data of the current node
      currNode = currNode.next;//28. current node is now the next node
    }

    System.out.println("null");//29. print null
  }








  //f. how we remove first node from the list - make the head's next node the new head and then remove the old head and decrement the size of the list by 1
  // Old head is now collected by JAVA garbage collector.
  public void removeFirst() {//30. removeFirst method is created
    if(head == null) {//31. if head is null, we return
      System.out.println("Empty List, nothing to delete");//32. print empty list
      return;//33. return
    }

    head = this.head.next;//34. head is now the next node
    size--;//35. decrement size of the list by 1
  }



  //g. how we remove last node from the list - We create a current node and point it to the head. We then traverse the list until we find the second last node.
  // then we make the second last node's next to null.
  public void removeLast() {//36. removeLast method is created
    if(head == null) {//37. if head is null, we return
      System.out.println("Empty List, nothing to delete");//38. print empty list
      return;//39. return
    }

    size--;//40. decrement size of the list by 1 before size-- because we are removing the last node

    //suppose corner case is there when there is only one node in the list ,and we want to delete it then we need to make head null
    //like this -> head.next = null -> last node  null.next ( not possible)
    if(head.next == null) {//41. if head's next is null, we make head null
      head = null;//42. head is now null
      return;//43. return
    }


    Node secondLast = head;//44. second last node is head
    Node lastNode = head.next;//45. last node is head's next
    while(lastNode.next != null) {//46. while last node's next is not null
      secondLast = secondLast.next;//47. second last node is now the next node
      lastNode = lastNode.next;//48. last node is now the next node
    }

    secondLast.next = null;//49. second last node's next is now null
  }

  public int getSize() {//50. getSize method is created
    return size;//51. return size
  }




  //h. how to add in the middle of the list - We create a current node and point it to the head.
  // We then traverse the list until we find the node after the node we want to add.
  // We then point the current node's next to the new node and make the new node's next point to the next node of the current node.
  public void addInMiddle(int index, String data) {//52. addInMiddle method is created
    if(index > size || index < 0) {//53. if index is greater than size or index is less than 0, we return
      System.out.println("Invalid Index value");//54. print invalid index value
      return;//55. return
    }
    size++;//56. increment size of the list by 1

    Node newNode = new Node(data);//57. new node is created
    if(head == null || index == 0) {//58. if head is null or index is 0, we add the new node to the list
      newNode.next = head;//59. new node's next is now the head
      head = newNode;//60. head is now the new node
      return;//61. return
    }// 62. if index is not 0, we add the new node to the list
    Node currNode = head;//63. current node is head
    for(int i=1; i<size; i++) {//64. for loop
      if(i == index) {//65. if i is equal to index
        Node nextNode = currNode.next;//66. next node is current node's next
        currNode.next = newNode;//67. current node's next is now the new node
        newNode.next = nextNode;//68. new node's next is now the next node
        break;//69. break
      }
      currNode = currNode.next;//70. current node is now the next node
    }
  }

  //i. how to remove in the middle of the list - We create a current node and point it to the head. We then traverse the list until we find the node after the node we want to remove. We then point the current node's next to the next node of the next node. We then remove the next node.
  public void removeInMiddle(int index) {//71. removeInMiddle method is created
    if(index > size || index < 0) {//72. if index is greater than size or index is less than 0, we return
      System.out.println("Invalid Index value");//73. print invalid index value
      return;//74. return
    }
    size--;//75. decrement size of the list by 1

    if(head == null || index == 0) {//76. if head is null or index is 0, we remove the first node
      head = head.next;//77. head is now the next node
      return;//78. return
    }
    Node currNode = head;//79. current node is head
    for(int i=1; i<size; i++) {//80. for loop
      if(i == index) {//81. if i is equal to index
        Node nextNode = currNode.next.next;//82. next node is current node's next's next

        currNode.next = nextNode;//83. current node's next is now the next node
        break;//84. break
      }
      currNode = currNode.next;//85. current node is now the next node
    }
  }

  //j. how to find the middle of the list - We create a current node and point it to the head. We then traverse the list until we find the node after the node we want to find. We then return the current node.
  public Node findMiddle() {//86. findMiddle method is created
    if(head == null) {//87. if head is null, we return
      System.out.println("Empty List, nothing to find");//88. print empty list
      return null;//89. return null
    }
    Node currNode = head;//90. current node is head
    for(int i=0; i<size/2; i++) {//91. for loop
      currNode = currNode.next;//92. current node is now the next node
    }
    return currNode;//93. return current node
  }

  //how to search for a node in the list - We create a current node and point it to the head. We then traverse the list until we find the node we want to search for. We then return the current node.
  public Node search(String data) {//94. search method is created
    if(head == null) {//95. if head is null, we return
      System.out.println("Empty List, nothing to search");//96. print empty list
      return null;//97. return null
    }
    Node currNode = head;//98. current node is head
    while(currNode != null) {//99. while current node is not null
      if(currNode.data.equals(data)) {//100. if current node's data is equal to data
        return currNode;//101. return current node
      }
      currNode = currNode.next;//102. current node is now the next node
    }
    return null;//103. return null

  }







  public static void main(String args[]) {
    //b. Create a linked list class
    linkedListScrachImplementation list = new linkedListScrachImplementation(); //8. linked List class is created
    list.addLast("is");
    list.addLast("a");
    list.addLast("list");
    list.printList();



    list.addInMiddle(2, "and");
    list.printList();


    System.out.println(list.search("list"));


    System.out.println(list.findMiddle().data);


    list.removeInMiddle(2);
    list.printList();




    list.addFirst("this");
    list.printList();


    System.out.println(list.getSize());



    list.removeFirst();
    list.printList();



    list.removeLast();
    list.printList();
  }
}



```

### Output
```java
is -> a -> list -> null
        is -> a -> and -> list -> null
        linkedListScrachImplementation$Node@4c873330
        and
        is -> a -> list -> null
        this -> is -> a -> list -> null
        5
        is -> a -> list -> null
        is -> a -> null
```


## 2. Linked List using Collections Framework

```java
import java.util.*;
public class LinkedListImplementationCollectionFramework { public static void main(String[]args) {
    LinkedList<String> list = new LinkedList<>();//creating a linked list
    list.add("is");//adding elements to the linked list
    list.add("a");//adding elements to the linked list
    list.addLast("list");//adding elements to the linked list
    list.addFirst("this");//adding elements to the linked list
    list.add(3, "linked");//adding elements to the linked list
    System.out.println(list);//printing the linked list

    System.out.println(list.get(0));//printing the first element of the linked list
    System.out.println(list.size());//printing the size of the linked list
    list.remove(3);//removing the element at index 3
    list.removeFirst();//removing the first element of the linked list
    list.removeLast();//removing the last element of the linked list

    System.out.println(list);//printing the linked list
}
}

```

### output
```java
[this, is, a, linked, list]
this
5
[is, a]

```

## 3. More Linked List methods
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