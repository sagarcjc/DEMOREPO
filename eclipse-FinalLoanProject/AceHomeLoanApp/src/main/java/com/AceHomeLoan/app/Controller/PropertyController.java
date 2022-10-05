package com.AceHomeLoan.app.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.AceHomeLoan.app.ServiceI.PropertyServiceI;
import com.AceHomeLoan.app.model.Mortgage;
import com.AceHomeLoan.app.model.PropertyAddress;
import com.AceHomeLoan.app.model.PropertyDetails;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin("*")
@RestController
public class PropertyController
{
	@Autowired
	PropertyServiceI prservice;
	//http://localhost:8888/property
	@PostMapping(value="/property" ,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String saveMortagedata(@RequestPart ("propertyDocs") MultipartFile file,@RequestPart ("cust") String cust) throws JsonMappingException, JsonProcessingException
	
	{
		ObjectMapper om=new ObjectMapper();
		
		PropertyDetails ProDetails = om.readValue(cust, PropertyDetails.class);
//		PropertyAddress proadr= om.read
//		ProDetails=om.readValue("propertyAddress", PropertyDetails.class);
		try {
			System.out.println(ProDetails);
			ProDetails.setPropertyDocs(file.getBytes());
		
			
			 prservice.savePropertyDetails(ProDetails);
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return "saved successfully";
		}
	
	//http://localhost:8888/property
	@GetMapping(value="/property")
	public List<PropertyDetails> getPropertyDetails()
	{
		List<PropertyDetails> pdetails = prservice.getPropertyDetails();
		return pdetails;
	}
}
