import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class collectionClass {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Anuj", 2));
        list.add(new Student("Ramesh", 4));
        list.add(new Student("Shivam", 3));
        list.add(new Student("Rohit", 1));

        Student s1 = new Student("Anuj", 2);
        Student s2 = new Student("Rohit", 3);

        System.out.println((s1.compareTo(s2)));//compareTo method is used to compare two objects

        System.out.println(list); //print list

        Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name)); //sort by name lambda expression

        System.out.println(list);//print list


        List<Integer> lists = new ArrayList<>();
        lists.add(34);
        lists.add(12);
        lists.add(9);
        lists.add(9);
        lists.add(9);
        lists.add(76);
        lists.add(29);
        lists.add(75);
         //Collection.min - returns the minimum element in the collection
        System.out.println("min element " + Collections.min(lists));

        //Collection.max - returns the maximum element in the collection
        System.out.println("max element " + Collections.max(lists));

        //Collection.frequency - returns the frequency of the element in the collection
        System.out.println(Collections.frequency(lists, 9));

        //Collection.reverseOrder - returns a reverse order comparator
        Collections.sort(lists, Comparator.reverseOrder());
        System.out.println(lists);

        //Collection.shuffle - shuffles the collection
        Collections.shuffle(lists);
        System.out.println(lists);

        //Collection.swap - swaps the elements at the specified positions
        Collections.swap(lists, 0, 1);
        System.out.println(lists);

        //Collection.rotate - rotates the collection by the specified number of elements
        Collections.rotate(lists, 2);
        System.out.println(lists);

        //Collection.reverse - reverses the order of the elements in the collection
        Collections.reverse(lists);
        System.out.println(lists);

        //Collection.fill - fills the collection with the specified element
        Collections.fill(lists, 9);
        System.out.println(lists);

        //Collection.replaceAll - replaces all the elements in the collection with the specified element
        Collections.replaceAll(lists, 9, 10);
        System.out.println(lists);


        //Collection.copy - copies the elements in the specified collection to the end of the collection
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        Collections.copy(lists, list2);
        System.out.println(lists);





    }

}
