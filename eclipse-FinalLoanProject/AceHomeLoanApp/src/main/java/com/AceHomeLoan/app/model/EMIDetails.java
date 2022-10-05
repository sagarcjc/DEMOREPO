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
public class EMIDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer emiId;
	private Double emiAmountMonthly;
	private String nextEmiDueDate;
	private String previousEmiStatus;
}
