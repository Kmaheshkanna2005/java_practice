
import java.util.*;

public class reversearr {
    public static void main(String[]args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of size = ");
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        // approach 1:
        // System.out.print("reverse of the array:");
        // for(int j=n-1;j>=0;j--)
        // {
        //     System.out.print(" "+arr[j]);
        // }
        // sc.close();
        // approach 2:
        System.out.println("reverse of the array2:");
        int y=0;
        int z=n-1;
        while(y!=z)
        {
            int temp=arr[y];
            arr[y]=arr[z];
            arr[z]=temp;
            y++;
            z--;
        }
         for(int l=0;l<n;l++)
        {
            System.out.println(arr[l]);
        }
    }
}
