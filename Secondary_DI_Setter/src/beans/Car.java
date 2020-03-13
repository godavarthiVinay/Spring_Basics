package beans;

import java.util.List;
import java.util.Map;

public class Car {
    Car(){
        System.out.println("Car Object is created");
    }

    public String carName;
    public Model carmodal;
    public List otherModelsNames;


    public void setCarName(String carName) {
        this.carName = carName;
        System.out.println("carName is initialized");
    }

    public void setCarmodal(Model carmodal) {
        this.carmodal = carmodal;
        System.out.println("carmodel is initialized");

    }

    public void setOtherModelsNames(List otherModelsNames) {
        this.otherModelsNames = otherModelsNames;
        System.out.println("otherModelNames is initialized");

    }

    public void printCarDetails(){
        System.out.println("Car Name:"+carName);
        System.out.println("Car modelNo:"+carmodal.getModelNo());
        System.out.println("Car released in year:"+carmodal.getYear());

    }
    public  void otherModels(){
        for(Object name : otherModelsNames){
            System.out.println("model Name:"+name.toString());
        }
    }
}
