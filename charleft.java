
import java.util.Scanner;

public class charleft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char s = sc.next().charAt(0);
        int ascii = s;
        for(int i=0;i<n;i++)
        {
            ascii = s;
            for(int j=n;j>i;j--)
            {
                char word = (char) ascii;
                System.out.print(word+" ");
                ascii++;
            }
            System.out.println(" ");
        }
    }
}
