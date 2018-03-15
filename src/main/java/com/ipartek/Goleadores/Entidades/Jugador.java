package com.ipartek.Goleadores.Entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="jugadores")
public class Jugador {

	@Id
	@GeneratedValue
	private Integer idjugadores;
	
	private String nombre, apellidos;
	
	
	@OneToMany(mappedBy="jugador")
	private List<Estadisticas> stats;

	public Integer getIdjugadores() {
		return idjugadores;
	}

	public void setIdjugadores(Integer idjugadores) {
		this.idjugadores = idjugadores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public List<Estadisticas> getStats() {
		return stats;
	}

	public void setStats(List<Estadisticas> stats) {
		this.stats = stats;
	}


	
}
