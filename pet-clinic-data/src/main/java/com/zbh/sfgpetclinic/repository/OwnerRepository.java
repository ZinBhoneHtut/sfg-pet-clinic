package com.zbh.sfgpetclinic.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.zbh.sfgpetclinic.model.Owner;

/**
* @author ZinBhoneHtut
* @credit guru.springframework
* @date Oct 26, 2021
*/
public interface OwnerRepository extends  CrudRepository<Owner, Long> {
	
	Optional<Owner> findByLastName(String lastName);
}
