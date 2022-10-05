package com.AceHomeLoan.app.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AceHomeLoan.app.ServiceI.SanctionLetterServiceI;
import com.AceHomeLoan.app.model.SanctionalLetter;

@CrossOrigin("*")
@RestController
public class SanctionLetterController
{
	@Autowired
	SanctionLetterServiceI service;
	
	 @PostMapping("/sanctionalLetter")
     public SanctionalLetter saveSanctionalLetter(@RequestBody SanctionalLetter sletter)
     {
    	 SanctionalLetter letter=service.saveSanctionalLetter(sletter);
    	 return letter;
     }
     
     @GetMapping("/sanctionalLetter")
     public List<SanctionalLetter> getSanctionalLetter()
     {
    	 List<SanctionalLetter> elist=service.getSanctionalLetter();
    	 
    	 return elist;
     }
//     @PutMapping("/sanctionalLetter/{sanctionId}")
//     public SanctionalLetter updateData(@PathVariable Long sanctionId,@RequestBody SanctionalLetter sletter )
//     {
//    	 SanctionalLetter letter=service.updateData(sanctionId,sletter);
//    	 return letter;
//     }
//     
//     
//     @DeleteMapping("/sanctionalLetter/{sanctionId}")
//     public String deleteData(@PathVariable Long sanctionId)
//     {
//    	 service.deleteData(sanctionId);
//    	 return"Data Successfully Delete";
//     }
//     
//     @GetMapping("/getSingleData/{sanctionId}")
// 	public Optional<SanctionalLetter> getSingleData(@PathVariable Long sanctionId)
// 	{
//    	 Optional<SanctionalLetter> letter=service.getSingleData(sanctionId);
// 		return letter;
// 				
// 	}

}
