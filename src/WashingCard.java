public class WashingCard {

    private int washingCardAmount;

    public WashingCard() {}

    public int getWashingCardAmount() {
        return washingCardAmount;
    }


    public void deposit(double amount) {
        this.washingCardAmount += amount;
    }

    public void deduct(double amount) {
        this.washingCardAmount -= amount;
    }

}
