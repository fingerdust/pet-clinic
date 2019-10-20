package org.mt.petclinic.services;

import java.util.Set;

import org.mt.petclinic.model.Owner;

public interface OwnerService {
	Owner findById(Long id); 
	Owner save(Owner owner); 
	Set<Owner> findAll(); 
	Owner findByLastName(String lastName); 
	
}
