package beans;

public class CarSingleton {
    private static CarSingleton car;

    private CarSingleton(){

    }


    public static CarSingleton getInstance(){
        if (car==null){
            car=new CarSingleton();
            return car;
        }
        else {
            return car;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
