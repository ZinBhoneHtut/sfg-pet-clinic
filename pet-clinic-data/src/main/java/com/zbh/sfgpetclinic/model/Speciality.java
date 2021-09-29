package com.zbh.sfgpetclinic.model;

/**
* @author ZinBhoneHtut
* @date Sep 29, 2021
*/
public class Speciality extends Person {

	private static final long serialVersionUID = 8219591189702919507L;
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
