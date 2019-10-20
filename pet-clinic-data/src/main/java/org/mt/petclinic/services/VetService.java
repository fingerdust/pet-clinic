package org.mt.petclinic.services;

import java.util.Set;

import org.mt.petclinic.model.Pet;
import org.mt.petclinic.model.Vet;

public interface VetService {
	Vet findById(Long id); 
	Vet save(Vet vet); 
	Set<Vet> findAll(); 
}
