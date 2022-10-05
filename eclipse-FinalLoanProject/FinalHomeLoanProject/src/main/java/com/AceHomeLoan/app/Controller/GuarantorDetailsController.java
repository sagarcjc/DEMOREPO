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

import com.AceHomeLoan.app.ServiceI.GuarantorDetailsServiceI;
import com.AceHomeLoan.app.model.GuarantorDetails;

@CrossOrigin("*")
@RestController
public class GuarantorDetailsController 
{
	@Autowired
	GuarantorDetailsServiceI gds;
	
	@PostMapping(value="/GuarantorDetails")
	public GuarantorDetails saveEnquiry(@RequestBody GuarantorDetails gdetails)
	{
		
		GuarantorDetails guarenter = gds.saveGuarantorDetails(gdetails);
		return guarenter;
	}
	
	
	//http://localhost:8888/GuarantorDetails
	@GetMapping(value="/GuarantorDetails")
	public List<GuarantorDetails> getAllEnquiry()
	{
		List<GuarantorDetails> details = gds.getAllguarenter();
		return details;
	}
	
	@DeleteMapping(value="GuarantorDetails/{guarantorId}")
	public String deleteGuarenter(@PathVariable Integer guarantorId)
	{
		gds.deleteGuarenter(guarantorId);
		return "Data Delete Succefully";
	}
	
	

}
