
import java.util.Scanner;

public class encapsulation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name = ");
        String name = sc.nextLine();

        encapsulation1 obj = new encapsulation1();
        obj.setname(name);
        System.out.print("the name is = "+obj.getname());
    }
}
