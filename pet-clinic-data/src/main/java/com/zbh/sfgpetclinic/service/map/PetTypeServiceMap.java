package com.zbh.sfgpetclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.zbh.sfgpetclinic.model.PetType;
import com.zbh.sfgpetclinic.service.PetTypeService;

/**
* @author ZinBhoneHtut
* @credit guru.springframework
* @date Sep 29, 2021
*/
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {

	@Override
	public Set<PetType> findAll() {
		return super.findAll();
	}

	@Override
	public PetType findById(Long id) {
		return super.findById(id);
	}

	@Override
	public PetType save(PetType object) {
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(PetType object) {
		super.delete(object);
	}

}
