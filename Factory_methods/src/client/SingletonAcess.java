package client;

import beans.CarSingleton;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class SingletonAcess {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring.xml");
        CarSingleton cc=(CarSingleton)context.getBean("car");
        CarSingleton c1=(CarSingleton)context.getBean("car");
        System.out.println(c1==cc);
        Calendar calender=(Calendar)context.getBean("calender");
        System.out.println(calender.getTime());

    }
}
