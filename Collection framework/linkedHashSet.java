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
