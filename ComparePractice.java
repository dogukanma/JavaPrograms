public class ComparePractice {
  public static void main(String[] args) {
    Movie[] movies = {
        new Movie("The Hurt Locker", "Kathryn Bigelow", 2008, "R", 97, 7.5),
        new Movie("In the Heights", "John M. Chu", 2021, "PG-13", 94, 7.4),
        new Movie("Aliens", "James Cameron", 1986, "R", 97, 8.3),
        new Movie("Shadow of a Doubt", "Alfred Hitchcock", 1943, "PG", 100, 7.8),
        new Movie("Toy Story", "John Lasseter", 1995, "G", 100, 8.3),
        new Movie("Twelve Monkeys", "Terry Gilliam", 1995, "R", 89, 8.0)
    };

    for (Movie movie : movies) {
      System.out.println(movie);
    }

    Movie best = movies[0];
    for (Movie movie : movies) {
      if (movie.compareTo(best) > 0) {
        best = movie;
      }
    }
    System.out.println("The best movie: " + best.getTitle());
  }
}

class Movie implements Comparable<Movie> {
  private String title;
  private String director;
  private int releaseDate;
  private String rating;
  private int rottenTomatoes;
  private double imdb;

  Movie(String title, String director, int releaseDate, String rating, int rottenTomatoes, double imdb) {
    this.title = title;
    this.director = director;
    this.releaseDate = releaseDate;
    this.rating = rating;
    this.rottenTomatoes = rottenTomatoes;
    this.imdb = imdb;
  }

  public String getDirector() {
    return director;
  }

  public double getImdb() {
    return imdb;
  }

  public String getRating() {
    return rating;
  }

  public int getReleaseDate() {
    return releaseDate;
  }

  public int getRottenTomatoes() {
    return rottenTomatoes;
  }

  public String getTitle() {
    return title;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public void setImdb(double imdb) {
    this.imdb = imdb;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public void setReleaseDate(int releaseDate) {
    this.releaseDate = releaseDate;
  }

  public void setRottenTomatoes(int rottenTomatoes) {
    this.rottenTomatoes = rottenTomatoes;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title + " (" + releaseDate + "), directed by " + director + ". Rated: " + rating + ". IMDB: " + imdb;
  }

  @Override
  public int compareTo(Movie other) {
    if (this.getImdb() > other.getImdb()) {
      return 1;
    } else if (this.getImdb() < other.getImdb()) {
      return -1;
    } else {
      return this.getRottenTomatoes() - other.getRottenTomatoes();
    }
  }
}