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
public class BankDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bankId;
	private Integer branchCode;
	private String bankName;
	private String branchType;
	private String IFSCcode;
	private Long contactNo;
	private String email;
	private String status;
	@OneToOne
	BankAddress bankAddress;
	

}
