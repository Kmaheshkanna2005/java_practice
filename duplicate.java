import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.err.print("Enter the size = ");
        n=sc.nextInt();
        int[] arr = new int[n];
        //int[] arr2 = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("the duplicate in arr:");
        for(int j=0;j<n-1;j++)
        {
            for(int l=j+1;l<n;l++)
            {
            if(arr[j]==arr[l])
            {
                System.out.print(arr[j]+" ");
                break;
            }
            }
        }
        
    }
}
