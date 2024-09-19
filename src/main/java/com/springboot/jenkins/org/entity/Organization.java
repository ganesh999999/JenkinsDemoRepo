package com.springboot.jenkins.org.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@JsonPropertyOrder
public class Organization {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@JsonProperty
	private int orgId;
	@JsonProperty
	private int orgCode;
	@JsonProperty
	private String orgName;
	@JsonProperty
	private String orgMail;
	@JsonProperty
	private String orgWebsite;
	@JsonProperty
	private long orgContact;

	public int getOrgId() {
		return orgId;
	}



	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}



	public int getOrgCode() {
		return orgCode;
	}



	public void setOrgCode(int orgCode) {
		this.orgCode = orgCode;
	}



	public String getOrgName() {
		return orgName;
	}



	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}



	public String getOrgMail() {
		return orgMail;
	}



	public void setOrgMail(String orgMail) {
		this.orgMail = orgMail;
	}



	public String getOrgWebsite() {
		return orgWebsite;
	}



	public void setOrgWebsite(String orgWebsite) {
		this.orgWebsite = orgWebsite;
	}



	public long getOrgContact() {
		return orgContact;
	}



	public void setOrgContact(long orgContact) {
		this.orgContact = orgContact;
	}



	@Override
	public String toString() {
		return "Organization [orgId=" + orgId + ", orgCode=" + orgCode + ", orgName=" + orgName + ", orgMail=" + orgMail
				+ ", orgWebsite=" + orgWebsite + ", orgContact=" + orgContact + "]";
	}

}
