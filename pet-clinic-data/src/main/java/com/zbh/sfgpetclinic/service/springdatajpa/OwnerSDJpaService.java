package com.zbh.sfgpetclinic.service.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.zbh.sfgpetclinic.model.Owner;
import com.zbh.sfgpetclinic.repository.OwnerRepository;
import com.zbh.sfgpetclinic.service.OwnerService;

/**
* @author ZinBhoneHtut
* @credit guru.springframework
* @date Oct 26, 2021
*/
@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {
    
    private final OwnerRepository ownerRepository;
    
    public OwnerSDJpaService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        ownerRepository.delete(owner);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName).orElse(null);
    }

}