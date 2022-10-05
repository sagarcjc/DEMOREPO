package com.AbcLoan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoanDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long loanId;
	private Long loanNo;
	private Double loanAmount;
	private Integer rateOfInterest;
	private Integer tenure;
	private Double totalAmounttobepaid;
	private Double processingFees;
	private Double totalInterest;
	private String sanctionDate;
	private Double remark;
	private Double status;
	@OneToOne
	EMIDetails emidetails;

      
}
