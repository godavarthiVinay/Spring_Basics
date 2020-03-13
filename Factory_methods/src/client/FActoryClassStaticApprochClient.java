package client;

import beans.Car;
import beans.CarFactoryStaticApproach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FActoryClassStaticApprochClient {
    public static void main(String[] args){

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/spring.xml");
        Car cc=(Car) applicationContext.getBean("CarFactoryStaticApproach");
        cc.drive();

    }
}
