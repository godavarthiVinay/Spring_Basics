package FactoryDesignPattern;

public class FactoryVehicle {

    public static Vehicle getInstance(String type,int wheel){
        Vehicle vehicle=null;

        if (type.equals("Car") ){
            vehicle=new Car(wheel);
        }
        else if (type.equals("Bike")){
            vehicle=new Bike(wheel);
        }
        return vehicle;
    }
}
