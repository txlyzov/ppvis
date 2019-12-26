

public class Library {


    public static void main(String[] args) {
        new Library().start();
    }

    public void start() {
        Provider provider = new Provider();
        provider.create();
    }

}