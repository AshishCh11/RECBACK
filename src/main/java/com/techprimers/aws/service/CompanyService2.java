package com.techprimers.aws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techprimers.aws.dto.CompanyRepo2;
import com.techprimers.aws.entity.Company2;
import com.techprimers.aws.repository.CompanyRepository2;

@Service
public class CompanyService2 implements CompanyRepository2{

	@Autowired
	private CompanyRepo2 companyRepo2;
	
	@Override
	public Company2 saveCompany(Company2 company2) {
		// TODO Auto-generated method stub
		return companyRepo2.save(company2);
	}

	@Override
	public Company2 updateCompany(Company2 company2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCompany(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Company2> getAllCompany() {
		List<Company2> list=(List<Company2>) companyRepo2.findAll();
		return list;
	}

}
