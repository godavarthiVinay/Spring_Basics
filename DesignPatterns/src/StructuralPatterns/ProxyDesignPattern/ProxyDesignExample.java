package StructuralPatterns.ProxyDesignPattern;

public class ProxyDesignExample {

    /*
    * Structural Design Pattern
    * Its something like Filter.Limiting to certain User or creation of Objects
    * */

    public static void main(String[] args) throws Exception {

        DatabaseExecuter nonAdminExecuter = new DatabaseExecuterProxy("NonAdmin", "Admin@123");
        nonAdminExecuter.executeDatabase("INSERT");

//        DatabaseExecuter nonAdminExecuterDELETE = new DatabaseExecuterProxy("NonAdmin", "Admin@123");
//        nonAdminExecuterDELETE.executeDatabase("DELETE");


        DatabaseExecuter adminExecuter = new DatabaseExecuterProxy("Admin", "Admin@123");
        adminExecuter.executeDatabase("DELETE");








    }
}
