
import java.util.*;

public class replacechartoint {
    public static void main(String[] args) {
        String s;
        System.out.print("Enter the string = ");
        Scanner sc = new Scanner(System.in);
        s=sc.next();
        char[] arr = s.toCharArray();
        ArrayList<Character> arr2 = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < arr.length; i++) {

            if (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                count++;
            } else {
                arr2.add(arr[i]);
                char l = (char) (count + '0');
                arr2.add(l);
                count = 1;

            }
        }
        System.out.print("the element in the array = " + arr2);
    }
}
