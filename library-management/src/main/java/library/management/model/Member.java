package library.management.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Member {
    private final String name;
    private final int memberId;
    private final List<Book> borrowedBooks;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addBorrowedBook(Book book){
        borrowedBooks.add(book);
    }

    public void addAllBooksToBorrowedList(Book... books){
        for(Book book : books){
            borrowedBooks.add(book);
        }
    }

    public void returnBookBack(Book book){
        borrowedBooks.remove(book);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Member member = (Member) object;
        return memberId == member.memberId && Objects.equals(name, member.name) && Objects.equals(borrowedBooks, member.borrowedBooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, memberId, borrowedBooks);
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", memberId=" + memberId +
                '}';
    }
}
