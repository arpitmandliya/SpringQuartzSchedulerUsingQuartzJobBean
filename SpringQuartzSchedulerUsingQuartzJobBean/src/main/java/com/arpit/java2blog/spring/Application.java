
package com.arpit.java2blog.spring;

/**
 * @author Arpit Mandliya
 *
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

public static void main(String[] args) throws Exception {
  new ClassPathXmlApplicationContext("quartz-config.xml");
 }
}


