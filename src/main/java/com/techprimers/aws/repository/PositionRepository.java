package com.techprimers.aws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprimers.aws.entity.Position;


public interface PositionRepository extends JpaRepository<Position, Integer> {

}
