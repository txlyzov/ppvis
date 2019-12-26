import java.util.List;

public class UserService {

    Archive archive;

    private List<Book> arrearsList;
    private List<Book> searchResult;

    public List<Book> getArrears(){
        return searchResult;
    }

    public void addBook(Book book){
        arrearsList.add(book);
    }

    public void checkArrears(){

    }

    public void removeBook(String bookName){
        for (int i=0;i<arrearsList.size()-1;i++){{
            Book book=new Book();
            if(book.get()=bookName)
            arrearsList.remove(i);
        }}
    }
}
