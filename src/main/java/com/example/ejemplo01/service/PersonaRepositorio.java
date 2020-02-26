package com.example.ejemplo01.service;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.ejemplo01.entity.Persona;

public interface PersonaRepositorio extends Repository<Persona, Integer> {

	List<Persona> findAll();

	Persona findById(int id);

	Persona save(Persona p);

	void delete(Persona p);

}
