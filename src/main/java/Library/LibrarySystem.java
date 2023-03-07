package Library;

import java.time.LocalDate;
import java.util.List;

public class LibrarySystem {
    private Book books;
    private Lending lending;
    private User users;

    public LibrarySystem() {
    }
    public void addBookWithTitleAndAuthorlist(String title, List<Author> authors)throws EmptyAuthorListException{

    }
    public void addStudentUser(String name, boolean feePaid){

    }
    public void addFacultyMemberUser(String name, String department){


    }
    public Book findBookByTitle(String title){

    }
    public User findUserByName(String name){

    }
    public void borrowBook(User user, Book book)throws UserOrBookDoesNotExistException{


    }
    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate)throws UserOrBookDoesNotExistException{

    }
    public void returnBook(User user, Book book)throws UserOrBookDoesNotExistException{

    }

}
