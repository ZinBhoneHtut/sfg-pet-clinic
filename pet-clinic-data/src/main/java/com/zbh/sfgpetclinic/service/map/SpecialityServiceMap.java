package com.zbh.sfgpetclinic.service.map;

import java.util.Set;

import com.zbh.sfgpetclinic.model.Speciality;
import com.zbh.sfgpetclinic.service.SpecialityService;

/**
* @author ZinBhoneHtut
* @credit guru.springframework
* @date Oct 27, 2021
*/
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService{

	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality object) {
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Speciality object) {
		super.delete(object);
	}

}
