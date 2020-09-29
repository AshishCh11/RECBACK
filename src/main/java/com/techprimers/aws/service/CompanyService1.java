package com.techprimers.aws.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.techprimers.aws.entity.Company1;
import com.techprimers.aws.repository.CompanyRepository1;


@Service
public class CompanyService1 {

	@Autowired
	private CompanyRepository1 companyRepository1;
	
	public ResponseEntity<?> updateCompany1(Company1 employee) throws Exception {
		Optional<Company1> emp = companyRepository1.findById(employee.getId());
		employee.setId(emp.get().getId());
		if (companyRepository1.save(employee) != null) {
			return ResponseEntity.ok("Company Updated Successfully");
		} else {
			throw new Exception("Somthing went wrong..!!");
		}
	}
	
}
