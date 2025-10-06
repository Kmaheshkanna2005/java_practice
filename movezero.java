import java.util.*;
public class movezero
{
    public static void main(String[] args) {
        int[] arr={1,0,0,4,5};
        int i,j,count=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[count++]=arr[i];
            }
        }
            while(count<arr.length)
            {
                arr[count++]=0;
            }
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(" "+arr[k]);
        }
    }
}