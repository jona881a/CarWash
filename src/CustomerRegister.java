import java.util.ArrayList;
import java.util.Random;

public class CustomerRegister {

    private CreditCard creditCard;
    private String name;

    public ArrayList<Customer> customers = new ArrayList<Customer>();



    public void add(String name, String number, int saldo){
        Customer customer = new Customer(name,number,saldo);
        this.customers.add(customer);

    }
    public int visSaldo(String telefonNummer){

        //Søg efter navn
        for (Customer customer : customers){
            if (telefonNummer.compareTo(customer.getNumber())==0){
                return customer.getSaldo();
            }
        }
        return 0;
    }
}
