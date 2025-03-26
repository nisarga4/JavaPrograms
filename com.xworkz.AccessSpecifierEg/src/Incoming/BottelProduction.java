package Incoming;


public class BottelProduction {

    Bottel bottel = new Bottel();

    void manufactureBottle(){
        System.out.println(bottel.company);
        System.out.println(bottel.price);
        bottel.checkItemAvailability();
        bottel.fillIt();
    }
}
