package com.AceHomeLoan.app.ServiceI;

import java.util.List;

import com.AceHomeLoan.app.model.CustomerAccountDetails;

public interface CustomerAccountDetailsServiceI {

	CustomerAccountDetails saveAccountDetails(CustomerAccountDetails depdetails);

	List<CustomerAccountDetails> getAllAccountDetails();

	void deleteAccountDetails(Long accountId);

}
