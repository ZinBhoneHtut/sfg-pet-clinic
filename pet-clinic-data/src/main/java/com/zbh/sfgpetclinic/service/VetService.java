package com.zbh.sfgpetclinic.service;

import java.util.Set;

import com.zbh.sfgpetclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
