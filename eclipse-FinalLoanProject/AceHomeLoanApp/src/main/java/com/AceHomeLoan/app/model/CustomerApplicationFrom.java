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
	private PropertyDetails propertydetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAccountDetails accountDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoanBank priviousBank;
	
	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails guatrantorDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AllPersonalDocs personalDocument;
	
	
	
	

}
