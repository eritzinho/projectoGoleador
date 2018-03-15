package com.ipartek.Goleadores.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="goles")
public class Estadisticas {

	@Id
	@GeneratedValue
	private String temporada;
	
	private String goles;
	
	@ManyToOne
	@JoinColumn(name = "jugadores_idjugadores")
	private Jugador jugador;

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public String getGoles() {
		return goles;
	}

	public void setGoles(String goles) {
		this.goles = goles;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	
	
}
