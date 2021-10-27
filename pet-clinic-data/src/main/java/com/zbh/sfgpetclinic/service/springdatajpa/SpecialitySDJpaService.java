package com.zbh.sfgpetclinic.service.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.zbh.sfgpetclinic.model.Speciality;
import com.zbh.sfgpetclinic.repository.SpecialityRepository;
import com.zbh.sfgpetclinic.service.SpecialityService;

import lombok.RequiredArgsConstructor;

/**
* @author ZinBhoneHtut
* @credit guru.springframework
* @date Oct 27, 2021
*/
@Service
@Profile("springdatajpa")
@RequiredArgsConstructor
public class SpecialitySDJpaService implements SpecialityService {

	private final SpecialityRepository specialityRepository;

	@Override
	public Speciality findById(Long id) {
		return specialityRepository.findById(id).orElse(null);
	}

	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> specialites = new HashSet<>();
		specialityRepository.findAll().forEach(specialites::add);
		return specialites;
	}

	@Override
	public Speciality save(Speciality speciality) {
		return specialityRepository.save(speciality);
	}

	@Override
	public void deleteById(Long id) {
		specialityRepository.deleteById(id);
	}

	@Override
	public void delete(Speciality speciality) {
		specialityRepository.delete(speciality);
	}
}
