package com.AceHomeLoan.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.AceHomeLoan.app.ServiceI.CustomerApplicationServiceI;
import com.AceHomeLoan.app.model.AllPersonalDocs;
import com.AceHomeLoan.app.model.CustomerApplicationFrom;
import com.AceHomeLoan.app.model.Profession;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin("*")
@RestController
public class CustomerApplicationController 
{
	@Autowired
	CustomerApplicationServiceI customerservice;
	
	@PostMapping(value="CustomerApplicationForm" ,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String saveCustomerApplication(@RequestPart ("professionsalarySlips") MultipartFile file,
			@RequestPart ("propertyProof") MultipartFile file1,
			@RequestPart ("pInscurance") MultipartFile file2,
			@RequestPart ("propertyDocs") MultipartFile file3,
			
			@RequestPart ("adrProof") MultipartFile adrProof,
			@RequestPart ("panCard") MultipartFile pancard,
		    @RequestPart ("itr") MultipartFile itr, 
		    @RequestPart ("adhar") MultipartFile adhar, 
		    @RequestPart ("photo") MultipartFile photo,
	        @RequestPart ("signature") MultipartFile signature, 
	        @RequestPart ("thumb") MultipartFile thumb,
			@RequestPart ("bankChecque")MultipartFile bankCheque,
			@RequestPart ("salarySlip") MultipartFile salarySlip ,
			@RequestPart("customerApplication") String customerApplication)
	{
		ObjectMapper om=new ObjectMapper();
		CustomerApplicationFrom customerAppl;
		try {
			customerAppl = om.readValue(customerApplication,CustomerApplicationFrom.class);
			
			customerAppl.getCustomerProfession().setProfessionsalarySlips(file.getBytes());
			customerAppl.getMortgage().setPInscurance(file2.getBytes());
			customerAppl.getMortgage().setPropertyProof(file1.getBytes());
		    customerAppl.getPropertydetails().setPropertyDocs(file3.getBytes());
		    
		    AllPersonalDocs allPersonalDocs=new AllPersonalDocs();
		    
		    allPersonalDocs.setAdrProof(adrProof.getBytes());
		    allPersonalDocs.setPanCard(pancard.getBytes());
		    allPersonalDocs.setItr(itr.getBytes());
		    allPersonalDocs.setAdhar(adhar.getBytes());
		    allPersonalDocs.setPhoto(photo.getBytes());
		    allPersonalDocs.setSignature(signature.getBytes());
		    allPersonalDocs.setBankChecque(bankCheque.getBytes());
		    allPersonalDocs.setSalarySlip(salarySlip.getBytes());
		    
		   //customerAppl.setAllPersonalDocs(allPersonalDocs);
			
		    customerservice.saveCustomerApplication(customerAppl);
		    
			customerservice.saveCustomerApplication(customerAppl);
			return "data save successfully";
			
		}catch (Exception e) {
			
		e.printStackTrace();
		}
		
		return "save customer form";
	}
}
