package com.techprimers.aws.dto;

import org.springframework.data.repository.CrudRepository;

import com.techprimers.aws.entity.Company2;


public interface CompanyRepo2 extends CrudRepository<Company2, Integer>{
	
	public Company2 findById(int id);
	
}