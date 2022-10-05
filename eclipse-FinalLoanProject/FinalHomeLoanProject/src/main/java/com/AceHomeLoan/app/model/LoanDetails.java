package com.AceHomeLoan.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long loanId;
	private	Long loanNo;
	private	Double loanAmount;
	private	Integer rateOfInterest;
	private	Integer tenure;
	private	Double totalAmounttobepaid;
	private	Double processingFees;
	private	Double totalInterest;
	private	String sanctionDate;
	private	String remark;
	private	String status;
	@OneToOne(cascade = CascadeType.ALL)
	private	EMIDetails emidetails;



}
