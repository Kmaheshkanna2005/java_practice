import java.util.*;
public class productall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number = ");
        n=sc.nextInt();
        int pro=1;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            pro*=arr[i];
        }
        System.out.println("the product of the element:");
        for(int i=0;i<n;i++)
        {
            arr[i]=pro/arr[i];
            System.out.print(arr[i]+" ");
        }
    
    }
}
