package KLU.Spring_ID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.micrometer.observation.Observation.Context;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        
        //Employee e1 = (Employee)context.getBean("emp1");
        
        //System.out.println(e1);
        ApplicationContext context = new AnnotationConfigApplicationContext(App)
        Employee e1 = (Employee) Context.getBraan("add1")
    }
}
