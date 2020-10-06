import java.util.Scanner;
import java.util.Random;

public class SuperShineWashingMachine {

       static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {

            boolean programIsRunning = true;
            CustomerRegister customerRegister = new CustomerRegister();
            Washes washChoice = new Washes();
            Random randomAmount = new Random();

            //tilføj personer i registeret for standard
            customerRegister.add("Oliver" , "20 10 40 50", randomAmount.nextInt(1000) + 200);
            customerRegister.add("Rasmus","12 34 56 78",randomAmount.nextInt(1000) + 200);
            customerRegister.add("Jonas", "51 82 30 49", randomAmount.nextInt(1000) + 200);

            int number = 0;

            while (programIsRunning) {

                showMenu();

                String name;
                String phoneNumber;

                number = checkForCorrectInput();
                scan.nextLine();

                switch (number) {
                    case 1: //Opretter bruger

                        System.out.print("\nHvem skal vi oprette?\nNavn:");
                        name = scan.nextLine();
                        System.out.print("\nNummer:");
                        phoneNumber = scan.nextLine();
                        int amount = randomAmount.nextInt(1000) + 200;
                        customerRegister.add(name,phoneNumber,amount);
                        break;

                    case 2: //Valg af program(vask)

                        System.out.println("Hvilken vask vil du købe? ");
                        washChoice.showWashes();
                        washChoice.choiceOfWash(scan.nextInt());
                        System.out.print("\nØnsker du en kvittering? (Y/N)");
                        scan.nextLine();
                        break;

                    case 3: //Viser saldo

                        System.out.print("Hvad er dit telefonnummer? : ");
                        phoneNumber = scan.nextLine();
                        System.out.println("\nDin saldo er: " + customerRegister.showAmount(phoneNumber));
                        System.out.println("Ønsker du at tanke op?");
                        break;

                    case 4: //Tanker kort op

                        break;
                    default:
                        //luk programmet
                        System.exit(0);
                }
            }
        }

    public static void showMenu() {

        System.out.println("\nHovedmenu - 9 afslutter programmet\n");
        System.out.println("1. Opræt bruger ");
        System.out.println("2. Vælg vask ");
        System.out.println("3. Se din saldo ");
        System.out.println("4. Tank op ");
        System.out.print("\n5. Vælg en menu: ");

    }

    public static int checkForCorrectInput(){

        int number;

        while(!scan.hasNextInt()) {
            System.err.println("\nDu skal indtaste et tal");
            System.out.println("Indtast et tal");
            scan.nextLine();
        }
        number = scan.nextInt();
        return number;
    }

}
