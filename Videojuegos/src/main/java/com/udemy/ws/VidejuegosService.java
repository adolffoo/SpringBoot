package com.udemy.ws;

import java.util.List;

import org.springframework.stereotype.Service;

import com.udemy.domain.Videojuego;
import com.udemy.repository.VideojuegoRepository;

@Service
public class VidejuegosService {
	
	private final VideojuegoRepository videojuegoRepository;
	
	

	public VidejuegosService(VideojuegoRepository videojuegoRepository) {
		this.videojuegoRepository = videojuegoRepository;
	}



	public List<Videojuego> buscarDestacados(){
				
		return videojuegoRepository.buscarTodos();
	}
	
	public List<Videojuego> buscarDistribuidor(int distribuidorId){
		return videojuegoRepository.buscarPorDistribuidor(distribuidorId);
	}
	
	public List<Videojuego> buscar(String consulta){
		return videojuegoRepository.buscar(consulta);
	}
}
