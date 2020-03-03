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
        list1.removeAll(Arrays.asList(2));
        System.out.println(list1);
        
        
        //3.Remove all odd numbers
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 6, 7, 3, 2, 1));
        java.util.Iterator<Integer> itr = list2.iterator();
        while (itr.hasNext()) {
            int val = itr.next();
            if (val % 9 == 0 || val % 2 != 0) {
                itr.remove();
            }
        }
        System.out.println(list2);
    }
}

