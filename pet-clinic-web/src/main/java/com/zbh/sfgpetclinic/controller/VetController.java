package com.zbh.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zbh.sfgpetclinic.service.VetService;

@Controller
@RequestMapping("/vet")
public class VetController {
	
	private final VetService vetService;

	public VetController(VetService vetService) {
		this.vetService = vetService;
	}

	@GetMapping({"","/","/vet.html"})
	public String viewVetList(Model model) {
		model.addAttribute("vets", vetService.findAll());
		return "admin/vet";
	}
}
