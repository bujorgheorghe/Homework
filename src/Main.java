import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //1.Initiate an Arraylist. Using For loop add integers from 1 to 10
        List<Integer> test = new ArrayList<>(Arrays.asList());
        for (int i = 1; i < 11; i++) {
            test.add(i);
        }
        System.out.println(test);

        //2.Create an ArrayList [1,2,3,6,7,3,2,1]. Remove all 2 from Arraylist
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 6, 7, 3, 2, 1));
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == 2) {
                list1.remove(i);
            }
        }
        System.out.println(list1);

        //3.Remove all odd numbers
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 6, 7, 3, 2, 1));
        int m = 0;
        for (int j = 0; j < list2.size(); j++) {
            if (list2.get(j) % 2 != 0) {
                list2.remove(j);
                j -= m;
                m++;
            }
        }
        System.out.println(list2);
    }
}

