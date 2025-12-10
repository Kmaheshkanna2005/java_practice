import java.util.*;
public class arrayindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        try
        {
            System.out.print(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array index is not exists");
        }
    }
}
