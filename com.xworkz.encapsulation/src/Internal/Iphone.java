package Internal;

public class Iphone {
        private static String chargerType;
        private static int chargingLevel;

        public Iphone(){
            System.out.println("no-arg const of Rocket");
        }

        void setChargerType(String chargerType){
            this.chargerType = chargerType;
        }

        void setChargingLevel(int chargingLevel){
            this.chargingLevel= chargingLevel;
        }

        public String getChargerType(){
            return this.chargerType;
        }
        public int getChargingLevel(){
            return  this.chargingLevel;
        }
    }
