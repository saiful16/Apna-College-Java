import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Enter the number of row : ");

        for (int i =5; i >=1; i--){
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
