package Incoming;

public class Car{
    public String brand = "Suzuki";
    int quantity = 10;
    private  String designedBy = "Tata";

    public void purchase(){
        System.out.println("Runnign purchase in car");
        System.out.println("designedBy  : "+this.designedBy );
        fixRate();
    }

    void customizeSeat(){
        System.out.println("Running customizeseat in car");
    }

    private void fixRate(){
        System.out.println("Running fixRate in car");
    }
}
