import java.util.*;
public class multiarray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("the element in the array:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int b=0;b<n;b++)
        {
            for(int a=0;a<n;a++)
            {
                System.out.print(arr[b][a]+" ");
                
            }
            System.out.println(" ");
        }
    }
}