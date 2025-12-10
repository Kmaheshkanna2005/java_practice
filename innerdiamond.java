
import java.util.Scanner;

public class innerdiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int right=n;
        int left=0;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=0;k<n*2-1;k++)
            {
                System.out.print(" ");
            }
            for(int d=i;d>=1;d--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
