import java.util.Scanner;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int newLength = removeDuplicates(arr, n);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Function to remove duplicates
    public static int removeDuplicates(int[] arr, int n) {
        if (n == 0 || n == 1)
            return n;

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        // Copy back unique elements to arr[]
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        return j; // new length of array
    }
}
