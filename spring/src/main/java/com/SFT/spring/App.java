package com.SFT.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SFT.beans.Mundo;
import com.SFT.beans.Persona;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/SFT/xml/beans.xml");
	
		Mundo m = (Mundo) appContext.getBean("mundo");
		System.out.println(m.getSaludo());
		
		Persona per = (Persona) appContext.getBean("persona");
		Persona per2 = (Persona) appContext.getBean("persona");
		
		per.setId(1);
		per.setNombre("persona " + per.getId() + " nombre");
		per.setApodo("apodo persona " + per.getId());
		
		per2.setId(2);
		per2.setNombre("persona " + per2.getId() + " nombre");
		per2.setApodo("apodo persona " + per2.getId());
		
		System.out.println(
				"ID: " + per.getId() + 
				", nombre: " + per.getNombre() + 
				", apodo: " + per.getApodo() + 
				", pais: " + per.getPais().getNombre() + 
				", ciudad: " + per.getCiudad().getNombre()
				);
		System.out.println(per);
		
		System.out.println(
				"ID: " + per2.getId() + 
				", nombre: " + per2.getNombre() + 
				", apodo: " + per2.getApodo() + 
				", pais: " + per2.getPais().getNombre() + 
				", ciudad: " + per2.getCiudad().getNombre()
				);
		System.out.println(per2);
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
