package test.DI;

import beans.DI.DI_COnstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client_DI_Constuctor {
    public static void main(String[] args){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("resources/spring.xml");
        DI_COnstructor obj=(DI_COnstructor)applicationContext.getBean("DI_constructor");
        obj.printData();

    }
}
