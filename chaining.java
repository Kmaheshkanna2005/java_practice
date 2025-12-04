class Animal {
    Animal() {
        System.out.println("Animal Constructor Called");
    }
}

class Dog extends Animal {
    Dog() {
         
        System.out.println("Dog Constructor Called");
    }
}

class Puppy extends Dog {
    Puppy() {
        
        System.out.println("Puppy Constructor Called");
    }
}

public class chaining{
    public static void main(String[] args) {
        Puppy p = new Puppy();
    }
}
