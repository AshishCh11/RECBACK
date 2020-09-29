package com.techprimers.aws.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company1 {

	@Id
	@GeneratedValue
	private int id;
	
//	@Column
//	private String companyName;
//	
	@OneToMany(targetEntity = Position1.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cp_fk", referencedColumnName = "id", nullable = false)
	private List<Position1> positions1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public String getCompanyName() {
//		return companyName;
//	}
//
//	public void setCompanyName(String companyName) {
//		this.companyName = companyName;
//	}

	public List<Position1> getPositions1() {
		return positions1;
	}

	public void setPositions1(List<Position1> positions1) {
		this.positions1 = positions1;
	}

	
	
	
	
	
	
}

