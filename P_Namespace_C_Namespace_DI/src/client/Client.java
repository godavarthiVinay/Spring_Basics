package client;

import beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void  main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring.xml");
        Car c=(Car)context.getBean("car");
        c.printCarDetails();
    }
}
