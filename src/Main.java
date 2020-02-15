import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter String here:");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int count = word.length();

        if (count % 2 == 0) {
            System.out.println("String is even");

        }else {
            System.out.println("String is not even");
        }
    }
}
