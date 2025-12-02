
import java.util.Scanner;

public class atoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = sc.next().charAt(0);
        int ascii = ch;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                char s = (char) ascii;
                System.out.print(s+" ");
            }
            ascii++;
            System.out.println(" ");
        }
    }
    
}
