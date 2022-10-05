package com.AceHomeLoan.app.ServiceI;

import java.util.List;
import com.AceHomeLoan.app.model.Enquiry;


public interface EnquiryServiceI
{

	List<Enquiry> getAllEnquiry();

	void saveEnquiry(Enquiry enquiry);
	
	
	

}
