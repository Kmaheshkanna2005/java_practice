import java.util.*;

public class largestandsmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number = ");
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int j;
        for(j=0;j<n;j++)
        {
            for(int k=0;k<n;k++)
            {
                if(arr[j]<arr[k])
                {
                    int temp =arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                }
            }
        }
         for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int diff = arr[arr.length-1]-arr[0];
        System.out.print("\nthe difference = "+diff);
    }
}
