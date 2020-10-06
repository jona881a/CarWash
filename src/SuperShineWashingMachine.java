import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class SuperShineWashingMachine {






        public static void main(String[] args) {
            new SuperShineWashingMachine();

            Scanner scan = new Scanner(System.in);
            CustomerRegister customerRegister = new CustomerRegister();
            Washes washChoice = new Washes();
            Random randomSaldo = new Random();




            int tal = 0;

            while (true) {

                visMenu();

                String navn;
                String telefonNummer;

                tal = indtastTal();
                scan.nextLine();

                switch (tal) {

                    case 1:
                        //Oprætter bruger
                        System.out.print("\nHvem skal vi oprætte?\nNavn:");
                        navn = scan.nextLine();
                        System.out.print("\nNummer:");
                        telefonNummer = scan.nextLine();
                        int saldo = 200+randomSaldo.nextInt(1000);
                        customerRegister.add(navn,telefonNummer,saldo);


                        break;


                    case 2:
                        //Valg af program(vask)
                        System.out.println("Hvilken vask vil du købe? ");
                        washChoice.showWashes();

                        break;


                    case 3:
                        //Viser saldo
                        System.out.print("Hvad er dit telefonnummer? : ");
                        telefonNummer = scan.nextLine();
                        System.out.println("\nDin saldo er: " + customerRegister.visSaldo(telefonNummer)); //tilføj kunde bla bla bla
                        System.out.println("Ønsker du at tanke op?");

                        break;

                    case 4:
                        //Tanker kort op

                        break;

                    default:
                        //luk programmet
                        System.exit(0);
                }
            }
        }

    public SuperShineWashingMachine() {

    }

    /**
     * @TODO lav menupunkter såsom: køb vask, se bevægelser på washkort, køb washkort, tilføj flere penge på washkort mm.
     */
    public static void visMenu() {

        System.out.println("\nHovedmenu - 9 afslutter programmet\n");
        System.out.println("1. Opræt bruger ");
        System.out.println("2. Vælg vask ");
        System.out.println("3. Se din saldo ");
        System.out.println("4. Tank op ");
        System.out.print("\n5. Indtast meny tal: ");

    }

    public static int indtastTal(){

        Scanner scan = new Scanner(System.in);

        int tal = 0;
        while(!scan.hasNextInt()){
            System.out.println("\nDu skal indtaste et tal");
            System.out.println("Indtast et tal");
            scan.nextLine();
        }
        tal = scan.nextInt();
        return tal;
    }

}
