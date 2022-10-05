package com.AbcLoan.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.AbcLoan.app.model.AllPersonalDocument;
import com.AbcLoan.app.serviceI.FileServiceI;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
@CrossOrigin("*")
@RestController
@Slf4j
public class FileCotroller {
	@Autowired
	FileServiceI fsi;
	
	@PostMapping(value="/saveDocs" , consumes = MediaType.MULTIPART_FORM_DATA_VALUE )
	public ResponseEntity<String> saveDocs(@RequestPart ("addressProof") MultipartFile addressProof, @RequestPart ("pancard") MultipartFile pancard
			, @RequestPart ("incomeTaxReturn") MultipartFile incomeTaxReturn, @RequestPart ("adharCard") MultipartFile adharCard, @RequestPart ("photo")
	MultipartFile photo, @RequestPart ("signature")MultipartFile signature, @RequestPart ("thumb") MultipartFile thumb,
			@RequestPart ("bankCheque")MultipartFile bankCheque, @RequestPart ("salarySlip") MultipartFile salarySlip ,
			@RequestPart ("document") String document) throws JsonMappingException, JsonProcessingException{
		
			ObjectMapper om =new ObjectMapper();
			AllPersonalDocument docs= om.readValue(document, AllPersonalDocument.class);
			
				log.info("document id"+ docs.getDocumentId());
				
		
		
		try {
			docs.setAddressproof(addressProof.getBytes());
			docs.setPancard(pancard.getBytes());
			docs.setIncomeTaxReturn(incomeTaxReturn.getBytes());
			docs.setAdharCard(adharCard.getBytes());
			docs.setPhoto(photo.getBytes());
			docs.setSignature(signature.getBytes());
			docs.setThumb(thumb.getBytes());
			docs.setBankCheque(bankCheque.getBytes());
			docs.setSalarySlip(salarySlip.getBytes());
	
		}catch (Exception e) {
			log.error("error in code");
		}
		
		AllPersonalDocument documents= fsi.saveDocuments(docs);
		
		return new ResponseEntity("Documents added successfully", HttpStatus.CREATED);
	}
	
	@GetMapping("/getDocuments")
	public List<AllPersonalDocument> getDocuments(){
		
		List <AllPersonalDocument> list= fsi.getDocument();
		return  list;
	}

}
