package com.zbh.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zbh.sfgpetclinic.service.OwnerService;

@Controller
@RequestMapping("/owner")
public class OwnerController {
	
	private final OwnerService ownerService;
	
	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}

	@GetMapping({"", "/", "/owner.html"})
	public String viewOwnerList(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "admin/owner";
	}
}
