import java.time.LocalTime;
import java.util.Calendar;

public class Washes {

    private final int ECONOMY_PRICE = 50;
    private final int STANDARD_PRICE = 80;
    private final int DELUXE_PRICE = 120;
    private int economyWashesBought = 0;
    private int standardWashesBought = 0;
    private int deLuxeWashesBought = 0;
    private final LocalTime EARLYBIRD_DISCOUNT_DEADLINE = LocalTime.of(14,00);
    private Calendar weekDay = Calendar.getInstance();

    public double choiceOfWash(int choice) {

        switch(choice) {
            case 1:
                return buyEconomyWash();

            case 2:
                return buyStanderdWash();

            case 3:
                return buyDeLuxeWash();

            default:
                return 0;
        }
    }

    public double buyEconomyWash() {
        economyWashesBought++;
        return checkEarlyBirdDiscount(ECONOMY_PRICE);
    }

    public double buyStanderdWash() {
        standardWashesBought++;
        return checkEarlyBirdDiscount(STANDARD_PRICE);
    }

    public double buyDeLuxeWash() {
        deLuxeWashesBought++;
        return DELUXE_PRICE;
    }

    public void printReciept() {
        System.out.println("SUPERSHINE WASHING");
        System.out.println("------------------");
    }

    public double checkEarlyBirdDiscount(int washPrice) {
        //if the time and date matches earlybird discount we include a 20% discounts
        if(LocalTime.now() != EARLYBIRD_DISCOUNT_DEADLINE && !weekDay.equals("SATURDAY") && !weekDay.equals("SUNDAY")) {
            return washPrice * 0.2;
        }
        return washPrice;
    }

    public void getStatistics() {

    }

    public void showWashes() {
        System.out.println("\nFølgende vaske er tilgængelige: ");
        System.out.printf("1. Økonomi: %d kr.", ECONOMY_PRICE);
        System.out.printf("\n2. Standard: %d kr.", STANDARD_PRICE);
        System.out.printf("\n3. De_Luxe: %d kr.", DELUXE_PRICE);

    }
}
