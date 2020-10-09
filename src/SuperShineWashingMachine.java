import java.util.Scanner;
import java.util.Random;

public class SuperShineWashingMachine {

        static Scanner scan = new Scanner(System.in);
        static Random randomAmount = new Random();
        static CustomerRegister customerRegister = new CustomerRegister();
        static Washes washChoice = new Washes();

        public static void main(String[] args) {

            boolean programIsRunning = true;

            //tilføj personer i registeret for standard
            customerRegister.add("Oliver" , "30 74 36 79", randomAmount.nextInt(1000-200) + 200,0);
            customerRegister.add("Rasmus","12 34 56 78",randomAmount.nextInt(1000-200) + 200,0);
            customerRegister.add("Jonas", "51 14 72 22", randomAmount.nextInt(1000-200) + 200,0);

            int number = 0;
            char yesNo; //Variable der anvendes når brugeren bliver spurgt om 2 valgmuligheder
            String phoneNumber = "";

            System.out.println("Er du oprettet i SuperShine CarWash systemet? (Y/N)");
            yesNo = scan.nextLine().charAt(0);
            if(yesNo == 'Y') {
                System.out.print("\nSkriv dit telefonnummer som identifikation: ");
                phoneNumber = scan.nextLine();
                if(customerRegister.returnCustomer(phoneNumber) == null) {
                    System.err.println("Der eksistere ikke en bruger med det indtastede telefonnummer");
                    System.err.print("Ønskes der at oprettes en bruger? (Y/N)");
                    yesNo = scan.nextLine().charAt(0);
                    if(yesNo == 'Y'){
                        createUser();
                    } else if(yesNo == 'N') {
                        System.exit(0);
                    }
                }

            } else if(yesNo == 'N') {
                createUser();
                System.out.print("\nSkriv dit telefonnummer som identifikation: ");
                phoneNumber = scan.nextLine();
            }

            Customer customer = customerRegister.returnCustomer(phoneNumber);

            while (programIsRunning) {

                //Fields

                int num;
                double washPrice;

                showMenu();

                number = checkForCorrectInput();
                scan.nextLine();

                switch (number) {
                    case 1: //Opretter bruger
                        createUser();
                        break;

                    case 2: //Valg af program(vask)
                        int choice;
                        System.out.println("Hvilken vask vil du købe? ");
                        washChoice.showWashes();
                        washPrice = checkForCorrectInput(); //tjek for korrekt input
                        choice = scan.nextInt();
                        washPrice = washChoice.choiceOfWash(choice);
                        if(washPrice == 0) {
                            while(true) {
                                System.out.println("Du har valgt et tal der ikke stemmer med vaskene, vælg igen");
                                scan.nextLine();
                            }
                        } else {
                            customer.deductWashingCardAmount(washPrice);
                        }

                        System.out.print("\nØnsker du en kvittering? (Y/N)");
                        scan.nextLine();
                        yesNo = scan.nextLine().charAt(0);
                        if(yesNo == 'Y') {
                            washChoice.printReciept(choice, washPrice);
                        } else if(yesNo == 'N') {
                            continue;
                        }
                        break;

                    case 3: //Viser saldo

                        System.out.println("\nDin saldo er: " + customer.getAmount() + " kr");
                        System.out.println("Din vaskekort saldo er: " + customer.getWashingCardAmount() + " kr");
                        break;

                    case 4: //Tanker kort op

                        System.out.println("Hvilket beløb ønsker du at tanke op?");
                        System.out.println("Vaskekort saldo: " + customer.getWashingCardAmount());
                        System.out.print("\nBeløb: ");
                        num = scan.nextInt();
                        //Vi skal have tilføjet til vaskekortet
                        customer.depositAmountToWashingCard(num);
                        customer.deductAmount(num);
                        break;

                    case 5: //hvis alle brugere i programmet
                        customerRegister.printAll();
                        break;
                    default:
                        //luk programmet
                        System.exit(0);
                }
            }
        }

    public static void showMenu() {

        System.out.println("\nHovedmenu - 9 afslutter programmet\n");
        System.out.println("1. Opret bruger ");
        System.out.println("2. Vælg vask ");
        System.out.println("3. Se din saldo ");
        System.out.println("4. Tank op ");
        System.out.println("5. hvis alle brugere ");
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

    public static void createUser() {
        String name;
        String phoneNumber;

        System.out.print("\nIndtast dit Navn: ");
        name = scan.nextLine();
        System.out.printf("\nIndtast dit nummer");
        phoneNumber = scan.nextLine();

        int amount = randomAmount.nextInt(1000-200) + 200;
        customerRegister.add(name,phoneNumber,amount,0);
    }

}
