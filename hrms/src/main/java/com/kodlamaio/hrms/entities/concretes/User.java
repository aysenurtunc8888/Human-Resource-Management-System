package com.kodlamaio.hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED) //miras verdigi sınıfa niteliklerini aktarır.
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employee"})
@AllArgsConstructor
@NoArgsConstructor

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="email_address")
	private String email;
	
	
	@Column(name="password")
	private String password;
	
	/*@OneToMany(mappedBy = "user")
	private List<Employee> employee;
	*/
	
	
	

}
