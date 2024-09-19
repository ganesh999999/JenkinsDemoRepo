package com.springboot.jenkins.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jenkins.org.entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
	Optional<Organization> findByOrgCode(int orgCode);
}
