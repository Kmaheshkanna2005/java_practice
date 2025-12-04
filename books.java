import java.util.Scanner;

public class books
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the number of records to display = ");
        //int n=sc.nextInt();
        book b1 = new book("Mahi","kanna",16);
        b1.display();
    }
}
class book
{
    
        String title;
        String author;
        int numberofpage;
        book(String n,String a,int m)
        {
            this.title=n;
            this.author=a;
            this.numberofpage=m;
        }
    
    void display()
    {
        System.out.println("name: "+title+" author: "+author+" numberofpage: "+numberofpage);
    }
}