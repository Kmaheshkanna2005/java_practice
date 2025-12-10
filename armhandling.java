import java.util.*;
public class armhandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        try
        {
            int result = a%b;
            if(result==0)
            {
                System.out.println("the num is div");
            }
            else{
                System.out.println("the num is not div");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("the number cannot be divided by Zero");
        }
        finally
        {
            System.out.println("operation is complete");
            sc.close();
        }
    }
}
