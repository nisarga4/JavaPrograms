package Internal;

public class Redmi {

        private static final String volts;

        public Redmi(){
            System.out.println("no-arg const of Bulb");
        }

        public String getVolts(){
            return volts;
        }
        static {
            volts = "100W";
        }
    }


