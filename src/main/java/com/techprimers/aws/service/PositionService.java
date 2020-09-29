package com.techprimers.aws.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.techprimers.aws.entity.Position;
import com.techprimers.aws.repository.PositionRepository;


@Service
public class PositionService {

	@Autowired
	private PositionRepository positionRepository;
	
	public ResponseEntity<?> updatePosition(Position position) throws Exception {
		Optional<Position> emp = positionRepository.findById(position.getPositionId());
		position.setPositionId(emp.get().getPositionId());
		if (positionRepository.save(position) != null) {
			return ResponseEntity.ok("Position Updated Successfully");
		} else {
			throw new Exception("Somthing went wrong..!!");
		}
	}
	
}
