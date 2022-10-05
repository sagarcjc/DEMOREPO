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

import com.AceHomeLoan.app.ServiceI.DependentDetailsServiceI;
import com.AceHomeLoan.app.model.DependentDetails;
import com.AceHomeLoan.app.model.GuarantorDetails;

@CrossOrigin("*")
@RestController
public class DependentDetailsController 
{
	@Autowired
	DependentDetailsServiceI dservice;
	
	@PostMapping(value="/DependentDetails")
	public DependentDetails saveDependent(@RequestBody DependentDetails depdetails)
	{
		
		DependentDetails guarenter = dservice.saveDependentDetails(depdetails);
		return guarenter;
	}
	
	
	//http://localhost:8888/DependentDetails
	@GetMapping(value="/DependentDetails")
	public List<DependentDetails> getAllEnquiry()
	{
		List<DependentDetails> details = dservice.getAllDependentDetails();
		return details;
	}
	
	@DeleteMapping(value="DependentDetails/{dependantId}")
	public String deleteGuarenter(@PathVariable Long dependantId)
	{
		dservice.deleteDependentDetails(dependantId);
		return "Data Delete Succefully";
	}
	

}
