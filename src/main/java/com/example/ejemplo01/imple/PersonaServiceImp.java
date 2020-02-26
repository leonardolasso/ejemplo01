package com.example.ejemplo01.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejemplo01.entity.Persona;
import com.example.ejemplo01.service.PersonaRepositorio;
import com.example.ejemplo01.service.PersonaService;


@Service
public class PersonaServiceImp implements PersonaService{

	@Autowired	
	private PersonaRepositorio repositorio;
	
	@Override
	public List<Persona> listar() {
		return repositorio.findAll();
	}

	@Override
	public Persona listarId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public Persona add(Persona p) {
		
		return repositorio.save(p);
		
	}

	@Override
	public Persona edit(Persona p) {
		return repositorio.save(p);
	}

	@Override
	public Persona delete(int p) {
		// TODO Auto-generated method stub
		return null;
	}

}
