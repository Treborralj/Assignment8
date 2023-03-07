package Library;

import java.util.List;

public class Book {

    private String title;

    private List<Author> authors;

    public Book(String title, List<Author> authors)throws EmptyAuthorListException {
        if(authors.size() == 0){
            throw new EmptyAuthorListException("Author list is empty");
        }
        this.title = title;
        this.authors = authors;
    }
    public void addAuthor(Author author){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() throws EmptyAuthorListException {
        if(authors.size() == 0){
            throw new EmptyAuthorListException("Author list is empty");
        }
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

}
