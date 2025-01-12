import java.util.Scanner;

public class RecursionExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your number first ");
        int n = sc.nextInt();

        int facto = Factorial(n);

        System.out.println("factorial of the given number : " + facto);
    }
    private static int Factorial(int x){
        int total = 0;

        if(x < 1){
            return 1;
        }
        else {
            total = x * Factorial(x-1);
        }
        return total;
    }
}
