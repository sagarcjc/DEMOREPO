package com.AceHomeLoan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LoanDisbursement 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer agreementid;	
	private Integer loanNo;
	private String agrrementDate;
	private String amountPayType;
	private Double totalAmount;
	private String bankName;
	private Double accountNumber;	
	private String IFSCCode;	
	private String accountType;	
	private Double transferAmount;	
	private String paymentStatus;	
	private String amountPaidDate;	

}
