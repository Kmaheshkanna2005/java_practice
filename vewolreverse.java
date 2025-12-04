import java.util.*;
public class vewolreverse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.print("Enter the String = ");
        n=sc.next();
        char[] arr = n.toCharArray();
        //System.out.print("the string = "+n);
        int left = 0;
        int right = arr.length-1;
    
        while(left<right)
        {
            while(left<right && !isvowel(arr[left]))
            {
                left++;
            }
            while(left<right && !isvowel(arr[right]))
            {
                right--;
            }
            if(isvowel(arr[left]) && isvowel(arr[right]))
            {
                char temp = arr[left];
                arr[left] =arr[right];
                arr[right] = temp; 
                left++;
                right--;
            }
        }
        for(int i=0;i<n.length();i++)
        {
            System.out.print(" "+arr[i]);
        }
      
    }
      public static boolean isvowel(char c)
        {
            c=Character.toLowerCase(c);
            return (c=='a' || c=='e' ||c=='i' ||c=='o'||c=='u');
        }
}
