
// import java.util.Scanner;

// public class vnum {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n = sc.nextInt();
//         int countf=1;
//         int countb=n;
//         int space=n-2;
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<=i;j++)
//             {
//                 System.out.print(countf+" ");
//                 countf++;
//             }
//             for(int k=0;k<space;k++)
//             {
//                 System.out.print(" ");
//             }
//             int m=n;
//             for(int l=n;l>=m;l--)
//             {
//                 System.out.print(countb+" ");
//                 countb++;
//                 m--;
//             }
//             System.out.println(" ");
//         }
//     }
// }

import java.util.Scanner;

public class vnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
                // count++;
            }
            // count=1;
            for(int k=0;k< (n - i) * 2;k++)
            {
                System.out.print(" ");
            }
            for(int d=i;d>=1;d--)
            {
                System.out.print(d);
            }
            System.out.println();
        }
        }
       
    }



