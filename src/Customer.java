public class Customer {


        private String name;
        private String number;
        private int saldo;

        public Customer(String name, String number, int saldo){

            this.name = name;
            this.number = number;
            this.saldo = saldo;

        }

        public String getName(){
            return this.name;
        }

        public String getNumber(){
            return this.number;
        }
        public int getSaldo(){
            return this.saldo;
        }
        public String toString(){

            return this.name + " number " + this.number;
        }
    }



