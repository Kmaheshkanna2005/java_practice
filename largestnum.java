import java.util.*;

public class largestnum
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array = ");
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int j=0;j<n;j++)
        {
            max=Math.max(max, arr[j]);
        }
        System.out.print("The largestnumber in the array = "+max);
    }
}