package extends1;

public class Book extends Item {
    public String author;
    public String isbn;


    public Book(String name, int price, String author, String isbn){
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- Author: " + author + ", isbn: " + isbn);
    }
}
