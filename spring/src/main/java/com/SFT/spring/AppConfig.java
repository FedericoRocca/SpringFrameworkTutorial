package com.SFT.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SFT.beans.Barcelona;
import com.SFT.beans.Camiseta;
import com.SFT.beans.Jugador;
import com.SFT.beans.Juventus;
import com.SFT.beans.Marca;
import com.SFT.interfaces.IEquipo;

@Configuration
public class AppConfig {
	@Bean
	public Jugador jugador1()
	{
		return new Jugador();
	}
	
	@Bean
	public Barcelona barcelona()
	{
		return new Barcelona();
	}
	
	@Bean
	public Barcelona barcelona1()
	{
		return new Barcelona();
	}
	
	@Bean
	public Juventus juventus()
	{
		return new Juventus();
	}
	
	@Bean
	public Camiseta camiseta()
	{
		return new Camiseta();
	}
	
	@Bean
	public Marca marca()
	{
		return new Marca();
	}
	
}
