package com.AceHomeLoan.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AceHomeLoan.app.ServiceI.CustomerAccountDetailsServiceI;
import com.AceHomeLoan.app.model.CustomerAccountDetails;

@RestController
public class CustomerAccountDetailsController
{
	@Autowired
	CustomerAccountDetailsServiceI cservice;
	
	
	@PostMapping(value="/AccountDetails")
	public CustomerAccountDetails saveDependent(@RequestBody CustomerAccountDetails depdetails)
	{
		
		CustomerAccountDetails account = cservice.saveAccountDetails(depdetails);
		return account;
	}
	
	
	//http://localhost:8888/DependentDetails
	@GetMapping(value="/AccountDetails")
	public List<CustomerAccountDetails> getAllEnquiry()
	{
		List<CustomerAccountDetails> details = cservice.getAllAccountDetails();
		return details;
	}
	
	@DeleteMapping(value="AccountDetails/{accountId}")
	public String deleteAccountDetails(@PathVariable Long accountId)
	{
		cservice.deleteAccountDetails(accountId);
		return "Data Delete Succefully";
	}
	

}
