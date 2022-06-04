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
