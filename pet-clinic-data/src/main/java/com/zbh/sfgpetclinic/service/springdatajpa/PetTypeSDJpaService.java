package com.zbh.sfgpetclinic.service.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.zbh.sfgpetclinic.model.PetType;
import com.zbh.sfgpetclinic.repository.PetTypeRepository;
import com.zbh.sfgpetclinic.service.PetTypeService;

import lombok.RequiredArgsConstructor;

/**
* @author ZinBhoneHtut
* @credit guru.springframework
* @date Oct 27, 2021
*/
@Service
@Profile("springdatajpa")
@RequiredArgsConstructor
public class PetTypeSDJpaService implements PetTypeService{

	private final PetTypeRepository petTypeRepository;

	@Override
	public PetType findById(Long id) {
		return petTypeRepository.findById(id).orElse(null);
	}

	@Override
	public Set<PetType> findAll() {
		Set<PetType> petTypes = new HashSet<>();
		petTypeRepository.findAll().forEach(petTypes::add);
		return petTypes;
	}

	@Override
	public PetType save(PetType petType) {
		return petTypeRepository.save(petType);
	}

	@Override
	public void deleteById(Long id) {
		petTypeRepository.deleteById(id);
	}

	@Override
	public void delete(PetType petType) {
		petTypeRepository.delete(petType);
	}
	
}
