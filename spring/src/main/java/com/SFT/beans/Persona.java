package com.SFT.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Persona implements InitializingBean, DisposableBean{
	
	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;
	private Ciudad ciudad;
	
	/*
		@PostConstruct
		private void initBean()
		{
			System.out.println("Antes de inicializar el bean");
		}
		
		@PreDestroy
		private void destroyBean()
		{
			System.out.println("Bean a punto de ser destruido");
		}
	*/
	
	public Pais getPais() {
		return pais;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Persona(int id, String nombre, String apodo)
	{
		this.id = id;
		this.nombre = nombre;
		this.apodo = apodo;
	}
	
	public Persona(int id)
	{
		this.id = id;
	}
	
	public Persona()
	{}
	
	public Persona(String apodo)
	{
		this.apodo = apodo;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApodo() {
		return apodo;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After persona");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy persona");
	}

}
