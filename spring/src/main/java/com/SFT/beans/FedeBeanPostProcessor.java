package com.SFT.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class FedeBeanPostProcessor implements BeanPostProcessor {

	// Antes de inicializar
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Antes de la inicialización de: " + beanName);
		return bean;
	}
	
	// Luego de inicializar
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Después de la inicialización de: " + beanName);
		return bean;
	}


}
