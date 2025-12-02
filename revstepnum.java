import java.util.Scanner;

public class revstepnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        int n=x;
        int count=1;
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            n--;
            count=1;
            System.out.println(" ");
        }
    }
}
