package com.SFT.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SFT.beans.Jugador;
import com.SFT.interfaces.IEquipo;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/SFT/xml/beans.xml");
	
		Jugador messi = (Jugador)appContext.getBean("messi");
		System.out.println(messi.getNombre() + ", " + messi.getEquipo().mostrar());
		
		IEquipo bar = (IEquipo)appContext.getBean("barcelona");
		System.out.println(bar.mostrar());
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
