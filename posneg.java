
import java.util.*;

public class posneg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value = ");
        int n;
        n=sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        boolean pn = true;
        int l=0,k=0,b=0;
        while(l<pos.size() && k<neg.size())
        {
            if(pn)
            {
                arr[b++]=pos.get(l++);
            }
            else{
                arr[b++]=neg.get(k++);
            }
            pn=!pn;
        }
        while (l < pos.size())
        {
            arr[b++] = pos.get(l++);
        }
         
        while (k < neg.size())
        {
            arr[b++] = neg.get(k++);
        }

        System.out.print("the array after this = "+Arrays.toString(arr));
    }
}
