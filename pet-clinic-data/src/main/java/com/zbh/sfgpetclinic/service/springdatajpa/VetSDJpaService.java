package com.zbh.sfgpetclinic.service.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.zbh.sfgpetclinic.model.Vet;
import com.zbh.sfgpetclinic.repository.VetRepository;
import com.zbh.sfgpetclinic.service.VetService;

import lombok.RequiredArgsConstructor;

/**
* @author ZinBhoneHtut
* @credit guru.springframework
* @date Oct 26, 2021
*/
@Service
@Profile("springdatajpa")
@RequiredArgsConstructor
public class VetSDJpaService implements VetService {
	
	private final VetRepository vetRepository;

	@Override
	public Vet findById(Long id) {
		return vetRepository.findById(id).orElse(null);
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets = new HashSet<>();
	    vetRepository.findAll().forEach(vets::add);
	    return vets;
	}

	@Override
	public Vet save(Vet vet) {
		return vetRepository.save(vet);
	}

	@Override
	public void deleteById(Long id) {
		vetRepository.deleteById(id);
	}

	@Override
	public void delete(Vet vet) {
		vetRepository.delete(vet);
	}

}
