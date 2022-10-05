package com.AceHomeLoan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class CustomerLoacal
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer localId;
	private String AreaName;
	private String CityName;
	private String District;
	private String State;
	private Double PinCode;
	private Integer HouseNo;
	private String StreetName;
	
	
	

}
