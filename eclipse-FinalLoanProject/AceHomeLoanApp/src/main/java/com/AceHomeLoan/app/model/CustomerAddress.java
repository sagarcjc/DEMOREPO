package com.AceHomeLoan.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class CustomerAddress
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cAddressId;
	@OneToOne (cascade =CascadeType.ALL )
	CustomerPermanent permanentadr;
	@OneToOne (cascade =CascadeType.ALL)
	CustomerLoacal localadr;

}
