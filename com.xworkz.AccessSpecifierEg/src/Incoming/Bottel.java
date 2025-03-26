package Incoming;

public class Bottel{

    public String company = "Milton";
    int price = 300;
    private String material = "Steel";

    public void checkItemAvailability(){
        System.out.println("Running checkItemAvailability in Bottle");
        System.out.println("Material : "+this.material);
        checkQuality();
    }

    void fillIt(){
        System.out.println("Running fillIt in Bottle");
    }

    private void checkQuality(){
        System.out.println("Running checkQuality in Bottle");
    }
}
