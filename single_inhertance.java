class f1 {
    f1()
    {
        System.out.println("F1 most expensive sport");
    }
}
class cars extends f1
{
    cars()
    {
        System.out.println("F1 car is fast in world");
    }
}

public class single_inhertance
{
    public static void main(String[] args) {
        cars car = new cars();
    }
}
