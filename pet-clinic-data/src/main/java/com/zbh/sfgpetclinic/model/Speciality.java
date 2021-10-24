package com.zbh.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
* @author ZinBhoneHtut
* @date Sep 29, 2021
*/
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

	private static final long serialVersionUID = 8219591189702919507L;
	
	@Column(name = "description")
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
