package com.example.kartiksapra.springcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.kartiksapra.springcrud.models.Characters;

@Repository
public interface SuperheroCharacterRepository extends JpaRepository<Characters, Integer> {
	
	
}
