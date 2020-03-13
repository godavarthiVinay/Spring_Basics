package beans;

import java.util.List;

public class Model {
    private String modelNo;
    private Long year;
    Model(){
        System.out.println("Model Object is created");
    }

    Model(String modelNo,Long year){
        this.modelNo=modelNo;
        this.year=year;
        System.out.println("Model Object is created and intialised with values");
    }

    public String getModelNo() {
        return modelNo;
    }

    public Long getYear() {
        return year;
    }
}
