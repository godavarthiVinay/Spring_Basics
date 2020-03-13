package test;

import beans.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

    public static void main(String[] args) {

        //Core Container(Bean Factory) :- using xmBeanFactoy(I method -at time request only creates objects)

/*
        Resource resource=new ClassPathResource("resources/spring.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        Object obj=factory.getBean("t");
//        Object obj1=factory.getBean("t");
//        System.out.println(obj==obj1);
        Test t=(Test)obj;
        t.hello();
*/


        // J2EE Advanced Container(ApplicationContext) :-using classPathApplicationContext(II method -at the time of loading creates objects)

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/spring.xml");
        Object obj1=applicationContext.getBean("t");

        Test t1=(Test)obj1;
        t1.hello();

    }
}
