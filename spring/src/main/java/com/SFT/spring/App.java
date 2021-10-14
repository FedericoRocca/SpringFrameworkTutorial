package com.SFT.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SFT.beans.Barcelona;
import com.SFT.beans.Jugador;
import com.SFT.beans.Juventus;
import com.SFT.interfaces.IEquipo;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/SFT/xml/beans.xml");
		Jugador jug = (Jugador)appContext.getBean("jugador1");
		
		System.out.println("Elija un equipo: ");
		System.out.println("1- Barcelona");
		System.out.println("2- Juventus");
		
		Scanner sc = new Scanner( System.in );
		int respuesta = sc.nextInt();
		
		switch(respuesta)
		{
		case 1:
			jug.setEquipo(new Barcelona());
			break;
			
		case 2:
			jug.setEquipo(new Juventus());
			break;
			
			default:
				break;
		}
		

	
		
		
		System.out.println(
				jug.getNombre() +
				"-" + jug.getEquipo().mostrar() +
				"-" + jug.getCamiseta().getNumero() +
				"-" + jug.getCamiseta().getMarca().getNombre()
				);

		((ConfigurableApplicationContext)appContext).close();
	}

}
