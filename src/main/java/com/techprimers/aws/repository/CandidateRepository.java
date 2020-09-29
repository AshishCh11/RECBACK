package com.techprimers.aws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprimers.aws.entity.Candidate;


public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

}
