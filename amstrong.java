
import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=n;
        int b=n ;
        int count=0;
        while(num>0)
        {
            num=num/10; 
            count++;
        }
        System.out.print("the count of the number = "+count);
        int sum=0;
        while(b>0)
        {
            int a = b%10;
            for(int i=0;i<count;i++)
            {
                sum=sum*a;
            }
            b/=10;
        }
        System.out.print("the sum is = "+sum);
        if(n==sum)
        {
            System.out.print("the given number is amstrong");
        }
        else{
            System.out.println("\nthe given number is not a amstrong");
        }
    }
}
