// access without static 

// public class accessinnerclass {
//     int y = 20;
//     class outer
//     {
//         int x =10;
//     }
//     public static void main(String[] args)
//     {
//        accessinnerclass ac = new accessinnerclass();
//        accessinnerclass.outer ot = ac.new outer();
//        System.out.println(ot.x);
//        System.out.println(ac.y);
//     }
// }

// access with static 

public class accessinnerclass
{
    static class name
    {
        String n = "Mahesh Kanna";
    }
    public static void main(String[] args) {
        accessinnerclass.name in = new accessinnerclass.name();
        System.out.println(in.n);
    }
}
