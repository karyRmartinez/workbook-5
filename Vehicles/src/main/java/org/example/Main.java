package org.example;

public class Main {
    public static void main(String[] args) {
        
        Moped slowRide = new Moped("Red", 1, 5, 23);
        System.out.println(slowRide.getColor() + " " + slowRide.getFuelCapacity() + " " + slowRide.getNumberOfPassengers()+  " "+ slowRide.getCargoCapacity());

        Car c1 = new Car("White", 3, 7, 15);
        System.out.println(c1.getColor() + " " + c1.getNumberOfPassengers() + " " + c1.getCargoCapacity() + " " + c1.getFuelCapacity());

        SemiTruck slowTruck = new SemiTruck("Yellow", 3, 20, 12);
        System.out.println(slowTruck.getColor() + " " + slowTruck.getFuelCapacity() + " " + slowTruck.getCargoCapacity() + " " + slowTruck.getNumberOfPassengers());

        Hovercraft hoverRide = new Hovercraft("Blue", 4, 5, 10);
        System.out.println(hoverRide.getColor() + " " + hoverRide.getNumberOfPassengers() + " " + hoverRide.getCargoCapacity() + " " + hoverRide.getFuelCapacity());


    }
}