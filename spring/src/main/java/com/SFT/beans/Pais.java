package com.SFT.beans;

import java.util.List;

public class Pais {
	
	private String nombre;
	private List<Ciudad> ciudades;

	public List<Ciudad> getCiudad() {
		return ciudades;
	}

	public void setCiudad(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

	public List<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
