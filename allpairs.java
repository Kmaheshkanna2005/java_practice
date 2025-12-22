public class allpairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int sum = arr[0];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int result = arr[i]+arr[j];
                if(result>sum)
                {
                    sum=result;
                }
            }
        }
        System.out.print("the greater sum = "+sum);
    }
}
