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
public class PropertyAddress 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long propertyAdrId;
	private	String areaName;
	private	String cityName;
	private	String district;
	private	String state;
	private	Long pinCode;
	
}
