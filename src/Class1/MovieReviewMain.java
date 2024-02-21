package Class1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movie1 = new MovieReview();
        MovieReview movie2 = new MovieReview();

        MovieReview[] movies = {movie1, movie2};


        movie1.title = "Inception";
        movie1.review = "Life is an infinite loop";

        movie2.title = "About Time";
        movie2.review = "Life and time";

        for (MovieReview movie: movies){
            System.out.println("Movie Name: " + movie.title + ", Movie Review: " + movie.review);
        }


    }
}
