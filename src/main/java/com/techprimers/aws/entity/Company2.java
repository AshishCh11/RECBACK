package com.techprimers.aws.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "company")
public class Company2 {

	@Id
	@GeneratedValue
	private int id;
	private String companyName;

	
	public Company2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company2(int id, String companyName) {
		super();
		this.id = id;
		this.companyName = companyName;
		}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	
	
}

