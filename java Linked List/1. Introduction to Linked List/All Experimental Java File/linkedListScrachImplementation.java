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
