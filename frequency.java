import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

         if (s1.length() != s2.length()) {
            System.out.println("False");
            return;
        }
        int[] freq = new int[26];
        for(char c:s1.toCharArray())
        {
            freq[c-'a']++;
        }
        for(char c:s2.toCharArray())
        {
            freq[c-'a']--;
        }
        for(int a:freq)
        {
            if(a!=0)
            {
                System.out.print("False");
                return;
            }
        }
        System.out.print("True");
    }
}
