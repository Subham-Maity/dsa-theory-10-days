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
