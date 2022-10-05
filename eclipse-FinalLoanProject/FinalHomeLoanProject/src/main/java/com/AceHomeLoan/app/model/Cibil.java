package com.AceHomeLoan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cibil 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cibilId;
	private Integer cibilScore;
	private String cibilScoreDate;
	private String  Status;
	

}
