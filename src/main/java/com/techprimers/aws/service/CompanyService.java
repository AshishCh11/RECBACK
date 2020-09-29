package com.techprimers.aws.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.techprimers.aws.entity.Company;
import com.techprimers.aws.repository.CompanyRepository;


@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	public ResponseEntity<?> updateCompany(Company employee) throws Exception {
		Optional<Company> emp = companyRepository.findById(employee.getId());
		employee.setId(emp.get().getId());
		if (companyRepository.save(employee) != null) {
			return ResponseEntity.ok("Employee Updated Successfully");
		} else {
			throw new Exception("Somthing went wrong..!!");
		}
	}
	
}
