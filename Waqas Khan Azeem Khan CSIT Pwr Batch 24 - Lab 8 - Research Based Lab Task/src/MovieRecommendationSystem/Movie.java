package MovieRecommendationSystem;

class Movie {
    private String title;
    private String genre;
    private int releaseYear;
    private double averageRating;
    private int ratingCount;

    // Constructor
    public Movie(String title, String genre, int releaseYear, double averageRating) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.averageRating = averageRating;
        this.ratingCount = 1;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getAverageRating() {
        return averageRating;
    }

    // Method to update rating
    public void addRating(double rating) {
        this.averageRating = (this.averageRating * this.ratingCount + rating) / (this.ratingCount + 1);
        this.ratingCount++;
    }

    @Override
    public String toString() {
        return title + " (" + releaseYear + ", Genre: " + genre + ", Rating: " + String.format("%.1f", averageRating) + ")";
    }
}
