
// ***
// ***
// ***
import java.util.*;

public class Innerpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of matrix = ");
        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        System.out.println("Enter the number to matrix :");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }

    }
}
