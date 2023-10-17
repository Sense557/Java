package com.example.kartiksapra.springcrud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kartiksapra.springcrud.models.Characters;
import com.example.kartiksapra.springcrud.repositories.SuperheroCharacterRepository;


@Service
public class CRUDService {
	
	@Autowired
	SuperheroCharacterRepository superheroCharacterRepository;
	
	public void createSuperhero(Characters character) {
		// TODO Auto-generated method stub

		superheroCharacterRepository.save(character);
	}

	public Characters readSuperheroById(int val) {
		// TODO Auto-generated method stub
		
		return superheroCharacterRepository.findById(val).get();
	}

	public void updateSuperheroHumanName(Characters superhero, int id) {
		// TODO Auto-generated method stub
		
		Characters superheroToBeUpdated = readSuperheroById(id);
		superheroToBeUpdated.setHumanName(superhero.getHumanName());
		
		superheroCharacterRepository.save(superheroToBeUpdated);
	}

	public void deleteSuperhero(int id) {
		// TODO Auto-generated method stub
		superheroCharacterRepository.deleteById(id);
	}
	
	
}
