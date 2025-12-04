import java.util.*;
public class negativetosqaure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number n = ");
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(arr[j]<0)
            {
                arr[j]=arr[j]*arr[j];
            }
        }
        System.out.println("after the negative number:");
        for(int k=0;k<n;k++)
        {
            System.out.print(" "+arr[k]);
        }
    }
}
