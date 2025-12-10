
import java.util.Scanner;

public class palchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        System.out.print("the element in the array = ");
        int n = arr.length;
        for(char c :arr)
        {
            System.out.print(c+" ");
        }
        boolean is = true;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(arr[i]!=arr[j])
            {
                is = false;
            }
            i++;
            j--;
        }
          System.out.println();
        if(is)
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");
    }
}
