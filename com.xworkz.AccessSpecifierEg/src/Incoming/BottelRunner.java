package Incoming;

import Outgoing.Milton;

public class BottleRunner {
    public static void main(String[] args) {
        BottelProduction bottelProduction = new BottelProduction();
        Milton bottleCustomer = new Milton();

        bottelProduction.productionBottel();
        Milton.purchase();
    }
}
