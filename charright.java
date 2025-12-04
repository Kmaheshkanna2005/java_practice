
import java.util.Scanner;

public class charright {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char word = sc.next().charAt(0);
        int ascii = word;
        // System.out.println("the word = "+word);
        // System.out.println("the ascii value = "+ascii);
        for(int i=0;i<n;i++)
        {
            ascii=word;
            for(int j=0;j<=i;j++)
            {
                char cha = (char) ascii;
                System.out.print(cha+" ");
                ascii++;
            }
            System.out.println(" ");
        }

    }
}
