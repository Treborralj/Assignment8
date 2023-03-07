package Library;

import java.time.LocalDate;

public class Lending {
    private LocalDate dueDate;
    private User user;

    private Book book;

    public Lending(User user, Book book) {
        this.user = user;
        this.book = book;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

}
