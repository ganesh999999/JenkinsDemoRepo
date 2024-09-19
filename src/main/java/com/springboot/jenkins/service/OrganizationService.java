package com.springboot.jenkins.service;

import java.util.Optional;

import com.springboot.jenkins.org.entity.Organization;

public interface OrganizationService {
	void populateOrganization(Organization organization);
	Optional<Organization> getOrganizationById(int orgId);
	Optional<Organization> getOrganizationByCode(int orgCode);	
}
