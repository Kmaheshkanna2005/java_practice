import java.util.Scanner;

public class startpyrmid {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int left = n - 1;
        int right = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2 - 1; j++) {
                if (j >= left && j <= right) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            left--;
            right++;
            System.out.println();
        }
    }
}
