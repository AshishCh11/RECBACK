package com.techprimers.aws.repository;

import java.util.List;

import com.techprimers.aws.entity.Company2;


public interface CompanyRepository2 {

	public Company2 saveCompany(Company2 company2);
	public Company2 updateCompany(Company2 company2);
	public  void deleteCompany(int id);
	public List<Company2> getAllCompany();
	
	
}
