package com.AceHomeLoan.app.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AceHomeLoan.app.ServiceI.CustomerApplicationServiceI;
import com.AceHomeLoan.app.model.CustomerApplicationFrom;
import com.AceHomeLoan.app.repository.CustomerApplicationRepository;

@Service
public class CustomerApplicationServiceImpl implements CustomerApplicationServiceI
{
	@Autowired
	CustomerApplicationRepository customerrepository;

	@Override
	public void saveCustomerApplication(CustomerApplicationFrom customerApplication) 
	{
		customerrepository.save(customerApplication);
		
	}
	
}
