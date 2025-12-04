import java.util.*;
public class mostocc {
    public static void main(String[] args) {
        // Scanner sc =  new Scanner(System.in);
        // ArrayList<Integer> da = new ArrayList<>();
        int[] arr={1,1,2,2,2,1,2,2};
        int n=arr.length-1;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        int majority = -1;
        for (int key : map.keySet()) {
            if (map.get(key) > n / 2) {
                majority = key;
                break;
            }
        }

        System.out.println("Majority element: " + majority);
    }
}
