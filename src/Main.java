public class Main {

    public static void main(String[] args) {
        fizzBuzz(1, 100);
        palindrome("Was it a cat I saw?");

    }

    //1.Solve FizzBuzz exercise using recursion.
    public static void fizzBuzz ( int a, int b){
        if (a <= b) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            } else if (a % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(a);
            }
            fizzBuzz(a + 1, b);
        }
    }

    //2.Solve Palindrome exercise using recursion.
    public static void palindrome(String givenString){
        givenString=givenString.replaceAll("\\W", "").toUpperCase();
        if(givenString.length()== 0 || givenString.length()==1){
            System.out.println("This string is a palindrome");
            return;
        }
        if(givenString.charAt(0)== givenString.charAt(givenString.length()-1)){
            palindrome(givenString.substring(1,givenString.length()-1));
        }else{
            System.out.println("This string is NOT a palindrome");
        }
    }
}
