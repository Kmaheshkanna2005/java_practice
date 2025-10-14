
import java.util.Scanner;

public class firstnonrepeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String s = sc.next();
        int count=0;
        int[] freq = new int[256];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)]++;
        }
        char result='\0';
        for(int j=0;j<s.length();j++)
        {
            
            if(freq[s.charAt(j)]==1)
            {
                result = s.charAt(j);
                break;
            }
        }
         if (result != '\0')
            System.out.println("First non-repeating character: " + result);
        else
            System.out.println("No non-repeating character found.");
    }
}
