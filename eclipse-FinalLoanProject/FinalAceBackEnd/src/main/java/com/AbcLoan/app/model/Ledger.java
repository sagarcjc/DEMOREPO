package com.AbcLoan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ledger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ledgerId;
	private String ledgerCreatedDate;
	private Double totalLoanAmount;
	private Double  payableAmountWithInterest;
	private Integer tenure;
	private Double monthlyEmi;
	private Double amountPaidTillDate;
	private  Double remainingAmount;
	private String nextEmiDateStart;
	private String nextEmiDateEnd;
	private Integer defaulterCount;
	private String previousEmiStatus;
	private String currentMonthEmiStatus;
	private String loanEndDate;
	private String loanStatus;


}
