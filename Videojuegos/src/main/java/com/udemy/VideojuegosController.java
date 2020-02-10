package com.udemy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideojuegosController {
	
	 @RequestMapping("/")
	    public String listarVideojuegos() {
	        return "listado";
	    }
}
