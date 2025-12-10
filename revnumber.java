import java.util.Scanner;

public class revnumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int num = sc.nextInt();
        int n = num;
        int sum=0;
        while(n!=0)
        {
            int count = n%10;
            sum = sum*10+count;
            n=n/10;
        }
        System.out.println("the reverse of the number is  = "+sum);
    }
}