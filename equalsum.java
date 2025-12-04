import java.util.*;


public class equalsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the no elements = ");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the arr1 elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int center = n/2;
        int count=0;
        for(int i=0;i<n;i++)
        {
            int sumr=0;
            int suml=0;
            for(int j=0;j<center;j++)
            {
                suml+=arr[j];
            }
            for(int k=center;k<n;k++)
            {
                sumr+=arr[k];
            }
            if(suml!=sumr)
            {
                if(sumr>suml)
                {
                    center++;
                }
                else if(suml>sumr)
                {
                    center--;
                }
            }
                if(suml==sumr)
                {
                    count++;
                    System.out.println("the sum of right = " +suml+ " , the sum of left = "+sumr);
                    System.out.println("The sum is equal");
                    break;
                }
            }
        if(count==0)
        {
            System.out.print("the sum is not found");
        }
        }
    }
