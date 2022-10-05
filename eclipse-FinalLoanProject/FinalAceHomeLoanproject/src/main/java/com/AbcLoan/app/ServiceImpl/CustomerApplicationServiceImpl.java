package com.AbcLoan.app.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AbcLoan.app.Repository.CustomerApplicationRepository;
import com.AbcLoan.app.model.CustomerApplicationFrom;
import com.AbcLoan.app.serviceI.CustomerApplicationServiceI;


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
