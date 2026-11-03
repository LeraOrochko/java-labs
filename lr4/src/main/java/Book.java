public class Book {
    private String title;
    private Genre genre;

    public Book(String title, Genre genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public String toString() {
        return title + " (" + genre + ")";
    }

    public static void main(String[] args) {
        Book[] books = {
                new Book("Властелин колец", Genre.FANTASY),
                new Book("Гарри Поттер", Genre.FANTASY),
                new Book("Краткая история времени", Genre.SCIENCE),
                new Book("Сапиенс", Genre.HISTORY),
                new Book("1984", Genre.FICTION)
        };

        System.out.println("Книги жанра FANTASY:");
        for (Book b : books) {
            if (b.getGenre() == Genre.FANTASY) {
                System.out.println(b);
            }
        }
    }
}