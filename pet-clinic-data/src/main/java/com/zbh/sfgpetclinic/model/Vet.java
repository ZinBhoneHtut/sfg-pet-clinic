package com.zbh.sfgpetclinic.model;

import java.util.Set;

public class Vet extends Person {
	
	private static final long serialVersionUID = 6668050596873100596L;

	private Set<Speciality> specialities;

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}
	
}
