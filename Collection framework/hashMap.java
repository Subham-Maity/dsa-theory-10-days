import java.util.Map;
import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        //Map - Map is a collection of key-value pairs.
        //The keys are unique and the values are not.
        //The keys can be of any type, but the values can only be of one type.
        //Time complexity: O(1)
        //Space complexity: O(n)

        Map<String, Integer> maps = new HashMap<>();
        maps.put("a", 1);
        maps.put("b", 2);
        maps.put("c", 3);
        maps.put("d", 4);
        System.out.println(maps);

        //1. we can't do this because we can't change the value of a key if we do then it will overwrite the value
/*       maps.put("a", 5);
       System.out.println(maps);*/



       //2.if else contains - if the key is present then it will return the value of the key
        if (!maps.containsKey("a")){
            maps.put("a", 5);//if the key is not present then it will add the key and value (overwrite)
        }
        maps.putIfAbsent("a",1); //if the key is present then it will not add the key and value(not override)

        //3.iterator - it will return the key and value of the hashMap
        for (Map.Entry<String, Integer> entry : maps.entrySet()){ //entrySet() will return the key and value of the hashMap in the form of set
            System.out.println(entry.getKey() + " " + entry.getValue());//getKey() will return the key and getValue() will return the value and getValue() will return the value of the key
        }

        //4.only iterate over the keys
        for (String key : maps.keySet()){
            System.out.println(key);
        }

        //5.only iterate over the values
        for (Integer value : maps.values()){
            System.out.println(value);
        }

        //6.Check if the hashMap is empty or not
        if (maps.isEmpty()){
            System.out.println("Map is empty");
        }
        else {
            System.out.println("Map is not empty");
        }

        //7.containsKey() - check if the key is present or not
        if (maps.containsKey("a")){
            System.out.println("Key is present");
        }
        else {
            System.out.println("Key is not present");
        }

        //8.containsValue() - check if the value is present or not
        if (maps.containsValue(1)){
            System.out.println("Value is present");
        }
        else {
            System.out.println("Value is not present");
        }

    }
}
