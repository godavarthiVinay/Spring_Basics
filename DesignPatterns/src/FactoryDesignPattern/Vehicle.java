package FactoryDesignPattern;

public abstract class Vehicle {
    public abstract int getWheel();

    @Override
    public String toString() {
        return "wheel:"+this.getWheel();
    }
}
