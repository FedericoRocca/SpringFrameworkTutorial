package com.SFT.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SFT.beans.Ciudad;
import com.SFT.beans.Mundo;
import com.SFT.beans.Persona;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/SFT/xml/beans.xml");
	
		Persona per = (Persona) appContext.getBean("persona");
		
		Ciudad ciu = (Ciudad) appContext.getBean("ciudad");
		
		System.out.println(
				"Apodo: " + per.getApodo() 
				);
		
		System.out.println(ciu.getNombre());
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
