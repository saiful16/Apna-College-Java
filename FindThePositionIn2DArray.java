import java.util.Scanner;

public class FindThePositionIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [] [] numbers = new int[rows][cols];
        // for user input the data
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                numbers [i] [j] = sc.nextInt();
            }
        }
//        for (int i = 0; i < rows; i++){
//            for (int j = 0; j < cols; j++){
//                System.out.print(numbers[i]  [j] + " ");
//            }
//            System.out.println();
//        }

        int x = sc.nextInt();

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (x == numbers[i][j]){
                    System.out.println(" X is found at location : " + i +","+ j);
                }
            }
        }
    }
}
