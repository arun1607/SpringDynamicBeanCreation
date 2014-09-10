package com.learning.spring;

import com.learning.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        UserService userService = (UserService) applicationContext.getBean("userService", 1);
        userService.perform();
    }

}
