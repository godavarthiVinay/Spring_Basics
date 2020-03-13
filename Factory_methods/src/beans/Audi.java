package beans;

public class Audi  implements Car{

    @Override
    public void drive() {

        System.out.println(this.getClass());
        System.out.println("Maximum drive speed is 180 km/hr");
        System.out.println("Safe drive speed is 100 km/hr");
    }
}
