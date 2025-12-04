public class privateaccess {
    private String name = "Mahesh Kanna";
    private int num = 19;
    private String depart = "CSE";
    public int age = 18;

    public static void main(String[] args) {
        privateaccess pa = new privateaccess();
        System.out.println("name = "+pa.name);
        System.out.println("number = "+pa.num);
        System.out.println("age  = "+pa.age);
    }
}
