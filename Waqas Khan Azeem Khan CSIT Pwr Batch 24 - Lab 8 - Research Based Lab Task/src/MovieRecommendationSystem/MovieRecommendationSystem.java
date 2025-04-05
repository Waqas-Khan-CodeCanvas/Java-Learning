package MovieRecommendationSystem;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovieRecommendationSystem {
    private static final HashMap<String, Movie> movies = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Movie");
            System.out.println("2. Rate Movie");
            System.out.println("3. Display Movies by Genre");
            System.out.println("4. Sort Movies by Rating");
            System.out.println("5. Search Movies");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addMovie(scanner);
                    break;
                case 2:
                    rateMovie(scanner);
                    break;
                case 3:
                    displayMoviesByGenre(scanner);
                    break;
                case 4:
                    sortMoviesByRating();
                    break;
                case 5:
                    searchMovies(scanner);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }

    private static void addMovie(Scanner scanner) {
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter release year: ");
        int releaseYear = scanner.nextInt();
        System.out.print("Enter average rating: ");
        double averageRating = scanner.nextDouble();

        movies.put(title.toLowerCase(), new Movie(title, genre, releaseYear, averageRating));
        System.out.println("Movie added successfully.");
    }

    private static void rateMovie(Scanner scanner) {
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine().toLowerCase();

        if (movies.containsKey(title)) {
            System.out.print("Enter your rating: ");
            double rating = scanner.nextDouble();
            movies.get(title).addRating(rating);
            System.out.println("Rating added successfully.");
        } else {
            System.out.println("Movie not found.");
        }
    }

    private static void displayMoviesByGenre(Scanner scanner) {
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();

        List<Movie> filteredMovies = movies.values().stream()
                .filter(movie -> movie.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());

        if (filteredMovies.isEmpty()) {
            System.out.println("No movies found in this genre.");
        } else {
            System.out.println("Movies in " + genre + " genre:");
            filteredMovies.forEach(movie -> System.out.println("- " + movie));
        }
    }

    private static void sortMoviesByRating() {
        List<Movie> sortedMovies = movies.values().stream()
                .sorted(Comparator.comparingDouble(Movie::getAverageRating).reversed())
                .collect(Collectors.toList());

        if (sortedMovies.isEmpty()) {
            System.out.println("No movies available.");
        } else {
            System.out.println("Movies sorted by rating:");
            sortedMovies.forEach(movie -> System.out.println("- " + movie));
        }
    }

    private static void searchMovies(Scanner scanner) {
        System.out.print("Enter movie title to search: ");
        String title = scanner.nextLine().toLowerCase();

        List<Movie> searchResults = movies.values().stream()
                .filter(movie -> movie.getTitle().toLowerCase().contains(title))
                .collect(Collectors.toList());

        if (searchResults.isEmpty()) {
            System.out.println("No movies found.");
        } else {
            System.out.println("Search Results:");
            searchResults.forEach(movie -> System.out.println("- " + movie));
        }
    }
}
