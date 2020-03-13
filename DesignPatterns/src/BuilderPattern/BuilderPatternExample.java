package BuilderPattern;

public class BuilderPatternExample {

    public static void main(String[] args){
        Vehicle car =new Vehicle.VehicleBuilder("2000cc",4,"Audi").setAirBags(10).build();
        Vehicle bike=new Vehicle.VehicleBuilder("200cc",2,"Apache 2004v").build();
        System.out.println(car.getName());
        System.out.println(car.getEngine());
        System.out.println(car.getWheel());
        System.out.println(car.getAirBags());
        System.out.println("-----------------------");

        System.out.println(bike.getName());
        System.out.println(bike.getEngine());
        System.out.println(bike.getWheel());
        System.out.println(bike.getAirBags());
        System.out.println("-----------------------");

    }
}
