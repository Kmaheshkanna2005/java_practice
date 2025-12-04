
import java.util.Scanner;

public class revsteppattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > 0; j--) {
                if (j>i) {
                    System.out.print("*" + " ");
                }
            }
            System.out.println(" ");
        }
    }
}
