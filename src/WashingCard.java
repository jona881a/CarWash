public class WashingCard {

    private int washingCardAmount;
    private String cardHoldersName;


    public WashingCard(String cardHoldersName, int washingCardAmount) {
        this.washingCardAmount = washingCardAmount;
        this.cardHoldersName = cardHoldersName;
    }

    public WashingCard() {}

    public int getWashingCardAmount() {
        return washingCardAmount;
    }

    public void deposit(int amount) {
        this.washingCardAmount += amount;
    }

    public void deduct(double amount) {
        this.washingCardAmount -= amount;
    }

    @Override
    public String toString() {
        return "Cardholder: " + cardHoldersName + ", amount: " + washingCardAmount;
    }

}
