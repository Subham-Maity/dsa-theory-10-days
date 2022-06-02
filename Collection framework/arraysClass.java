import java.util.Arrays;

public class arraysClass {

    public static void main(String[] args) {
         //array - array is a collection of elements of the same type.
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        //1.binarySearch - binarySearch is a search algorithm that finds the position of a target value within a sorted array.
        //Time complexity: O(log n)
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println("The index of element 4 in the array is " + index);


        Integer[] numbers2 = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };

        //2.sort - sort is a method that sorts the elements of an array in place.
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        //3.copyOf - copyOf is a method that copies the elements of an array into a new array.
        Integer[] numbers3 = Arrays.copyOf(numbers2, numbers2.length);
        System.out.println(Arrays.toString(numbers3));

          //4.copyOfRange - copyOfRange is a method that copies the elements of an array into a new array.
        Integer[] numbers4 = Arrays.copyOfRange(numbers2, 2, 5);
        System.out.println(Arrays.toString(numbers4));

          //5.ParallelSort - parallelSort is a method that sorts the elements of an array in place.
        Arrays.parallelSort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        //6.fill - fill the array with the specified value
        Arrays.fill(numbers2, 12);
        System.out.println(Arrays.toString(numbers2));


        //7.iterate over the array
        for (int i : numbers2) {
            System.out.print(i + " ");
        }



    }
}
