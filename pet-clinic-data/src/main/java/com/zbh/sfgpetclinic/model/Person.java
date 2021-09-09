package com.zbh.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person extends BaseEntity{
	
	private static final long serialVersionUID = 5461171155531359105L;
	
	private String firstName;
	private String lastName;
}
