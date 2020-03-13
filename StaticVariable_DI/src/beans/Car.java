package beans;


public class Car {

    private static String carName;
    private static String carName1;

    public static void setCarName(String carName,String carName1) {
        Car.carName = carName;
        Car.carName1=carName1;
    }

    public void printCarName(){

        System.out.println("carName: "+carName);
        System.out.println("carName1: "+carName1);
    }
}
