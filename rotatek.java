
import java.util.*;

public class rotatek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the value n = ");
        n=sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements in the array:");
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
        int k;
        System.out.print("\nEnter the k = ");
        k=sc.nextInt();
        int[] arr2 = new int[arr.length];
        int p=0;
        for(int l=n-k;l<n;l++)
        {
            arr2[p]=arr[l];
            p++;
        }
        int z=0;
        while(p<arr.length)
        {
            arr2[p]=arr[z];
            p++;
            z++;
        }
        for(int j=0;j<n;j++)
        {
            System.out.print(arr2[j]+" ");
        }

    }
}
