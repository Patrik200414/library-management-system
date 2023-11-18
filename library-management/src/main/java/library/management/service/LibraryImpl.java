package library.management.service;

import library.management.logger.Logger;
import library.management.model.Book;
import library.management.model.Member;

import java.util.ArrayList;
import java.util.List;

public class LibraryImpl implements Library{

    private final List<Book> books;
    private final List<Member> members;
    private final List<Book> borrowedBooks;
    private Logger logger;

    public LibraryImpl(Logger logger) {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.borrowedBooks = new ArrayList<>();
        this.logger = logger;
    }

    public void addBooks(Book... books){
        for(Book book : books){
            this.books.add(book);
        }
    }

    public void addMembers(Member... members){
        for(Member member : members){
            this.members.add(member);
        }
    }


    @Override
    public void borrowBook(Member member, Book book) {
        if(books.contains(book)){
            book.changeAvaibility();
            member.addBorrowedBook(book);
            borrowedBooks.add(book);
            books.remove(book);
        }
    }

    @Override
    public void returnBook(Member member, Book book) {
        if(member.getBorrowedBooks().contains(book)){
            book.changeAvaibility();
            member.returnBookBack(book);
            borrowedBooks.remove(book);
            books.add(book);
        }
    }

    @Override
    public void displayBooks() {
        for(Book book : books){
            logger.infoLogger(book.toString());
        }
    }

    @Override
    public void displayMembersWithBorrowedBooks() {
        for(Member member : members){
            if(!member.getBorrowedBooks().isEmpty()){
                logger.infoLogger(member.toString() + ": " + member.getBorrowedBooks());
            }
        }
    }
}
