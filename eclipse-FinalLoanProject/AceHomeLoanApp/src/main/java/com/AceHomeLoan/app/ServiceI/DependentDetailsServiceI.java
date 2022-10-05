package com.AceHomeLoan.app.ServiceI;

import java.util.List;

import com.AceHomeLoan.app.model.DependentDetails;

public interface DependentDetailsServiceI 
{

	DependentDetails saveDependentDetails(DependentDetails depdetails);

	List<DependentDetails> getAllDependentDetails();

	void deleteDependentDetails(Long dependantId);

}
