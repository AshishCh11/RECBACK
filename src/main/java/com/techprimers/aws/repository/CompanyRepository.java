package com.techprimers.aws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprimers.aws.entity.Company;


public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
