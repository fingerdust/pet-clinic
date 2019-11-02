package org.mt.petclinic.controllers;

import org.mt.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {
	
	private final OwnerService ownerService; 
	
	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}

	@RequestMapping({"", "/", "/index"})
	public String listOwners(Model model) {
		model.addAttribute("owners", ownerService.findAll()); 
		
		return "owners/index"; 
	}
}
