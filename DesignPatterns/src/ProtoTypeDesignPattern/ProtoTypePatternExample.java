package ProtoTypeDesignPattern;

public class ProtoTypePatternExample {
    /*
    * Creation Design Pattern.
    * Used when u want avoid mutiple Object Creation of same Instance.

    * If u want to create copy of an Object amd  modify the copied Obj  without distrubing orginal Object

    * IMPLEMENTATION:

    * Object which we are copying should provide copying feature by implementing Cloneable interface
    * We can override clone() method to implement as per our need
    */

    public static void main(String[] args) throws CloneNotSupportedException {


//        VehicleCloanble vv=new VehicleCloanble();
//        vv.setVehicleList();
//        System.out.println(vv.hashCode());
//        VehicleCloanble vv2=(VehicleCloanble) vv.clone();
//        System.out.println(vv2.hashCode());
//
//        vv.addVehicle("Hundai");
//        System.out.println(vv.getVehicleList());
//        System.out.println(vv2.getVehicleList());
//
//        System.out.println("-------------------------");
//        vv2.addVehicle("Honda");
//        System.out.println(vv.getVehicleList());
//        System.out.println(vv2.getVehicleList());



//-----------------------------------------------------


         Vehicle vehicles =new Vehicle();
         vehicles.setVehicleList();
         System.out.println(vehicles.hashCode());

         Vehicle vehicles11=(Vehicle) vehicles.clone();
         System.out.println(vehicles11.hashCode());

         vehicles11.addVehicle("Hundai");
         System.out.println(vehicles.getVehicleList());
         System.out.println(vehicles11.getVehicleList());

    }

}
