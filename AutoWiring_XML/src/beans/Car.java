package beans;

public class Car {
    private Engine engine;
    private String carName;

//    Car(Engine engine){
//        System.out.println("constructor of car class");
//        this.engine=engine;
//    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getCarName() {
        return carName;
    }
}
