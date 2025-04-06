
import External.Mobile;
import Internal.Redmi;
import Internal.Vivo;

import java.nio.Buffer;

public class MobileRunner {
        public static void main(String[] args) {
            Vivo vivo=new Vivo();
            Mobile mobile=new Mobile();

            vivo.manufactureIphone();
            mobile.researchOnIphone();

            System.out.println("=============================");
            Redmi redmi=new Redmi();
            String volts = redmi.getVolts();
            System.out.println("Bulb of volts : "+volts);

        }
    }
