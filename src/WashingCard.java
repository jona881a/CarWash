public class WashingCard {

    private int washingCardAmount;
    private String cardHoldersName;


    public WashingCard(String cardHoldersName, int washingCardAmount) {
        this.washingCardAmount = washingCardAmount;
        this.cardHoldersName = cardHoldersName;
    }


    public WashingCard(){

    }

    public int getWashingCardAmount() {


        return washingCardAmount;
    }

    public void deposit(int amount) {
        this.washingCardAmount += washingCardAmount;
    }

    public void deduct(int amount) {
        this.washingCardAmount -= washingCardAmount;
    }

    @Override
    public String toString() {
        return "Cardholder: " + cardHoldersName + ", amount: " + washingCardAmount;
    }

}
