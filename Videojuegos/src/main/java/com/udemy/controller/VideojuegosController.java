package com.udemy.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.udemy.domain.Videojuego;
import com.udemy.ws.VidejuegosService;

@Controller
public class VideojuegosController {
	
	private final VidejuegosService videojuegoService;
	
	
	
	 public VideojuegosController(VidejuegosService videojuegoService) {
		super();
		this.videojuegoService = videojuegoService;
	}



	@RequestMapping("/")
	    public String listarVideojuegos(Model model) {
			List<Videojuego> juegos = videojuegoService.buscarDestacados();
			model.addAttribute("videojuegos", juegos);
	        return "listado";
	    }
}
