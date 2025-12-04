import java.util.*;

public class comprefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2,s3;
        System.out.print("Enter the s1 = ");
        s1=sc.next();
        System.out.print("Enter the s2 = ");
        s2=sc.next();
        System.out.print("Enter the s3 = ");
        s3=sc.next();
        int minLen=Math.min(s1.length(),Math.min(s2.length(),s3.length()));
        StringBuilder prefix = new StringBuilder();
        for(int i=0;i<minLen;i++)
        {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            char ch3 = s3.charAt(i);
            if(ch1==ch2 && ch2==ch3)
            {
                prefix.append(ch1);
            }
            else{
                break;
            }
    }
     if (prefix.length() > 0) {
            System.out.println("Longest Common Prefix = " + prefix.toString());
        } else { 
            System.out.println("No common prefix");
        }
       sc.close(); 
}
}
