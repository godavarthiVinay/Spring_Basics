package client;

import beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/spring.xml");
        Car car=(Car)applicationContext.getBean("car");
        car.printCarInformation();
    }
}
