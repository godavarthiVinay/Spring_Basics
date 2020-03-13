package client;

import beans.com.vehicle.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SteroComponentCLient {

    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/spring.xml");
             Car car=(Car) applicationContext.getBean(Car.class);
             car.printCarDetails();
    }
}
