import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String toString() {
        return "'" + getName() + "'" + " : " + getAuthor() + "; " + getYearOfRelease() + " год.";
    }
}
