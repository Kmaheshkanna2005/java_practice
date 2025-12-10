import java.util.*;

public class typemis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int s  = sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.print("the mismatch data type");
        }
        finally
        {
            System.out.print("done");
        }
    }
}
