package org.mt.petclinic.services.map;

import java.util.Set;

import org.mt.petclinic.model.Owner;
import org.mt.petclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}

	@Override
	public void deleteById(Long id) { 
		super.deleteById(id);
	}
  
	@Override
	public void delete(Owner object) {
		super.delete(object);
	}




}