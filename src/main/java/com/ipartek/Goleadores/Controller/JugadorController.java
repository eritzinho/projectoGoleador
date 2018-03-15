package com.ipartek.Goleadores.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipartek.Goleadores.Entidades.Jugador;
import com.ipartek.Goleadores.Service.JugadorService;

@RestController
@RequestMapping("/goleiros")
public class JugadorController {
	
	@Autowired
	JugadorService js;

	@GetMapping(produces="application/json")
	public List<Jugador> getJugadores(){
		return js.getJugadores();
		
	}
	
	@GetMapping(path="/{nombre}",produces="application/json")
	public Jugador getJugadorByNombre(String nombre) {
		return js.getJugadorByNombre(nombre);
	}
}
