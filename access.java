import java.util.Scanner;

class Demo {
    public String name;
    private int age;
    protected String phone; 

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

 
    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

 
    public int getAge() {
        return age;
    }


    public void setPhone(String phone) {
        if (phone.length() == 10 && phone.matches("[0-9]+")) {
            this.phone = phone;
        } else {
            System.out.println("Invalid phone number");
        }
    }


    public String getPhone() {
        return phone;
    }
}

public class access {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo obj = new Demo();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        obj.setName(name);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        obj.setAge(age);

        sc.nextLine(); 

        System.out.print("Enter your phone: ");
        String phone = sc.nextLine();
        obj.setPhone(phone);

        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Phone: " + obj.getPhone());

        sc.close();
    }
}