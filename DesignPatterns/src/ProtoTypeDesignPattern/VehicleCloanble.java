package ProtoTypeDesignPattern;


import java.util.ArrayList;
import java.util.List;

public class VehicleCloanble implements Cloneable {
    private List<String> vehicleList;

    public VehicleCloanble(){
        this.vehicleList=new ArrayList<String>();

    }

    public VehicleCloanble(List<String> vehicleList){
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

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }



}
