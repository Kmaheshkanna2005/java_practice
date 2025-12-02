import java.util.Scanner;

public class rightprymid {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<count;j++)
            {
                System.out.print("*");
            }
            count++;
            System.out.println(" ");
        }
        int counts=n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<counts;j++)
            {
                System.out.print("*");
            }
            counts--;
            System.out.println(" ");
        }
    }
}
