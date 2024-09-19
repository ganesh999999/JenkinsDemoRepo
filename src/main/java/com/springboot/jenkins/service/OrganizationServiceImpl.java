package com.springboot.jenkins.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jenkins.org.entity.Organization;
import com.springboot.jenkins.repository.OrganizationRepository;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	OrganizationRepository organizationRepository;

	@Override
	public void populateOrganization(Organization organization) {
		organizationRepository.save(organization);

	}

	@Override
	public Optional<Organization> getOrganizationById(int orgId) {

		Optional<Organization> organization = organizationRepository.findById(orgId);
		System.out.println("organization ---  " + organization);
		return organization;
		// return organizationRepository.findById(orgIdPk);
	}

	@Override
	public Optional<Organization> getOrganizationByCode(int orgCode) {

		return organizationRepository.findByOrgCode(orgCode);
	}

}
