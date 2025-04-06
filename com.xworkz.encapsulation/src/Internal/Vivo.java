package Internal;

public class Vivo {
        Iphone iphone=new Iphone();

        public Vivo(){
            System.out.println("no-arg const of Nasa");
        }

        public void manufactureIphone(){
            System.out.println("Running manufactureRocket in Nasa");
            iphone.setChargerType("Methane");
            iphone.setChargingLevel(500);
            System.out.println("Fuel type : "+iphone.getChargerType());
            System.out.println("Fuel Level : "+iphone.getChargingLevel());
        }
    }

