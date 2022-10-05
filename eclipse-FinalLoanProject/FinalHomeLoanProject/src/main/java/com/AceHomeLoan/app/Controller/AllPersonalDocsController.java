package com.AceHomeLoan.app.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.AceHomeLoan.app.ServiceI.AllPersonalDocsServiceI;
import com.AceHomeLoan.app.model.AllPersonalDocs;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin("*")
@RestController
@Slf4j
public class AllPersonalDocsController 
{
	@Autowired
	AllPersonalDocsServiceI pdocsservice;
	
	@PostMapping(value="/document" , consumes = MediaType.MULTIPART_FORM_DATA_VALUE )
	public ResponseEntity<String> saveDocs(@RequestPart ("adrProof") MultipartFile adrProof, @RequestPart ("panCard") MultipartFile pancard
			, @RequestPart ("itr") MultipartFile itr, @RequestPart ("adhar") MultipartFile adhar, @RequestPart ("photo")
	MultipartFile photo, @RequestPart ("signature")MultipartFile signature, @RequestPart ("thumb") MultipartFile thumb,
			@RequestPart ("bankChecque")MultipartFile bankCheque, @RequestPart ("salarySlip") MultipartFile salarySlip ,
			@RequestPart ("document") String document) throws JsonMappingException, JsonProcessingException{
		
			ObjectMapper om =new ObjectMapper();
			AllPersonalDocs docs= om.readValue(document, AllPersonalDocs.class);
			
				log.info("document id"+ docs.getDocumentId());
				
		
		
		try {
			docs.setAdrProof(adrProof.getBytes());
			docs.setPanCard(pancard.getBytes());
			docs.setItr(itr.getBytes());
			docs.setAdhar(adhar.getBytes());
			docs.setPhoto(photo.getBytes());
			docs.setSignature(signature.getBytes());
			docs.setThumb(thumb.getBytes());
			docs.setBankChecque(bankCheque.getBytes());
			docs.setSalarySlip(salarySlip.getBytes());
	
		}
		catch (Exception e) 
		{
			log.error("error in code");
		}
		
		AllPersonalDocs documents= pdocsservice.saveDocuments(docs);
		
		return new ResponseEntity("Documents added successfully", HttpStatus.CREATED);
	}
	
	@GetMapping("/document")
	public List<AllPersonalDocs> getDocuments(){
		
		List <AllPersonalDocs> list= pdocsservice.getDocument();
		return  list;
	}
	
	@DeleteMapping("/document/{documentId}")
	public String deleteData(@PathVariable Long documentId)
	{
		pdocsservice.deleteDocument(documentId);
		
		return "Document Delete Succefully";
		}
	

}
