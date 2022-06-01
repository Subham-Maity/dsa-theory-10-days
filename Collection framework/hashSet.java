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
