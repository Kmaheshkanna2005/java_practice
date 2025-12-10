
import java.util.Scanner;

public class nullpointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            String s=null;
            System.out.println(s.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("enter the value for string");
        }
    }
}
