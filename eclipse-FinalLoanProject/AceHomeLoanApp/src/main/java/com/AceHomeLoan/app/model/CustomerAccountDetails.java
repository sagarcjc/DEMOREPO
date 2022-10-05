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
public class CustomerAccountDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private	Long accountId;
	private	String accounType;
	private	Double accountBalance;
	private String accountHolderName;
	private String accountStatus;
	private Double accountNO;


}
