package com.AceHomeLoan.app.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.AceHomeLoan.app.ServiceI.ProfessionServiceI;
import com.AceHomeLoan.app.model.Profession;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ProfessionController {
	@Autowired
	ProfessionServiceI psi;
	
	@PostMapping(value="/profession",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String saveProfessionService(
    		                             @RequestPart ("professionsalarySlips") MultipartFile file,
    		                             @RequestPart("profession") String profession
    		                             ) throws IOException
	{
		ObjectMapper om=new ObjectMapper();
		Profession p;
		try {
			p = om.readValue(profession,Profession.class);
			p.setProfessionsalarySlips(file.getBytes());
			psi.saveProfession(p);
			return "data save successfully";
			
		}
		catch (JsonMappingException e) 
		{
			
			e.printStackTrace();
		} 
		catch (JsonProcessingException e) 
		{
			
			e.printStackTrace();
		}
		
	return null;
		
	}
	@GetMapping(value="/profession")
	public List<Profession> getAllProfession()
	{
		List<Profession> listprofession =psi.getAllProfession();
		return listprofession;
		
	}
	@GetMapping("/getSingleData/{ProfessionId}")
	public Profession getSingleData(@PathVariable Long ProfessionId)
	{
		Profession psi1=psi.getSingleData(ProfessionId);
		return psi1;
	}
	
	@PutMapping("/updateData/{ProfessionId}")
	public Profession updateData(@PathVariable Long ProfessionId , @RequestBody Profession p )
	{
	
		Profession psi2= psi.updateData(p);
		return psi2;
		
	}
	
	@DeleteMapping("/deleteData/{ProfessionId}")
	public String deleteData(@PathVariable Long ProfessionId)
	{
		psi.deleteData(ProfessionId);
		return "professional Data Successfully return";
	}
	

}
