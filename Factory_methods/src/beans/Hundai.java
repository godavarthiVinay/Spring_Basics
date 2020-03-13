package beans;

public class Hundai  implements Car{

    public void drive(){
        System.out.println(this.getClass());
        System.out.println("Maximum drive speed is 160 km/hr");
        System.out.println("Safe drive speed is 90 km/hr");
    }
}
