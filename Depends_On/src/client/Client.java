package client;

import beans.A;
import beans.B;
import beans.C;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Client {

    public static void main(String[] args){

        Resource resource=new ClassPathResource("resources/spring.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        B b=(B)factory.getBean("b");
        A a=(A) factory.getBean("a");
        C c=(C)factory.getBean("c");



        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/spring.xml");
        A aa=(A)applicationContext.getBean("a");
        B bb=(B)applicationContext.getBean("b");
        C cc=(C)applicationContext.getBean("c");

    }
}
