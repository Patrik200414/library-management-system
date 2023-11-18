package library.management.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    public void checkIfBookRecordWorks(){
        Book book1 = new Book("Harry Potter", "JK. Rowling", 1231231, true);
        assertEquals("Harry Potter", book1.getTitle());
    }

    @Test
    public void checkIfBookStateIsChangeing(){
        Book book1 = new Book("Harry Potter", "JK. Rowling", 1231231, true);
        book1.changeAvaibility();
        assertFalse(book1.isAvaible());
    }

    @Test
    public void checkIfBookAddedToBorrowedList(){
        Member m1 = new Member("Some One", 1);
        Book book1 = new Book("Harry Potter", "JK. Rowling", 1231231, true);

        m1.addBorrowedBook(book1);

        assertEquals(1, m1.getBorrowedBooks().size());
    }
    @Test
    public void checkIfAllBookAddedToBorrowedList(){
        Member m1 = new Member("Some One", 1);
        Book book1 = new Book("Harry Potter", "JK. Rowling", 1231231, true);
        Book book2 = new Book("Harry Potter", "JK. Rowling", 1231231, true);
        Book book3 = new Book("Harry Potter", "JK. Rowling", 1231231, true);
        Book book4 = new Book("Harry Potter", "JK. Rowling", 1231231, true);

        m1.addAllBooksToBorrowedList(book1, book2, book3, book4);

        assertEquals(4, m1.getBorrowedBooks().size());
    }

}