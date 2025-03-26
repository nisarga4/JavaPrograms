package Incoming;

public class Bed {
        public String name = "Sleepy";
        String DeliveryPoint = "Banglur";
        private double price = 1000;

        public void Packing(){
            System.out.println("Running Delivery Point");
            setPrice();
            System.out.println("Price : "+this.price);

        }

        void chooseDestination(){
            System.out.println("Running chooseDestination in Bed");
        }

        private void setPrice(){
            System.out.println("Running setPrice in Train");
        }

    }

