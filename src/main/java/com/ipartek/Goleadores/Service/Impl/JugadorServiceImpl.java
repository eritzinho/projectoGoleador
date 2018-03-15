package com.ipartek.Goleadores.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.Goleadores.Entidades.Jugador;
import com.ipartek.Goleadores.Respository.JugadorRepository;
import com.ipartek.Goleadores.Service.JugadorService;

@Service
public class JugadorServiceImpl implements JugadorService{
	
	@Autowired
	JugadorRepository jr;

	@Override
	public List<Jugador> getJugadores() {
		return jr.findAll();
	}

	@Override
	public Jugador getJugadorByNombre(String nombre) {
		return jr.findByNombre(nombre);
	}

}
