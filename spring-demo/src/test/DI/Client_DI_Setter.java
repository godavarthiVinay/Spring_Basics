package test.DI;

import beans.DI.DI_Setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client_DI_Setter {

    public static void main(String[] args){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("resources/spring.xml");
        DI_Setter obj=(DI_Setter)applicationContext.getBean("DI_setter");
        obj.printData();

    }
}
