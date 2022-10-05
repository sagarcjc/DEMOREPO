package com.AceHomeLoan.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.AceHomeLoan.app.ServiceI.EnquiryServiceI;
import com.AceHomeLoan.app.model.Enquiry;

public class EnquiryController 
{
	@Autowired
	EnquiryServiceI enquiryService;
	
	//http://localhost:8888/enquiry
	@PostMapping(value="/enquiry")
	public String saveEnquiry(@RequestBody Enquiry enquiry)
	{
		
		enquiryService.saveEnquiry(enquiry);
		return "Data Save Succefully";
	}
	
	
	//http://localhost:8888/enquiry
	@GetMapping(value="/enquiry")
	public List<Enquiry> getAllEnquiry()
	{
		List<Enquiry> listenquiry = enquiryService.getAllEnquiry();
		return listenquiry;
	}
	
	

}
