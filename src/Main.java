import java.util.*;

public class Main {

    public static void main(String[] args) {


        //1.Initiate a Set. Using For loop add integers from 1 to 10.
        Set<Integer> test = new HashSet<>();
        for (int i = 1; i < 11; i++) {
            test.add(i);
        }
        System.out.println(test);


        //2.Remove all odd numbers from sets.
        int m = 0;
        Set<Integer> convert = new HashSet<>(test);
        for (int j = 0; j < convert.size(); j++) {
            java.util.Iterator<Integer> itr = convert.iterator();
            while (itr.hasNext()) {
                int val = itr.next();
                if (val % 9 == 0 || val % 2 != 0) {
                    itr.remove();
                }
            }
        }
        System.out.println(convert);


                    //3.Try to create a set with duplicate values.
                    Set<Integer> duplicate = new HashSet<>();
                    duplicate.add(8);
                    duplicate.add(3);
                    duplicate.add(8);
                    duplicate.add(2);
                    duplicate.add(3);
                    duplicate.add(101);

                    System.out.println(duplicate);



    }


}