abstract class abstracts{
    abstract void animalSound();
    public void cat()
    {
        System.out.println("the cat is walking");
    }
}
 class dog extends abstracts
    {
        public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Main
{
    public static void main(String[] args) {
        dog d = new dog();
        d.animalSound();
        d.cat();
    }
}

