package com.techprimers.aws.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "position")
public class Position {
	
	@Id
	@GeneratedValue
	private int positionId;
	
//	@Column
//	private String positionName;

	@OneToMany(targetEntity = Candidate.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "pc_fk", referencedColumnName = "positionId", nullable = false)
	private List<Candidate> candidates;

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

//	public String getPositionName() {
//		return positionName;
//	}
//
//	public void setPositionName(String positionName) {
//		this.positionName = positionName;
//	}

	public List<Candidate> getCandidates() {
		return candidates;
	}

	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}
	
	
	
	
	

}
