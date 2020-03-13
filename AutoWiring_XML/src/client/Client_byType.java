package client;

import beans.Car;

import beans.Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client_byType {

    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/spring.xml");
        Car vehicle=(Car) applicationContext.getBean("car");
        Engine engine=vehicle.getEngine();
        String carName=vehicle.getCarName();
        System.out.println("carNAme:"+carName);
        System.out.println(" model:"+engine.getModelNo());
    }
}
