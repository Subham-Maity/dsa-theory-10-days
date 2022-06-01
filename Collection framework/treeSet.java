import java.util.Set;
import java.util.TreeSet;
public class treeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        //treeSet - ordered collection of unique elements and sorted in ascending order
        //timecomplexity - O(log n)
        Set<Integer> set3 = new TreeSet<>();
        set3.add(125);
        set3.add(225);
        set3.add(35);
        set3.add(426);
        set3.add(58);
        set3.add(66);
        System.out.println(set3);

        set3.add(66);//no duplicate elements allowed in hashSet
        System.out.println(set3);

        //1.remove element from hashSet
        set3.remove(66);//remove element from hashSet
        System.out.println(set3);

        //2.contains - returns true if element is present in hashSet
        System.out.println(set3.contains(66));//check if element is present in hashSet

        //3.isEmpty - check if hashSet is empty
        System.out.println(set3.isEmpty());//check if hashSet is empty

        //4.size - returns size of hashSet
        System.out.println(set3.size());//return size of hashSet

        //5.clear - remove all elements from hashSet
        set3.clear();
        System.out.println(set3);

    }
}


