package com.udemy.ws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.udemy.domain.Videojuego;

@Service
public class VidejuegosService {

	public List<Videojuego> buscarDestacados(){
		List<Videojuego> destacados = new ArrayList<>();
		
		Videojuego juego = new Videojuego();
		
		juego.setDescripcion("Lenguaje funcional");
		juego.setNombre("Haskell");
		juego.setImagenUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/Haskell-Logo.svg/1200px-Haskell-Logo.svg.png");
		
		destacados.add(juego);
		
		juego = new Videojuego();
		
		juego.setDescripcion("Lenguaje Lógico");
		juego.setNombre("Prolog");
		juego.setImagenUrl("https://programaenlinea.net/wp-content/uploads/2018/08/prolog-1024x585.jpg");
		
		destacados.add(juego);
				
		return destacados;
	}
}
