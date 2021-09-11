package com.zbh.sfgpetclinic.service;

import com.zbh.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastName);
}
