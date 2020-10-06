import java.time.LocalTime;
import java.util.Calendar;

public class Washes {

    private final int ECONOMY_PRICE = 50;
    private final int STANDARD_PRICE = 80;
    private final int DELUXE_PRICE = 120;
    private final LocalTime EARLYBIRD_DISCOUNT_DEADLINE = LocalTime.of(14,00);
    private Calendar weekDay = Calendar.getInstance();

    public Washes() {

    }

    public int buyEconomyWash() {
        return ECONOMY_PRICE;
    }

    public int buyStanderdWash() {
        return STANDARD_PRICE;
    }

    public int buyDeLuxeWash() {
        return DELUXE_PRICE;
    }

    public void printReciept() {
    }

    public double checkEarlyBirdDiscount(int washPrice) {
        //if the time and date matches earlybird discount we include a 20% discounts
        if(LocalTime.now() != EARLYBIRD_DISCOUNT_DEADLINE) {
            return washPrice * 0.2;
        }
        return washPrice;
    }

    public void getStatistics() {

    }

    public void showWashes() {
        System.out.println("Følgende vaske er tilgængelige: ");
        System.out.printf("\n1. Økonomi: %d kr.", ECONOMY_PRICE);
        System.out.printf("\n2. Standard: %d kr.", STANDARD_PRICE);
        System.out.printf("\n3. De_Luxe: %d kr.", DELUXE_PRICE);

    }
}
