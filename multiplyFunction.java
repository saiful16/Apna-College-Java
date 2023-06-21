import java.util.Scanner;

public class multiplyFunction {

    public static int multipyNumbers( int a, int b){
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = multipyNumbers(a, b);
        System.out.println(product);
    }
}
