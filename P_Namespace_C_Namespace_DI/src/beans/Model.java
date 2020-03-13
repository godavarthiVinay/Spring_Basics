package beans;

public class Model {
    private String modelNo;
    private int year;

    Model(String modelNo,int year){
        this.modelNo=modelNo;
        this.year=year;

    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
