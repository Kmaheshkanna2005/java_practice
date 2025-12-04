class f1
{
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
class driver extends cars
{
    driver()
    {
        System.out.println("f1 driver are best in the world");
    }
}

public class multilevel {
    public static void main(String[] args) {
        driver dr = new driver();
    }
}
