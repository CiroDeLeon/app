package com.itac.ciro.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import com.itac.ciro.app.entity.Persona;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class HelloService {
	@GetMapping(value="Persona/all",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Persona> obtenerPersonas(){
		List<Persona> lista=new ArrayList<Persona>();
		Persona p1=new Persona(1,"ciro cayo","de leon burgos");
		Persona p2=new Persona(1,"ciro manuel","de leon agamez");
		Persona p3=new Persona(1,"saskia","agamez gomez");
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		return lista;
	}

}
