package com.example.kartiksapra.springcrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kartiksapra.springcrud.models.Characters;
import com.example.kartiksapra.springcrud.services.CRUDService;

@RestController
public class MarvelCrudController {

	@Autowired
	CRUDService crudService;
	//CRUD 
	
	//Create API endpoint - POST
//	localhost:8080/create
	@PostMapping(path = "create")
	private void createSuperhero(@RequestBody Characters superhero) {
		// TODO Auto-generated method stub
		
		crudService.createSuperhero(superhero);

	}
	
	
//	Read API endpoint
//	localhost:8080/read?id=1
	@GetMapping("read")
	private Characters readSuperheroById(@RequestParam (name = "id")int val) {
		return crudService.readSuperheroById(val);
	}
	
	
//	Update API endpoint
//	localhost:8080/update?id=1
	@PutMapping("update")
	private void updateSuperheroHumanName(@RequestBody Characters superhero,@RequestParam(name = "id") int id) {
		crudService.updateSuperheroHumanName(superhero, id);
	}
	
//	Delete API endpoint
//	localhost:8080/delete?id=1
	@DeleteMapping("delete")
	public void deleteSuperhero(@RequestParam (name = "id") int id) {
		crudService.deleteSuperhero(id);
	}
}
