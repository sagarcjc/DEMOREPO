package com.AbcLoan.app.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperationEnquiry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long operationaEnquiryId;
	private	String enquiryName;
	private	Integer age;
	private	String email;
	private	Long mobileNo;
	private String pancardNo;
	@OneToOne(cascade=CascadeType.ALL)
	CibilScore cibileScore;

}
