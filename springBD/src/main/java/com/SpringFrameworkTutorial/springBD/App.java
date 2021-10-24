package com.SpringFrameworkTutorial.springBD;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringFrameworkTutorial.beans.Marca;
import com.SpringFrameworkTutorial.service.ServiceMarca;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	Marca marca = new Marca();
    	marca.setId(2);
    	marca.setNombre("marca 2");
    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("com/SpringFrameworkTutorial/xml/beans.xml");
    	ServiceMarca sm = (ServiceMarca)appContext.getBean("serviceMarcaImpl");
    	try {
			sm.registrar(marca);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}
