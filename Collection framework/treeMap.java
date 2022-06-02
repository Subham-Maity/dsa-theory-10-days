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
