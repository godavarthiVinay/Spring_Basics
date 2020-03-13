package beans;

import java.util.List;

public class Car {
    private String carName;
    private List models;
    private Model model;

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setModels(List models) {
        this.models = models;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void printCarDetails(){
        System.out.println("car name: "+carName+" cardetails"+model.getModelNo());
    }
}
