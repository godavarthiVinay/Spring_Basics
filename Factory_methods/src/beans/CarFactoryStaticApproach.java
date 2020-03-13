package beans;

public class CarFactoryStaticApproach {

    public static  String carname;

    public static void  setCarname(String carname) {
        CarFactoryStaticApproach.carname = carname;
    }

    public static Car getInstance() throws Exception{

        Car car=(Car)Class.forName(carname).newInstance();
        return car;
    }
}
