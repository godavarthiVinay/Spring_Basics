package client;

import beans.DataBaseProperties;
import beans.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataBasePropertiesTest {
public static void main(String[] args){

    ApplicationContext applicationContext= new ClassPathXmlApplicationContext("resources/spring.xml");
    DataBaseProperties data=(DataBaseProperties) applicationContext.getBean("dataBaseProperties");
    data.printDate();
    Test tt=(Test) applicationContext.getBean("test");
    System.out.println("username: "+tt.getUsername());

}
}
