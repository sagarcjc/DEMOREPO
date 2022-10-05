package com.AceHomeLoan.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AceHomeLoan.app.ServiceI.CustomerDetailsServiceI;
import com.AceHomeLoan.app.model.CustomerDetails;
import com.AceHomeLoan.app.model.DependentDetails;

@CrossOrigin("*")
@RestController
public class CustomerDetailsController 
{
	@Autowired
	CustomerDetailsServiceI cdservice;
	
	@PostMapping(value="/CustomerDetails")
	public CustomerDetails saveCustomerDetails(@RequestBody CustomerDetails cusdetails)
	{
		
		CustomerDetails customer = cdservice.saveCustomerDetails(cusdetails);
		return customer;
	}
	
	
	//http://localhost:8888/DependentDetails
	@GetMapping(value="/CustomerDetails")
	public List<CustomerDetails> getAllCustomerDetails()
	{
		List<CustomerDetails> details = cdservice.getAllCustomerDetails();
		return details;
	}
	
	@DeleteMapping(value="CustomerDetails/{customerId}")
	public String deleteCustomerDetails(@PathVariable Long customerId)
	{
		cdservice.deleteCustomerDetails(customerId);
		return "Data Delete Succefully";
	}
	
}
