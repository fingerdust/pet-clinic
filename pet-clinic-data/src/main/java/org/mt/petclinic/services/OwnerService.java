package org.mt.petclinic.services;

import java.util.Set;

import org.mt.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastName); 
	
}
