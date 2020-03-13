package ProtoTypeDesignPattern;


import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable {
    private List<String> vehicleList;

    public Vehicle(){
        this.vehicleList=new ArrayList<String>();

    }

    public  Vehicle(List<String> vehicleList){
        this.vehicleList=vehicleList;
    }

    public void  setVehicleList(){
        vehicleList.add("Audi");
        vehicleList.add("Benz");
        vehicleList.add("BMW");
        vehicleList.add("Volvo");
        vehicleList.add("RangeRover");
        vehicleList.add("Bently");
        vehicleList.add("Jaguar");

    }
    public void  addVehicle(String name){
        vehicleList.add(name);
    }

    public List<String> getVehicleList() {
        return vehicleList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> tempList=new ArrayList<>();
        for (String name:vehicleList){
            tempList.add(name);
        }
        return new Vehicle(tempList);
    }


}
