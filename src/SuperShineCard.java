public class SuperShineCard {

    private int amount;
    private String cardHolderName;

    public SuperShineCard(String cardHolderName, int amount) {
        this.amount = amount;
        this.cardHolderName = cardHolderName;
    }


    /*
      Getters
     */

    public int getAmount() {
        return amount;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    /*
      Setters
     */

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

}
