package StructuralPatterns.FacadeDesignPattern;

public class FacadePatternExample {

    /*
    * Structural Design Pattern
    * Used when there are multiple interfaces of similar kind of jobs,then we  add facade Interface,
    * which provides better Interface to these interfaces and clients,
    * It helps in routing to relates interface
    * ie,Drivers,Databases
    * We implement FacadeHeplerClass,which will route to method related to specific class based on input.
    * */



    public static void main(String[] args) {
        String test = "CheckElementPresent";

        WebExplorerHelperFacade.generateReports("firefox", "html", test);
        WebExplorerHelperFacade.generateReports("firefox", "junit", test);
        WebExplorerHelperFacade.generateReports("chrome", "html", test);
        WebExplorerHelperFacade.generateReports("chrome", "junit", test);
    }
}
