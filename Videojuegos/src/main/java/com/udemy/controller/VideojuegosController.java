package com.udemy.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping("/videojuegosPorDistribuidor")
		public String videojuegosPorDistribuidor(int distribuidorId, Model model) {
			List<Videojuego> juegos = videojuegoService.buscarDistribuidor(distribuidorId);
			model.addAttribute("videojuegos", juegos);
			return "listado";
		}	
	
	@RequestMapping("/buscador")
	public String buscador(@RequestParam("q") String consulta, Model model) {
		List<Videojuego> juegos = videojuegoService.buscar(consulta);
		model.addAttribute("videojuegos", juegos);
		return "listado";
	}
}
