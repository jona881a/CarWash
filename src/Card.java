public class Card {

    private int amount;
    private String cardHoldersName;

    public Card(String cardHoldersName, int amount) {
        this.amount = amount;
        this.cardHoldersName = cardHoldersName;
    }

    public int getAmount() {
        return amount;
    }

    public void deposit(int amount) {
        this.amount += amount;
    }

    public void deduct(int amount) {
        this.amount -= amount;
    }

    @Override
    public String toString() {
        return "Cardholder: " + cardHoldersName + ", amount: " + amount;
    }
}
