package library.management.service;

import library.management.model.Book;
import library.management.model.Member;

public interface Library {
    void borrowBook(Member member, Book book);
    void returnBook(Member member, Book book);
    void displayBooks();
    void displayMemberswithBorrowedBooks();
    void addBooks(Book... books);
    void addMembers(Member... members);
}
