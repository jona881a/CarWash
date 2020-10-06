import java.util.ArrayList;

public class CustomerRegister {

    public ArrayList<Customer> customers = new ArrayList<Customer>();

    public void add(String name, String number, int amount){
        Customer customer = new Customer(name,number,amount);
        this.customers.add(customer);

    }
    public int showAmount(String phoneNumber){

        //Søg efter navn
        for (Customer customer : customers){
            if (phoneNumber.compareTo(customer.getNumber())==0){
                return customer.getAmount();
            }
        }
        return 0;
    }
}
