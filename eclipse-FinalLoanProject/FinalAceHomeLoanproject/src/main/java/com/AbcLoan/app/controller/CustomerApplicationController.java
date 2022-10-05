package com.AbcLoan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.AbcLoan.app.model.AllPersonalDocs;
import com.AbcLoan.app.model.CustomerApplicationFrom;
import com.AbcLoan.app.serviceI.CustomerApplicationServiceI;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin("*")
@RestController
public class CustomerApplicationController 
{
	@Autowired
	CustomerApplicationServiceI customerservice;
	
	@PostMapping(value="customerApplicationForm" ,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String saveCustomerApplication(@RequestPart ("professionsalarySlips") MultipartFile professionsalarySlips,
			@RequestPart ("propertyProof") MultipartFile propertyProof,@RequestPart ("propertyInsurance") MultipartFile propertyInsurance,
			@RequestPart ("addressProof") MultipartFile addressProof, @RequestPart ("panCard") MultipartFile panCard
			, @RequestPart ("incomeTaxReturn") MultipartFile incomeTaxReturn,
			@RequestPart ("adharCard") MultipartFile adharCard, @RequestPart ("photo")MultipartFile photo,
			@RequestPart ("signature")MultipartFile signature, @RequestPart ("thumb") MultipartFile thumb,
			@RequestPart ("bankCheque")MultipartFile bankCheque, @RequestPart ("bankStatement") MultipartFile bankStatement ,
            @RequestPart("customerApplication") String customerApplication)
	{
		ObjectMapper om=new ObjectMapper();
		CustomerApplicationFrom customerAppl;
		try {
			customerAppl = om.readValue(customerApplication,CustomerApplicationFrom.class);
			customerAppl.getCustomerProfession().setProfessionsalarySlips(professionsalarySlips.getBytes());
			customerAppl.getMortgage().setPropertyInsurance(propertyInsurance.getBytes());
			customerAppl.getMortgage().setPropertyProof(propertyProof.getBytes());
			
				AllPersonalDocs allPersonalDocs=new AllPersonalDocs();
			
				allPersonalDocs.setAddressProof(addressProof.getBytes());
				allPersonalDocs.setPanCard(panCard.getBytes());
				allPersonalDocs.setIncomeTaxReturn(incomeTaxReturn.getBytes());
				allPersonalDocs.setAadhar(adharCard.getBytes());
				allPersonalDocs.setPhoto(photo.getBytes());
				allPersonalDocs.setSignature(signature.getBytes());
				allPersonalDocs.setThumb(thumb.getBytes());
				allPersonalDocs.setBankCheque(bankCheque.getBytes());
				allPersonalDocs.setBankStatement(bankStatement.getBytes());
				
				customerAppl.setAllPersonalDocs(allPersonalDocs);
			
			
			
			customerservice.saveCustomerApplication(customerAppl);
			
			return "data save successfully";
			
		}catch (Exception e) {
			
		e.printStackTrace();
		}
		
		return "save customer form";
	}
}
