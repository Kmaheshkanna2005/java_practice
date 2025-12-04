
import java.util.Scanner;

public class revstpyrmid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int left=0;
        int right=2*n-2;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n*2-1;j++)
            {
                if(j>=left && j<=right)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            left++;
            right--;
            System.out.println();
        }
    }
}
