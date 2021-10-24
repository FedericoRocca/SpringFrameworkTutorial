package com.SFT.beans;

import org.springframework.stereotype.Component;

import com.SFT.interfaces.IEquipo;

@Component
public class Juventus implements IEquipo{

	@Override
	public String mostrar() {
		return "Juventus";
	}

}
