import java.util.*;
public class gcd
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 1;
        for(int i=1;i<Math.min(a,b);i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd = i;
            }
        }
        System.out.print("the gcd of the two numbers = "+gcd);
    }
}