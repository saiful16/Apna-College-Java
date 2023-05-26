import java.util.Scanner;

public class HollowRectengle {
    public static void main(String[] args) {
        System.out.println("Enter the number of Colum :");
        Scanner sc = new Scanner(System.in);
        int column = sc.nextInt();
        System.out.println("Enter the number of row :");
        int row= sc.nextInt();

        for (int i = 1; i <= row; i++){
            for (int j=1; j <= column; j++){
                if ( i == 1 || i== row || j==1 || j==column ){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
