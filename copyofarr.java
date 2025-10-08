import java.util.Scanner;

public class copyofarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.err.print("Enter the size = ");
        n=sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            arr2[i]=arr[i];
        }
        System.out.println("copy of arr1->arr2:");
        for(int j=0;j<n;j++)
        {
            System.out.print(arr2[j]+" ");
        }
    }
}
