package External;
import Internal.Iphone;
public class Mobile {
    Iphone iphone=new Iphone();

    public Mobile(){
        System.out.println("no-arg const of Researcher");
    }

    public void researchOnIphone(){
        System.out.println("Running researchOnRocket in Researcher");
        System.out.println("Fuel Type : "+iphone.getChargerType());
        System.out.println("Fuel Level : "+iphone.getChargingLevel());
    }
}
