import java.util.*;
public class allpairsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of input = ");
        n=sc.nextInt();
        System.out.println("Enter the number :");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target value = ");
        int target = sc.nextInt();
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n;k++)
            {
                if(arr[j]+arr[k]==target)
                {
                    System.out.print("The given "+arr[k]+" and "+arr[j]+" pair is equal to the target = "+target);
                }
                break;
            }
        }
    }
}
