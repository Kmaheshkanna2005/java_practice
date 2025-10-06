
import java.util.Scanner;

public class sec_large {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.print("Enter the number of elements = ");
        n=sc.nextInt();
        int []arr = new int[n];
        System.err.println("Enter the numbers:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length;j++)
        {
            for(int t=0;t<arr.length;t++)
            {
            if(arr[j]<arr[t])
            {
                int temp = arr[t];
                arr[t]=arr[j];
                arr[j]=temp;
            }
            }
      
        }
        System.err.println("the element in the array:");
        for(int g=0;g<arr.length;g++)
        {
            System.err.println(arr[g]);
        }
        int k;
        System.out.print("Enter the kth largest element = ");
        k=sc.nextInt();
        System.out.print("the kth largest element is = "+arr[n-k]);
    }
}
