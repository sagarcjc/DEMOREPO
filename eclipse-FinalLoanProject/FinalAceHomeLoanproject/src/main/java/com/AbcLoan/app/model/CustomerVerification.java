package com.AbcLoan.app.model;

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
public class CustomerVerification 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long verificationId;
	private String verificationDate;
	private String status;
	private String remakrs;

}
