package classes;

public class Customer extends User {

    public Customer(String name, String username, String email, String password) {
        super(name, username, email, password);
    }

    public Customer(String name, String username, String email, String password, int age, int phoneNumber) {
        super(name, username, email, password, age, phoneNumber);
    }
    
//    public void BuyTicket(Ticket ticket){
//        //
//    }
//    
//    public void BuySnack(Snack snack){
//        //
//    }
}
