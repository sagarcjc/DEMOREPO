package com.AbcLoan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class DependentInfo
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long dependantId;
	private String fatherName;
	private String motherName;
	private Integer noOfChild;
	private String maritalStatus;
	private Integer noOfdependent;
	private Double familyIncome;
	private String spouse;
	

}
