package com.SFT.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.SFT.interfaces.IEquipo;

@Component
public class Barcelona implements IEquipo{

	@Override
	public String mostrar() {
		return "Barcelona FC";
	}
	
}
