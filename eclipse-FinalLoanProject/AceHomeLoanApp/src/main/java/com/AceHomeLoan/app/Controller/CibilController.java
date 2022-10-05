package com.AceHomeLoan.app.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AceHomeLoan.app.ServiceI.cibilInterface;
import com.AceHomeLoan.app.model.Cibil;

@RestController
public class CibilController 
{
	@Autowired
	cibilInterface cibilI;
	
	@PostMapping(value="/cibil")
	public Cibil saveCibil(@RequestBody Cibil cibilscore)
	{
		Cibil score =cibilI.saveCibil(cibilscore);
		return score;
	}
	@GetMapping(value="/cibil/{cibilId}")
	 public Optional<Cibil> getSingleData(@PathVariable("cibilId") Long  cibilId)
	 {
		 Optional<Cibil> single =cibilI.getSingleData(cibilId);
			return single;
	 }
	

}
