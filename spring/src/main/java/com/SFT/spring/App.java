package com.SFT.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SFT.beans.Mundo;
import com.SFT.beans.Persona;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/SFT/xml/beans.xml");
		//AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		//appContext.register(AppConfig.class);
		//appContext.register(AppConfig2.class);
		//appContext.register(Persona.class);
		//appContext.refresh();
	
		Mundo m = (Mundo) appContext.getBean("mundo");
		System.out.println(m.getSaludo());
		
		Persona per = (Persona) appContext.getBean("personaBean2");
		System.out.println(
				"ID: " + per.getId() + 
				", nombre: " + per.getNombre() + 
				", apodo: " + per.getApodo() + 
				", pais: " + per.getPais().getNombre() + 
				", ciudad: " + per.getPais().getCiudad().getNombre()
				);
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
