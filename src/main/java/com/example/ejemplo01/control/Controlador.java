/**
 * 
 */
package com.example.ejemplo01.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejemplo01.entity.Persona;
import com.example.ejemplo01.service.PersonaService;

/**
 * @author leonardo.lasso
 *
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping({ "/persona" })
public class Controlador {

	@Autowired
	PersonaService service;

	@GetMapping(value = "/listar")
	public List<Persona>listar() {
		return service.listar();
	}
	
	@PostMapping
	public Persona agregar(@RequestBody Persona p) {
		return service.add(p);
		
	}
	
	@GetMapping(path = {"/{id}"})
	public Persona listarId(@PathVariable("id")int id) {
		
		return service.listarId(id);
	}
	
	@PutMapping(path= {"/{id}"})
	public Persona editar(@RequestBody Persona p, @PathVariable("id") int id)
	{
		p.setId(id);
		return service.edit(p);
	}

}
