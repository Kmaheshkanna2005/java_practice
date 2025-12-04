class f1
{
    f1() {
        System.out.println("F1 most expensive sport");
    } 
}
class cars extends f1
{
    cars()
    {
        System.out.println("F1 is fastest car");
    }
}
class driver extends f1
{
    driver()
    {
        System.out.println("F1 driver are best in the world");
    }
}


public class Hierarchical{
    public static void main(String[] args) {
        driver dr = new driver();
        cars cr= new cars();
    }
}
