package com.AbcLoan.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CustomerApplicationFrom 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long applicationNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerDetails customerDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private DependentDetails customerDependent;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress customerAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private EducationalDetail customerEducationDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Profession customerProfession;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Mortgage mortgage;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAccountDetails customerAccountDetail;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	
	private PreviousLoan previousLoan;
	
	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails guarantorDetails;
	
	@OneToOne(cascade=CascadeType.ALL)
	private PropertyDetails propertyDetails ;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	private AllPersonalDocs allPersonalDocs;

}
