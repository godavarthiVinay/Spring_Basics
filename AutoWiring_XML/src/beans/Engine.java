package beans;

public class Engine {

    private String modelNo;

//    Engine(String modelNo){
//        System.out.println("constrotor of Engine class");
//        this.modelNo=modelNo;
//    }

    public void setModelNo(String modelNo) {
        System.out.println("setter method of Engine class");
        this.modelNo = modelNo;
    }

    public String getModelNo() {
        return modelNo;
    }
}
