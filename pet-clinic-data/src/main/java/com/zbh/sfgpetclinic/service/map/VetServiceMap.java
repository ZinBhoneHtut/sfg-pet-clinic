package com.zbh.sfgpetclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.zbh.sfgpetclinic.model.Vet;
import com.zbh.sfgpetclinic.service.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Vet save(Vet object) {
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

}
