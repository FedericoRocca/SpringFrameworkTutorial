package com.SpringFrameworkTutorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringFrameworkTutorial.beans.Jugador;
import com.SpringFrameworkTutorial.dao.DAOJugador;

@Service
public class ServiceJugadorImpl implements ServiceJugador {
	
	@Autowired
	private DAOJugador daoJugador;

	@Override
	public void registrar(Jugador jugador) throws Exception {
		try {
			daoJugador.registrar(jugador);
		} catch (Exception e) {
			throw e;
		}
	}

}
