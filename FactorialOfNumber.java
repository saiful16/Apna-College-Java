import java.util.Scanner;

public class FactorialOfNumber {

    public static void factorialOfNumbers(int n){
        int factorial = 1;

        if (n <0){
            System.out.println("Invalid input");
            return;
        }

        for ( int i =n; i >=1; i--){
            factorial = factorial * i;
        }
        System.out.println("Factorial of the number is "+ factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        factorialOfNumbers(n);

    }
}
