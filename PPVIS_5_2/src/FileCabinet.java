import java.util.List;

public class FileCabinet {

    private List<UserCard> cardList;
    private List<UserCard> searchResult;



    public void addBook(){
        UserCard card = new UserCard();
        cardList.add(card);
    }

    public void removeBook(){
        cardList.remove();
    }

    public List<UserCard> searchBooks(){
        searchResult.clear();
        return searchResult;
    }

    public void updateBook(){
        UserCard card = cardList.get();
        cardList.set(,card);
    }

}
