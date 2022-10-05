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
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AllPersonalDocument {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long documentId;
	private Long customerId;
	@Lob
	private byte[] addressproof;
	@Lob
	private byte[] pancard;
	@Lob
	private byte[] incomeTaxReturn;
	@Lob
	private byte[] adharCard;
	@Lob
	private byte[] photo;
	@Lob
	private byte[] signature;
	@Lob
	private byte[] thumb;
	@Lob
	private byte[] bankCheque;
	@Lob
	private byte[] salarySlip;

}
