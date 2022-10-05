package com.AbcLoan.app.serviceI;

import java.util.List;

import com.AbcLoan.app.model.Enquiry;

public interface EnquiryServiceI
{

	List<Enquiry> getAllEnquiry();

	void saveEnquiry(Enquiry enquiry);
	
	
	

}
