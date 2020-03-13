package client;

import beans.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class ClientTest {
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("resources/spring.xml");
        Test t=(Test) context.getBean("test");
        t.saveToDb("Rajesh","rajesh@gmail.com","Hyderbad");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for exit");
        int i=sc.nextInt();
        if (i==1){
            context.close();
        }
        else {
            System.out.println("Sry for inconvience. shutdown by programmer");
            System.out.println("La La LA  Bye Bye");
            context.close();
        }


    }
}
