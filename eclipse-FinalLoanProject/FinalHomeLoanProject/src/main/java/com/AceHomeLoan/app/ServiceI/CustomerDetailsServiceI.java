package com.AceHomeLoan.app.ServiceI;

import java.util.List;



import com.AceHomeLoan.app.model.CustomerDetails;

public interface CustomerDetailsServiceI 
{

	CustomerDetails saveCustomerDetails(CustomerDetails cusdetails);

	List<CustomerDetails> getAllCustomerDetails();

	void deleteCustomerDetails(Long customerId);
	

}
