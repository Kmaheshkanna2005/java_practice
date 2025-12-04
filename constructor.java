class Book {
    String title;
    String author;

    // Parameterized constructor
    Book(String title) {
        this("welcome","Unknown Author"); // ✅ calls another constructor in same class
    }

    // Another constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Ignited Minds");
        b1.display();
    }
}
