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
            customerRegister.add("Oliver" , "30 74 36 79", randomAmount.nextInt(1000-200) + 200,0);
            customerRegister.add("Rasmus","12 34 56 78",randomAmount.nextInt(1000-200) + 200,0);
            customerRegister.add("Jonas", "51 82 30 49", randomAmount.nextInt(1000-200) + 200,0);

            int number = 0;

            while (programIsRunning) {

                showMenu();

                String name;
                String phoneNumber;
                String reciept;
                int num;
                double washPrice;

                number = checkForCorrectInput();
                scan.nextLine();

                switch (number) {
                    case 1: //Opretter bruger

                        System.out.print("\nHvem skal vi oprette?\nNavn:");
                        name = scan.nextLine();
                        System.out.print("\nNummer:");
                        phoneNumber = scan.nextLine();
                        int amount = randomAmount.nextInt(1000-200) + 200;
                        customerRegister.add(name,phoneNumber,amount,0);
                        break;

                    case 2: //Valg af program(vask)
                        System.out.println("Hvad er dit telefonummer? : ");
                        phoneNumber = scan.nextLine();
                        System.out.println("Hvilken vask vil du købe? ");
                        washChoice.showWashes();
                        washPrice = washChoice.choiceOfWash(scan.nextInt());
                        if(washPrice == 0) {
                            while(true) {
                                System.out.println("Du har valgt et tal der ikke stemmer med vaskene, vælg igen");
                                scan.nextLine();
                            }
                        } else {
                            //fineCar.deduct(washPrice); //trækker penge fra vaskekortet
                        }
                        System.out.print("\nØnsker du en kvittering? (Y/N)");
                        reciept = scan.nextLine();
                        if(reciept.equals("Y")) {
                            washChoice.printReciept();
                        } else if(reciept.equals("N")) {
                            continue;
                        }
                        scan.nextLine();
                        break;

                    case 3: //Viser saldo

                        System.out.print("Hvad er dit telefonnummer? : ");
                        phoneNumber = scan.nextLine();
                        System.out.println("\nDin saldo er: " + customerRegister.returnCustomer(phoneNumber).getAmount() + " kr");
                        System.out.println("Din vaskekort saldo er: " + customerRegister.returnCustomer(phoneNumber).getWashingCardAmount() + " kr");
                        break;

                    case 4: //Tanker kort op

                        System.out.println("Hvad er dit nummer?");
                        phoneNumber = scan.nextLine();
                        System.out.println("Hvilket beløb ønsker du at tanke op?");
                        System.out.println("Vaskekort saldo: " + customerRegister.returnCustomer(phoneNumber).getWashingCardAmount());
                        System.out.print("\nBeløb: ");
                        num = scan.nextInt();
                        customerRegister.returnCustomer(phoneNumber).getWashingCardAmount();
                        customerRegister.returnCustomer(phoneNumber).setAmount(num);
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
        System.out.println("1. Opræt bruger ");
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

}
