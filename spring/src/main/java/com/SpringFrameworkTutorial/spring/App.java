package com.SpringFrameworkTutorial.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringFrameworkTutorial.beans.Mundo;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/SpringFrameworkTutorial/xml/beans.xml");
		Mundo m = (Mundo) appContext.getBean("mundoBean");
		System.out.println(m.getSaludo());
		((ConfigurableApplicationContext)appContext).close();
	}

}
