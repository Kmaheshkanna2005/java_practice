
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word = ");
        String word = sc.nextLine();
        System.out.print("words = "+word);
        String[] input = word.split(" ");
        String rev=" ";
        for(int i=input.length-1;i>=0;i--)
        {
            rev+=input[i];
            if(i!=0)
            {
                rev+=" ";
            }
        }
        System.out.print("\nthe rev word = "+rev);
    }
}
