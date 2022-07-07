public class Book {
    private final Author author;
    private String name;
    private int yearOfRelease;
    public Book(String name, Author author, int yearOfRelease) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.author = author;
    }

    public Author getAuthor() {
        return this.author;
    }
    public String getName() {
        return this.name;
    }

    public int getYearOfRelease() {
        return this.yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
}
