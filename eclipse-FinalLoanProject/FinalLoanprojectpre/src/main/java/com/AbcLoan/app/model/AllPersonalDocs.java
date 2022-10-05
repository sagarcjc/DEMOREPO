package com.AbcLoan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AllPersonalDocs 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long documentId;
	@Lob
	private byte[] addressProof;
	@Lob
	private byte[] panCard;
	@Lob
	private  byte[]  AdharCard;
	@Lob
	private  byte[]  incomeTaxReturn;
	@Lob
	private byte[]  photo;
	@Lob
	private  byte[]  signature;
	@Lob
	private byte[]  thumb;
	@Lob
	private  byte[]  bankChecque;
	@Lob
	private  byte[]  salarySlip;
	@Lob
	private  byte[]  bankStatment;

}
