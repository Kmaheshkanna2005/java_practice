import java.util.Scanner;

class multidemarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the number to Size = ");
        size = sc.nextInt();
        int[][] arr = new int[size][size];
        System.out.println("Enter the number to arrays:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Numbers in the array:");
        for(int a=0;a<size;a++)
        {
            for(int b=0;b<size;b++)
            {
                System.out.print(arr[a][b]+" ");
            }
            System.out.println(" ");
        }
    }

}