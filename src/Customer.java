public class Customer {

        private String name;
        private String number;
        private int amount;
        private WashingCard superShineCard;

        public Customer(String name, String number, int amount){
            this.name = name;
            this.number = number;
            this.amount = amount;

            superShineCard = new WashingCard(name,0);
        }

        public WashingCard getSuperShineCard() {
            return superShineCard;
        }

        public String getName(){
            return this.name;
        }
        public String getNumber(){
            return this.number;
        }
        public int getAmount(){
            return this.amount;
        }
        public String toString(){
            return this.name + " number " + this.number;
        }
    }



