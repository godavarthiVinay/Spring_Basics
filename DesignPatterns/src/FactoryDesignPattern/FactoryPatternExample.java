package FactoryDesignPattern;

import com.sun.org.apache.bcel.internal.util.ClassPath;

public class FactoryPatternExample {

    public static void main(String[] args){




        Vehicle car=FactoryVehicle.getInstance("Car",4);
        System.out.println(car);

        Vehicle bike=FactoryVehicle.getInstance("Bike",2);
        System.out.println(bike);
    }
}
