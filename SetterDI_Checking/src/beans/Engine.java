package beans;

public class Engine {

    private String modelNo;
    private String year;

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getModelNo() {
        return modelNo;
    }

    public  void printInformation(){
        System.out.println("car model No :"+modelNo);
        System.out.println("car released in year :"+String.valueOf(year));
    }
}
