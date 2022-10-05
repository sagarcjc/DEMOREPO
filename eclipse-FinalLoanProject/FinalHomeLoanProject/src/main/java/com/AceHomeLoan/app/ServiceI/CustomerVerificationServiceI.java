package com.AceHomeLoan.app.ServiceI;

import java.util.List;

import com.AceHomeLoan.app.model.CustomerVerification;

public interface CustomerVerificationServiceI {

	CustomerVerification saveCVerification(CustomerVerification verificationId);

	List<CustomerVerification> getAllCverification();

	void deleteDependentDetails(Long verificationId);

}
