import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<Integer, String> hMap = new HashMap<>();


        //1.Write a Java program to test if a map contains a mapping for the specified key.
        hMap.put(1, "USA");
        hMap.put(2, "Germany");
        hMap.put(3, "Italy");
        hMap.put(4, "Switzerland");
        hMap.put(5, "France");
        hMap.put(6, "UK");
        System.out.println(hMap.get(3));


        //2.Write a Java program to copy all of the mappings from the specified map to another map.
        HashMap<Integer, String> hMap2 = new HashMap<>();
        hMap2.putAll(hMap);
        System.out.println(hMap2);


        //3.Remove a value from HashMap based on key.
        hMap.remove(5);
        System.out.println(hMap);

    }
}
