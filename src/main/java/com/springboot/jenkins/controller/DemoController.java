package com.springboot.jenkins.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jenkins.org.entity.Organization;
import com.springboot.jenkins.service.OrganizationService;

@RestController
public class DemoController {
	
	@Autowired
	OrganizationService organizationService;

	@GetMapping("/str")
	public String returnString() {
		return "jenkins app working fine";
	}
	@GetMapping("/name")
	public String returnName() {
		return "Ganesh";
	}
	
	@PostMapping("/organizationIn")
	public void populateOrganization(@RequestBody Organization organization) {
		organizationService.populateOrganization(organization);
	}

	@GetMapping("/organizationOutById")
	public Optional<Organization> getOrganizationById(int orgId) {
		Optional<Organization> organization = organizationService.getOrganizationById(orgId);
		System.out.println("organization == " + organization);
		return organization;
		// return organizationService.getOrganization(orgIdPk);
	}

	@GetMapping("/organizationOutByCode")
	public Optional<Organization> getOrganizationByCode(@RequestParam int orgCode) {
		return organizationService.getOrganizationByCode(orgCode);
	}
	
}
