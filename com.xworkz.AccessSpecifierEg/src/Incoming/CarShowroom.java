package Incoming;

public class CarShowroom {


        Car car = new Car();

        public void model(){
            System.out.println(car.brand);
            System.out.println(car.quantity);
            car.customizeSeat();
            car.purchase();
        }
    }