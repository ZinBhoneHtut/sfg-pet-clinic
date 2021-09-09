package com.zbh.sfgpetclinic.service;

import java.util.Set;

import com.zbh.sfgpetclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
}
