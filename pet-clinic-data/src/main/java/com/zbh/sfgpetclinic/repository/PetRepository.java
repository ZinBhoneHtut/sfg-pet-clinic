package com.zbh.sfgpetclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.zbh.sfgpetclinic.model.Pet;

/**
* @author ZinBhoneHtut
* @credit guru.springframework
* @date Oct 26, 2021
*/
public interface PetRepository extends CrudRepository<Pet, Long> {

}
