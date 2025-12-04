import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String s = sc.nextLine(); 
        
        String m = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isWhitespace(c)) {
                m += Character.toLowerCase(c);
            }
        }

  
        boolean isPalindrome = true;
        int n = m.length();
        for (int i = 0; i < n / 2; i++) {
            if (m.charAt(i) != m.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
        sc.close();
    }
}
