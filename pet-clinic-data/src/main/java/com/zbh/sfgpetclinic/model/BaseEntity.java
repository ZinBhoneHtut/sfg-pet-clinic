package com.zbh.sfgpetclinic.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseEntity implements Serializable{

	private static final long serialVersionUID = -5428184757044392795L;
	
	private Long id;
}
