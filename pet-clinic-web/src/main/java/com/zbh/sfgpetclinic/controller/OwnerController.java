package com.zbh.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/owner", "/admin/owner", "/admin/owner.html"})
public class OwnerController {

	@GetMapping
	public String viewOwnerList() {
		return "admin/owner";
	}
}