package TestJava;

public class BookTest {
    public static void main(String[] args) {
        Author author = new Author("Tin", 19, "Thailand");
        Book book = new Book("Java Programming", 100, author);
        System.out.println("Book name: " + book.name);
        System.out.println("Book price: " + book.price);
        System.out.println("Author name: " + book.author.authorName);
        System.out.println("Author age: " + book.author.age);
        System.out.println("Author place: " + book.author.place);

    }
}
