package Incoming;

public class BedSpread {
    Bed bed=new Bed();
    void manage(){
        System.out.println(bed.name);
        System.out.println(bed.DeliveryPoint);
        bed.Packing();
        bed.chooseDestination();
    }
}

