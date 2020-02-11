package com.udemy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.udemy.domain.Videojuego;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer>{

	@Query(value= "select * from videojuegos v order by v.nombre", nativeQuery = true)
	List<Videojuego> buscarTodos();
	
	@Query(value = "select * from videojuegos v where v.distribuidor_id = ?1 order by v.nombre", nativeQuery = true)
	List<Videojuego> buscarPorDistribuidor(int distribuidorId);
	
	
	//List<Videojuego> findByNombreContaining(String consulta);
	@Query(value = "select * from videojuegos where nombre like %?1%", nativeQuery = true)
	List<Videojuego> buscar(String consulta);
}
