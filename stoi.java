import java.util.*;
public class stoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            String s = sc.nextLine();
            int number = Integer.parseInt(s);
            System.out.println(number);
        }
        catch(NumberFormatException e)
        {
            System.out.print("the string consists of alphabets");
        }
    }
}
