package com.techprimers.aws.dto;

import com.techprimers.aws.entity.Candidate;
import com.techprimers.aws.entity.Company;
import com.techprimers.aws.entity.Company1;
import com.techprimers.aws.entity.Company2;
import com.techprimers.aws.entity.Position;
import com.techprimers.aws.entity.Position1;

public class CompanyRequest {

	private Company company;
	private Company2 company2;
	
	public Company1 getCompany1() {
		return company1;
	}

	public void setCompany1(Company1 company1) {
		this.company1 = company1;
	}

	public Position1 getPosition1() {
		return position1;
	}

	public void setPosition1(Position1 position1) {
		this.position1 = position1;
	}

	private Company1 company1;
	private Position1 position1;
	
	private Position position;
	
	private Candidate candidate;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Company2 getCompany2() {
		return company2;
	}

	public void setCompany2(Company2 company2) {
		this.company2 = company2;
	}
	
	
	
}
