
import java.util.Scanner;

public class sum {
    public static void main(String [] args)
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a = ");
        a=sc.nextInt();
        System.out.print("Enter the number b = ");
        b=sc.nextInt();
        c=a+b;
        System.out.println("Sum of digit = "+c);
    }
}
