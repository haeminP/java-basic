package extends1;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("Java", 10, "han", "12345");
        Album album = new Album("Album1", 15, "seo");
        Movie movie = new Movie("Movie1", 18, "director1", "actor1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("Total price of items: " + sum);

    }
}
