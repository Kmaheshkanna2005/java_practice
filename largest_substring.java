import java.util.*;
public class largest_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a="abcabccbb";
        //System.out.print("Enter the string = ");
        //a=sc.next();
        char[] arr=a.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
          for (char c : arr) {
            set.add(c); 
        }
        System.out.print("Unique characters: ");
        for (char c : set) {
            System.out.print(c);
        }
    }
}
