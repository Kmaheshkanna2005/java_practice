import java.util.*;
public class con_string {
    public static void main(String[] args) {
        String str = "ABCD";
        String str2 = str;
        String str3=str+str2;
        System.out.println(str3);
        Scanner sc =new Scanner(System.in);
        String str4;
        System.out.print("Enter the string = ");
        str4=sc.next();
         if (str3.contains(str4)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }  

    }
}

// import java.util.*;

// public class con_string {
//     public static void main(String[] args) {
//         String str = "ABCD";
//         String str2 = str;
//         String str3 = str + str2; // str3 is now "ABCDABCD"
        
//         System.out.println(str3);

//         // Call the manual function to check for the substring
//         if (manualContains(str3, "DABC")) {
//             System.out.println("True");
//         } else {
//             System.out.println("False");
//         }
//     }

//     public static boolean manualContains(String mainStr, String subStr) {
//         int n = mainStr.length();
//         int m = subStr.length();

//         for (int i = 0; i <= n - m; i++) {
//             int j;
//             for (j = 0; j < m; j++) {
//                 if (mainStr.charAt(i + j) != subStr.charAt(j)) {
//                     break;
//                 }
//             }
//             if (j == m) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }

