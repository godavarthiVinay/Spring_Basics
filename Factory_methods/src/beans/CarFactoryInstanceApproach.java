package beans;

public class CarFactoryInstanceApproach {

    public String carname;

    public void setCarname(String carname) {
        this.carname = carname;
    }
    public Car getInstance() throws Exception{
        Car car=(Car)Class.forName(carname).newInstance();
        return car;
    }



}
