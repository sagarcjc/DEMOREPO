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
public class SanctionalLetter 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long sanctionId;
		private String sanctionDate;
		private String applicantName;
		private double contactDetails;
		private String product;
		private double loanAmtSanctioned;
		private String interestType;
		private int rateOfInterest;
		private int loanTenure;
		private double monthlyEmiAmount;
		private String modeOfPayment;
		private String remarks;
		private String termsAndCondition;
		private String status;

}
