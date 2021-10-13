package com.SFT.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.SFT.beans.AppConfig;
import com.SFT.beans.AppConfig2;
import com.SFT.beans.Mundo;

public class App {

	public static void main(String[] args) {
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("com/SFT/xml/beans.xml");
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.register(AppConfig.class);
		appContext.register(AppConfig2.class);
		appContext.refresh();
	
		Mundo m = (Mundo) appContext.getBean("marte");
		System.out.println(m.getSaludo());
		
		
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
