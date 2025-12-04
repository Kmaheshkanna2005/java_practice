interface interfacec{
    public void car();
    public void driver();
}

class team implements interfacec
{
    public void car()
    {
        System.out.println("F1 is the fastest car in the world");
    }
    public void driver()
    {
        System.out.println("F1 driver are the best in the world");
    }
}
class Main
{
    public static void main(String[] args) {
        team f = new team();
        f.car();
        f.driver();
    }
}
