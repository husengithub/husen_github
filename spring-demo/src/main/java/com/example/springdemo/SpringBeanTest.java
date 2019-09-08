package com.example.springdemo;

import com.example.springdemo.pojo.DepeePOJO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        DepeePOJO depeePOJO = (DepeePOJO) context.getBean("depee");
        System.out.println(depeePOJO.toString());
    }
}
