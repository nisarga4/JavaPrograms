package Incoming;

import Outgoing.Driver;

public class CarRunner{

        public static void main(String[] args) {
            CarShowroom carShowroom=new CarShowroom();
           Driver driver = new Driver();

            CarShowroom.model();
            driver.experience();
        }
    }
