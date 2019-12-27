import java.util.Date;

public class UserCard {

    private String fullName;
    private String adress;
    private Date registrationDate;
    private String password;
    private int phoneNumber;
    private int id;

    public UserCard(String fullName,String adress,Date registrationDate,String password,int phoneNumber,int id){
        this.fullName = fullName;
        this.adress = adress;
        this.registrationDate = registrationDate;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

}
