package com.zbh.sfgpetclinic.service.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.zbh.sfgpetclinic.model.Pet;
import com.zbh.sfgpetclinic.repository.PetRepository;
import com.zbh.sfgpetclinic.service.PetService;

import lombok.RequiredArgsConstructor;

/**
* @author ZinBhoneHtut
* @credit guru.springframework
* @date Oct 27, 2021
*/
@Service
@Profile("springdatajpa")
@RequiredArgsConstructor
public class PetSDJpaService implements PetService{

	private final PetRepository petRepository;

	@Override
	public Pet findById(Long id) {
		return petRepository.findById(id).orElse(null);
	}

	@Override
	public Set<Pet> findAll() {
		Set<Pet> pets = new HashSet<>();
		petRepository.findAll().forEach(pets::add);
		return pets;
	}

	@Override
	public Pet save(Pet pet) {
		return petRepository.save(pet);
	}

	@Override
	public void deleteById(Long id) {
		petRepository.deleteById(id);
	}

	@Override
	public void delete(Pet pet) {
		petRepository.delete(pet);
	}
	
}
