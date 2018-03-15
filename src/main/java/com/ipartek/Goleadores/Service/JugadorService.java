package com.ipartek.Goleadores.Service;

import java.util.List;

import com.ipartek.Goleadores.Entidades.Jugador;

public interface JugadorService {
	public List<Jugador> getJugadores();
	
	public Jugador getJugadorByNombre(String nombre);
}
