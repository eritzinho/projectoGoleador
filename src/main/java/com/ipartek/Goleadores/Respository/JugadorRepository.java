package com.ipartek.Goleadores.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipartek.Goleadores.Entidades.Jugador;

public interface JugadorRepository extends JpaRepository<Jugador, Integer>{

	Jugador findByNombre(String nombre);
}
