
import java.util.Scanner;

public class onepyrmid {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        int nums=1;
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<=i;j++)
            {
            //int val = (i + j + 1) % 2; optimal
               if(num==0)
               {
                System.out.print(num+" ");
                num=1;
               }
               else
               {
                System.out.print(num+" ");
                num=0;
               }
            }
            System.out.println(" ");
            if(nums==1)
            {
                num=0;
                nums=0;
            }
            else
            {
                num=1;
                nums=1;
            }
        }
    }
}
