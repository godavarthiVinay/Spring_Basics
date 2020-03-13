package beans;

import org.springframework.beans.factory.annotation.Required;

public class Car {

    private String carName;
    private Engine engine;


    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Required
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public  void printCarInformation(){
        System.out.println("car name:"+carName);
        engine.printInformation();
    }
}
