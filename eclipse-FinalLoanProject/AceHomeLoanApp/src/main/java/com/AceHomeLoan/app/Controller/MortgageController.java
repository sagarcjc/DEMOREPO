package com.AceHomeLoan.app.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.AceHomeLoan.app.ServiceI.MortgageServiceI;
import com.AceHomeLoan.app.model.Mortgage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin("*")
@RestController
public class MortgageController
{
	@Autowired
	MortgageServiceI mservice;
	
	//http://localhost:8888/mortgage
	@PostMapping(value="/mortgage" ,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String saveMortagedata(@RequestPart ("propertyProof") MultipartFile file,@RequestPart ("pInscurance") MultipartFile file2,@RequestPart ("cust") String cust) throws JsonMappingException, JsonProcessingException
	
	{
		ObjectMapper om=new ObjectMapper();
		
		Mortgage mdoc = om.readValue(cust, Mortgage.class);
		try {
			 mdoc.setPropertyProof(file.getBytes());
			mdoc.setPInscurance(file2.getBytes());
			
			Mortgage  mdata  = mservice.saveMortagedata(mdoc);
			return "saved successfully";
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return null;
		}
		}
	
	//http://localhost:8888/mortgage
	@GetMapping(value="/mortgage")
	public List<Mortgage> getMortgage()
	{
		List<Mortgage> list = mservice.getMortgage();
		return list;
	}

}
