package com.AceHomeLoan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AllPersonalDocs 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long documentId;
	@Lob
	private byte[] adrProof;
	@Lob
	private byte[] panCard;
	@Lob
	private byte[] adhar;
	@Lob
	private byte[] itr;
	@Lob
	private byte[] photo;
	@Lob
	private byte[] signature;
	@Lob
	private byte[] thumb;
	@Lob
	private byte[] bankChecque;
	@Lob
	private byte[] salarySlip;

}

