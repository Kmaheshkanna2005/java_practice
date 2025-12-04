import java.util.Scanner;
public class encapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) { 
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }

    public static void main(String[] args) {
        encapsulation obj = new encapsulation();
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        name = sc.nextLine();
        age = sc.nextInt();
        obj.setName(name);
        obj.setAge(age);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
   
}
