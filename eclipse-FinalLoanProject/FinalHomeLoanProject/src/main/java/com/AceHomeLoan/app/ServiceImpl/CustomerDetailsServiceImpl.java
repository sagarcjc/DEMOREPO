package com.AceHomeLoan.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AceHomeLoan.app.ServiceI.CustomerDetailsServiceI;
import com.AceHomeLoan.app.model.CustomerDetails;
import com.AceHomeLoan.app.repository.CustomerDetailsRepository;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsServiceI
{
	@Autowired
	CustomerDetailsRepository cdrpository;

	@Override
	public CustomerDetails saveCustomerDetails(CustomerDetails cusdetails) 
	{
		
		return cdrpository.save(cusdetails);
	}

	@Override
	public List<CustomerDetails> getAllCustomerDetails() {
		
		return cdrpository.findAll();
	}

	@Override
	public void deleteCustomerDetails(Long customerId) {
		cdrpository.deleteById(customerId);
		
	}
	

}
