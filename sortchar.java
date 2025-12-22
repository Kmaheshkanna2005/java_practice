import java.util.*;
public class sortchar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        for(char j=0;j<n-1;j++)
        {
            int aib = (int) arr[j];
            for(char k=0;k<n-1;k++)
            {
                int ai = (int) arr[k];
                if(ai>aib)
                {
                    char temp = arr[aib];
                    arr[aib] = arr[ai];
                    arr[ai] = temp;
                }
            }
        }
        for(char i=0;i<n-1;i++)
        {
            System.out.print(arr[i]);
        }
    }
}