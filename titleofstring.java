import java.util.*;
public class titleofstring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter the string = ");
        s=sc.nextLine();
        String[] arr = s.split(" ");
        StringBuilder titleCaseString = new StringBuilder();
        for(String arrs:arr)
        {
            if(arrs.length()>0)
            {
                String firstletter = arrs.substring(0,1).toUpperCase();
                String remaining = arrs.substring(1).toLowerCase();
                titleCaseString.append(firstletter).append(remaining).append(" ");
            }
        }
        System.out.print("the title for the stirng = "+titleCaseString.toString().trim());
    }
}