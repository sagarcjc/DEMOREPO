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
public class Permanent 
{ 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long permanentId;
	private String AreaName;
	private String CityName;
	private String District;
	private String State;
	private Double PinCode;
	private Integer HouseNo;
	private String StreetName;

	

}
