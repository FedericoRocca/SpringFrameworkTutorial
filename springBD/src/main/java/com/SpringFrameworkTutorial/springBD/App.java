package com.SpringFrameworkTutorial.springBD;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.SpringFrameworkTutorial.beans.Jugador;
import com.SpringFrameworkTutorial.service.ServiceJugador;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("com/SpringFrameworkTutorial/xml/beans.xml");
    	ServiceJugador sJugador = (ServiceJugador) appContext.getBean("serviceJugadorImpl");
    	Jugador jugador1= (Jugador) appContext.getBean("jugador1");
    	try {
			sJugador.registrar(jugador1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}
