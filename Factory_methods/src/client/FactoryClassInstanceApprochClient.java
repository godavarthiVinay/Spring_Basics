package client;

import beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryClassInstanceApprochClient {
    public static void main(String[] args){

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/spring.xml");
        Car cc=(Car) applicationContext.getBean("cf");
        cc.drive();

    }
}
