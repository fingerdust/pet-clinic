package org.mt.petclinic.services;

import java.util.Set;

import org.mt.petclinic.model.Pet;

public interface PetService {
	Pet findById(Long id); 
	Pet save(Pet pet); 
	Set<Pet> findAll(); 

}
