import java.util.Scanner;

public class sumall {
    public static void main(String[] args) {
        System.out.print("Enter the size = ");
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int[] arr = new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            count+=arr[i];
        }
        System.out.print("The sum of all number = "+count);
    }
}
