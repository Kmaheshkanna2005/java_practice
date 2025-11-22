
import java.util.Scanner;

public class samenumberpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s;
        s = sc.nextInt();
        int count = 1;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if (j <= i) {
                    System.out.print(count + " ");
                }
            }
            count++;
            System.out.println(" ");
        }

    }
}
