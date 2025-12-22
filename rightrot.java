public class rightrot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[arr.length];
        arr2[0]=arr[arr.length-1];
        for(int j=1;j<arr.length;j++)
        {
            arr2[j]=arr[j-1];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}
