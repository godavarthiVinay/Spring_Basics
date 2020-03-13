package beans;

import org.springframework.beans.factory.FactoryBean;

public class SpringApprachFactoryBean  implements FactoryBean{

    private String carname;

    public void setCarname(String carname) {
        this.carname = carname;
    }

    @Override
    public Object getObject() throws Exception {

        Car car=(Car)Class.forName(carname).newInstance();
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
