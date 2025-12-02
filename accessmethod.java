public class accessmethod {
    public void fullspeed()
    {
        System.out.println("car is in full speed");
    }
    public void maxspeed(int m)
    {
        int max = m;
        System.out.println("maxspeed = " + max);
    }
    public static void main(String[] args) {
        accessmethod ac = new accessmethod();
        ac.fullspeed();
        ac.maxspeed(200);
    }
}
