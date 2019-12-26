import java.util.List;

public class Archive {

    private List<Book> bookList;
    private List<Book> searchResult;

    public void addBook(){
        Book book = new Book();
        bookList.add(book);
    }

    public void removeBook(){
        bookList.remove();
    }

    public List<Book> searchBooks(){
        searchResult.clear();
        return searchResult;
    }

    public void updateBook(){
        Book book = bookList.get();
        bookList.set(,book);
    }

    public List<Book> getBookList(){
        return bookList;
    }


}
