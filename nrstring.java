
import java.util.*;

public class nrstring {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        s=sc.next();
        int n = s.length();
        char[] carr=s.toCharArray();
        int[] arr = new int[26];
        for(int i=0;i<n;i++)
        {
            arr[carr[i]-'a']++;
        }
        for(int i = 0; i < n; i++)
        {
            if(arr[carr[i]-'a']==1)
            {
                System.out.print(carr[i]);
            }
        }
        sc.close();
    }
}
