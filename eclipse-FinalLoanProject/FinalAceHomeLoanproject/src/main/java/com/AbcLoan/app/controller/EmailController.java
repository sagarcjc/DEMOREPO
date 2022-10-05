package com.AbcLoan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.AbcLoan.app.model.EmailSender;
import com.AbcLoan.app.serviceI.EmailServiceI;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@CrossOrigin("*")
@RestController
public class EmailController 
{
	@Autowired
	EmailServiceI sevice;
	
	
	String fromEmail;
	
	
	
	@PostMapping(value = "/mailsanctionletter", consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public String mailSanctionLetter(@RequestPart("santionLetter")MultipartFile santionLetter,
			@RequestPart("mail")String mail) throws JsonMappingException, JsonProcessingException
	{
		
		
			ObjectMapper om = new ObjectMapper();
		
			EmailSender m = om.readValue(mail, EmailSender.class);
		
		
		       m.setFromEmail(fromEmail);
		
		try {
			   
			sevice.mailSanctionLetter(m,santionLetter);
			
		} catch (Exception e2) {
			return "Email Cannot Be Send";
		}
		return "Email Send Succefully";
	}
	

}
