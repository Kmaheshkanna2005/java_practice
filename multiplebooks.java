import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class multiplebooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<book> list = new ArrayList<>();

        System.out.print("Enter the number of books = ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Book " + (i + 1) + " ---");
            
            System.out.print("Enter the name of the book = ");
            String name = sc.nextLine();

            System.out.print("Enter the name of the author = ");
            String author = sc.nextLine();

            System.out.print("Enter the number of pages = ");
            int number = sc.nextInt();
            sc.nextLine(); 

            book b1 = new book(name, author, number);
            list.add(b1);
        }

        System.out.println("\n*** Library Catalogue ***");
        for (book b : list) {
            b.display();
            System.out.println();
        }
        
        sc.close();
    }

    static class book {
        String n;
        String a;
        int nu;

        book(String name, String author, int number) {
            n = name;
            a = author;
            nu = number;
        }

        void display() {
            System.out.println("Name = " + n);
            System.out.println("Author = " + a);
            System.out.println("Pages = " + nu);
        }
    }
}
