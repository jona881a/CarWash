public class Customer {

        private String name;
        private String number;
        private double amount;
        private double washingCardAmount;
        private WashingCard superShineCard = new WashingCard();

        public Customer(String name, String number, int amount, int washingCardAmount){
            this.name = name;
            this.number = number;
            this.amount = amount;
            this.washingCardAmount = superShineCard.getWashingCardAmount();
        }



        public String getName(){
            return this.name;
        }
        public String getNumber(){
            return this.number;
        }
        public double getAmount(){
            return this.amount;
        }

        public double getWashingCardAmount() {
            return this.washingCardAmount;
        }

        public void setAmount(double amount) {
            this.amount -= amount;
        }

        public String toString(){
            return this.name + " number " + this.number;
        }
    }



