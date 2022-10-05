package com.AbcLoan.app.model;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Customer 
{
	private Long customerId;
	private String customerName;
	private Long customerMobileno;
    private String customerEmailId;
    private String  Gender;
    private String customerDOB;
    private Integer customerAge;
    private String loanType;
    private String maritalStatus;
    private String statusCode;
    private Double cTotalLoanRequired;
    
    @OneToMany
    EducationalDetail educationalQualification;
    
    BankDetails Bankdetails;
    @OneToOne
    AllPersonalDocs personalDocument;
    @OneToMany
    DependentInfo dependentInfo;
    @OneToOne
    CibilScore customerCibil;
    @OneToOne
    LoanDetails cloanDetails;
    @OneToMany
    CustomerAddress caddress;
    
}
