import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to add");
        int n = sc.nextInt();
        int sum = 0;

        for ( int i =1; i <=n; i++){
            sum= sum + i;
//            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
