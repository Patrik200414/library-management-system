package library.management;

import library.management.logger.ConsoleLogger;
import library.management.logger.Logger;
import library.management.model.Book;
import library.management.model.Member;
import library.management.service.Library;
import library.management.service.LibraryImpl;

public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Library library = new LibraryImpl(consoleLogger);

        Book book1 = new Book("Harry Potter","JK Rowling", 1,true);
        Book book2 = new Book("Harry Potter","JK Rowling", 2,true);
        Book book3 = new Book("Harry Potter","JK Rowling", 3,true);
        Book book4 = new Book("Harry Potter","JK Rowling", 4,true);
        Book book5 = new Book("Harry Potter","JK Rowling", 5,true);

        Member m1 = new Member("Some One", 1);
        Member m2 = new Member("Some One", 2);
        Member m3 = new Member("Some One", 3);
        Member m4 = new Member("Some One", 4);


        library.addBooks(book1,book2,book3,book4,book5);
        library.addMembers(m1,m2,m3,m4);

        library.borrowBook(m1, book1);
        library.borrowBook(m1, book2);
        library.borrowBook(m2, book3);

        library.returnBook(m2, book3);

        library.displayMembersWithBorrowedBooks();

    }
}