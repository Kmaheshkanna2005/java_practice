
import java.util.Scanner;

public class atoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = sc.next().charAt(0);
        int ascii = ch;
        for(int i=0;i<=n;i++)
        {
            ascii = ch+n;
            for(int j=0;j<i;j++)
            { 
                ascii--;
            }
            for(int k=0;k<=i;k++)
            {
                char s = (char) ascii;
                System.out.print(s+" ");
                ascii++;
            }
            System.out.println(" ");
        }
    }
    
}
