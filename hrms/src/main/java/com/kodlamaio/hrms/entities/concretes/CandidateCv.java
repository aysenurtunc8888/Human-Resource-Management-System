package com.kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "candidates_cv")
@AllArgsConstructor
@NoArgsConstructor

public class CandidateCv {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "candidate_id")
	private int candidateId;
	
	@Column(name = "linkedin_address")
	private String linkedinAddress;
	
	@Column(name = "github_address")
	private String githubAddress;
	
	@Column(name = "cover_letter")
	private String coverLetter;
	
	@Column(name = "avatar_url")
	private String avatarUrl;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@OneToMany(mappedBy = "candidateCv", fetch = FetchType.LAZY)
	private List<CandidateSchool> schools;
	
	@OneToMany(mappedBy = "candidateCv", fetch = FetchType.LAZY)
	private List<CandidateTalent> talents;
	
	@OneToMany(mappedBy = "candidateCv", fetch = FetchType.LAZY)
	private List<CandidateJobExperience> jobExperience;
	
	@OneToMany(mappedBy = "candidateCv", fetch = FetchType.LAZY)
	private List<CandidateLanguage> languages;

	
	
	
}
