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
