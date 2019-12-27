import javafx.beans.property.SimpleIntegerProperty;

import java.sql.Time;

public class Book {

    private Time availableReadingTime;
    private String amount;

    public Book(Time availableReadingTime,String amount){
        this.availableReadingTime = availableReadingTime;
        this.amount = amount;
    }

    public int compare (Book book){

        return integer;
    }

    public void setAvailableReadingTime(Time newTime){
        availableReadingTime=newTime;
    }

    public void setAmount(String newAmount){
        amount=newAmount;
    }

    public Time getAvailableReadingTime(){
        return availableReadingTime;
    }

    public String getAmount(){
        return amount;
    }

}
