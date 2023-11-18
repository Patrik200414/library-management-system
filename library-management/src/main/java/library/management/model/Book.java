package library.management.model;

import java.util.Objects;

public class Book {
    private final String title;
    private final String author;
    private final int isbn;
    private boolean avaibility;

    public Book(String title, String author, int isbn, boolean avaibility) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.avaibility = avaibility;
    }

    public void changeAvaibility(){
        boolean newAvaibleState = !avaibility;
        avaibility = newAvaibleState;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    public boolean isAvaible() {
        return avaibility;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return isbn == book.isbn && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", avaibility=" + avaibility +
                '}';
    }
}
