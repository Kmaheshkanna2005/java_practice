import java.util.*;
public class product_sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size = ");
        n=sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the number for array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int curr=arr[0];
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            curr=Math.max(curr,curr*arr[i]);
            max=Math.max(curr,max);
        }
        System.out.print("The Max product of the subarray = "+max);
        sc.close();
    }
}
