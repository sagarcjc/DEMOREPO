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

import com.AceHomeLoan.app.ServiceI.CustomerVerificationServiceI;
import com.AceHomeLoan.app.model.CustomerVerification;


@CrossOrigin("*")
@RestController
public class CustomerVerificationController 
{
	@Autowired
	CustomerVerificationServiceI service;
	
	@PostMapping(value="/CustomerVerification")
	public CustomerVerification savecverification(@RequestBody CustomerVerification verificationId)
	{
		
		CustomerVerification as = service.saveCVerification(verificationId);
		return as;
	}
	
	
	//http://localhost:8888/CustomerVerification
	@GetMapping(value="/CustomerVerification")
	public List<CustomerVerification> getAllCverification()
	{
		List<CustomerVerification> details = service.getAllCverification();
		return details;
	}
	
	@DeleteMapping(value="CustomerVerification/{verificationId}")
	public String deleteGuarenter(@PathVariable Long verificationId)
	{
		service.deleteDependentDetails(verificationId);
		return "Data Delete Succefully";
	}
	

}
