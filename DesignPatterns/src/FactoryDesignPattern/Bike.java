package FactoryDesignPattern;

public class Bike  extends Vehicle{
    int wheel;
    Bike(int wheel){
        this.wheel=wheel;
    }


    @Override
    public int getWheel() {
        return wheel;
    }
}
