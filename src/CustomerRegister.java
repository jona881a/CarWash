import java.util.ArrayList;

public class CustomerRegister {

    public ArrayList<Customer> customers = new ArrayList<Customer>();

    public void add(String name, String number, int amount,int washingCardAmount){
        Customer customer = new Customer(name,number,amount,washingCardAmount);
        this.customers.add(customer);

    }

    public Customer returnCustomer(String phoneNumber){
        for (int i = 0; i<customers.size(); i++) {
            if (phoneNumber.compareTo(customers.get(i).getNumber())==0){
                return customers.get(i);
            }
        }
        return null;
    }

    public void printAll() {
        for (Customer customer: customers) {
            System.out.println(customer.getName() +
                    " " + customer.getNumber() +
                    ", " + customer.getAmount() +
                    " kr." + "Vaskekort værdi: " + customer.getWashingCardAmount());
        }
    }
}
