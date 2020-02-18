
public class Main {

    public static void main(String[] args) {

        // 1.Create a loop that will print numbers from 1 to 10, except number 7
        for (int n = 1; n <= 10; n++) {
            if (n == 7) continue;
            System.out.println(n);
        }

        //2.Create An Array of integers from 1 to 5, Call an integer on array using index and print it.
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(array [4]);

        //3.Call index outside of the bound. Handle this exception printing “Outside of bound message.”
        try{
            int[] array2 = {1,2,3,4,5,6,7};
            System.out.println(array2 [8]);
        }catch (Exception e) {
            System.out.println("Outside of bound message!");
        }

    }
}