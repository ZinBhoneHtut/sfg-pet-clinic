package com.zbh.sfgpetclinic.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pet extends BaseEntity{

	private static final long serialVersionUID = 3906390875475127627L;
	
	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;
}
