public class Provider {

    public void create(){
        UserService userService = new UserService();
        AuthorizationService authorizationService = new AuthorizationService();
        UI ui = new UI();
        BookService bookService = new BookService();
    }

}
