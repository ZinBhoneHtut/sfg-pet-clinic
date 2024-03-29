package com.zbh.sfgpetclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.zbh.sfgpetclinic.model.Pet;
import com.zbh.sfgpetclinic.service.CrudService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
	
	@Override
    public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Pet save(Pet object) {
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

	
}
