import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {
    public static void main(String[] args) {

        //1.creating an arrayList
        //ArrayList is a class that can store multiple data types
        ////timecomplexity - O(1)
        ArrayList<String> studentName = new ArrayList<>();//creating an arrayList of strings
        ArrayList<Integer> studentAge = new ArrayList<>();//creating an arrayList of integers
        studentName.add("Raj");//adding elements to the arrayList
        studentName.add("Raju");//adding elements to the arrayList
        studentName.add("Ramesh");//adding elements to the arrayList
        studentName.add("Rana");//adding elements to the arrayList
        studentName.add("Rakesh");//adding elements to the arrayList
        studentAge.add(20);//adding elements to the arrayList
        studentAge.add(21);//adding elements to the arrayList
        studentAge.add(22);//adding elements to the arrayList
        studentAge.add(23);//adding elements to the arrayList
        studentAge.add(24);//adding elements to the arrayList

        System.out.println(studentName);
        System.out.println(studentAge);

        //2.size = n then size increase = n + n/ + 1

        System.out.println(studentName.size());//size of arrayList
        System.out.println(studentAge.size());//size of arrayList


        //3.add value to arrayList - this will add the value at the end of the arrayList
        studentName.add("Raju");//add value at the end of arrayList
        studentAge.add(25);//add value at the end of arrayList
        System.out.println(studentName);
        System.out.println(studentAge);


        //4.add value at specific index
        studentName.add(1, "Sashi");//add value at specific index
        studentAge.add(1, 26);//add value at specific index
        System.out.println(studentName);
        System.out.println(studentAge);


        //5.add new list to our arrayList
        ArrayList<String> studentName1 = new ArrayList<>();
        studentName1.add("Mandy");
        studentName1.add("Sandy");
        studentName1.add("Candy");

        studentName.addAll(studentName1);//add new list to our arrayList
        System.out.println(studentName);


        //6.get value from arrayList
        //time complexity = shifting the rest of the elements causes overall O(N) time complexity
        System.out.println(studentName.get(3));//get value from arrayList


        //7.remove value from arrayList
        studentName.remove(3);//remove value from arrayList
        System.out.println(studentName);


        //8.remove direct element from arrayList
        studentName.remove("Raj");//remove direct element from arrayList
        System.out.println(studentName);


        //9.update value in arrayList
        studentName.set(3, "Kaju");//update value in arrayList
        System.out.println(studentName);

        //10.check if arrayList contains specific value
        //time complexity = O(N)
        System.out.println(studentName.contains("Kaju"));//check if arrayList contains specific value


        //11.iterate through arrayList

        //1.for loop
        for (int i = 0; i < studentName.size(); i++) {
            System.out.println(studentName.get(i));
        }

        //2.for each loop
        for (String name : studentName) {
            System.out.println(name);
        }

        //3.iterator
        Iterator<String> iterator = studentName.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}