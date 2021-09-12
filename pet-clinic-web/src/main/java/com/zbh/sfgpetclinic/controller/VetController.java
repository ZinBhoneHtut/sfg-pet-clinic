package com.zbh.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/vets", "/admin/vets", "/admin/vets.html"})
public class VetController {

	@GetMapping
	public String viewVetList() {
		return "admin/vet";
	}
}
