package com.AceHomeLoan.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AceHomeLoan.app.ServiceI.CustomerAccountDetailsServiceI;
import com.AceHomeLoan.app.model.CustomerAccountDetails;
import com.AceHomeLoan.app.repository.CustomerAccountDetailsRepository;

@Service
public class CustomerAccountDetailsServiceImpl implements CustomerAccountDetailsServiceI
{
	@Autowired
	CustomerAccountDetailsRepository repository;

	@Override
	public CustomerAccountDetails saveAccountDetails(CustomerAccountDetails depdetails) {
		
		return repository.save(depdetails);
	}

	@Override
	public List<CustomerAccountDetails> getAllAccountDetails() {
		List<CustomerAccountDetails> list =  repository.findAll();
		return list;
	}

	@Override
	public void deleteAccountDetails(Long accountId) 
	{
		repository.deleteById(accountId);
		
	}
	

}
