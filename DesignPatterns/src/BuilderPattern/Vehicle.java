package BuilderPattern;

public class Vehicle {

    private String engine;
    private int wheel;
    private String name;
    private int airBags;

    private Vehicle(VehicleBuilder vehicleBuilder){
        this.engine=vehicleBuilder.engine;
        this.wheel=vehicleBuilder.wheel;
        this.name=vehicleBuilder.name;
        this.airBags=vehicleBuilder.airBags;

    }

    public String getEngine() {
        return engine;
    }

    public int getWheel() {
        return wheel;
    }

    public String getName() {
        return name;
    }

    public int getAirBags() {
        return airBags;
    }

    public static class VehicleBuilder{
        private String engine;
        private int wheel;
        private String name;
        private int airBags;

        public VehicleBuilder(String engine,int wheel,String name){
            this.engine=engine;
            this.wheel=wheel;
            this.name=name;
        }

        public VehicleBuilder setAirBags(int airBags){
            this.airBags=airBags;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }


  }

 }


