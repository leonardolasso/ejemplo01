package com.example.ejemplo01.service;

import java.util.List;

import com.example.ejemplo01.entity.Persona;

public interface PersonaService {

	List<Persona> listar();

	Persona listarId(int id);

	Persona add(Persona p);

	Persona edit(Persona p);

	Persona delete(int p);

}
