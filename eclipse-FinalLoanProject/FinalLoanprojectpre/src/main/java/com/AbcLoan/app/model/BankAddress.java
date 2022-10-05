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
public class BankAddress 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bankId;
	private String bankArea;
	private String bankCity;
	private String bankDistrict;
	private String State;
	private Long pincode;
	

}
