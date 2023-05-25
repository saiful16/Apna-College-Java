import java.util.Scanner;

public class SolidRectengle {
    public static void main(String[] args) {
        System.out.println("Enter the number of Columnn : ");
        Scanner sc = new Scanner(System.in);
        int column = sc.nextInt();
        System.out.println("Enter the number of Row :");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++){
            for (int j= 1; j<= column;  j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
