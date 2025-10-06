
import java.util.*;

public class intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the no arr1 elements = ");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the arr1 elements:");
        for(int l=0;l<n;l++)
        {
            arr[l]=sc.nextInt();
        }
        int m;
        System.out.print("Enter the no arr2 elements = ");
        m=sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the arr2 elements:");
        for(int l=0;l<m;l++)
        {
            arr2[l]=sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i]==arr2[j])
                {
                    list.add(arr[i]);
                }
            }
        }
        System.out.print("intersection of the two array = "+list);
    }
}
