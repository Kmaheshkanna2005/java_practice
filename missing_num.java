import java.util.*;
public class missing_num {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,4,5,6));
        for (int i = 0; i < arr.size() - 1; i++) 
        {
             if (arr.get(i) + 1 != arr.get(i + 1)) {
                arr.add(i + 1, arr.get(i) + 1);
            }
        }
        //int []arr={1,2,4,5,6};
        /*for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]+1!=arr[i+1])
            {
                
            }
        }*/
        System.out.println(arr);
    }
}
