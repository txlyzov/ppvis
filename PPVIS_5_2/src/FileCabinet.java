import java.util.List;

public class FileCabinet {

    private List<UserCard> cardList;
    private List<UserCard> searchResult;



    public void addCard(){
        UserCard card = new UserCard();
        cardList.add(card);
    }

    public void removeCard(){
        cardList.remove();
    }

    public List<UserCard> searchBooks(){
        searchResult.clear();
        return searchResult;
    }

    public void updateCard(){
        UserCard card = cardList.get();
        cardList.set(,card);
    }

}
