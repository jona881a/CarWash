public class CreditCard {

    private int amount;
    private String cardOwner;

    public CreditCard(String cardOwner, int amount) {
        this.amount = amount;
        this.cardOwner = cardOwner;
    }

    public int getAmount() {
        return amount;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }
}
