import java.util.Scanner;

public class TwoDimentioalArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] numners =  new int [rows][cols];
        //for taking input
        for (int i =0; i <rows; i++){
            for (int j = 0; j < cols; j++){
                numners [i][j]= sc.nextInt();
            }

        }
        //for output
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(numners[i][j] + " ");
            }
            System.out.println();
        }
    }
}
