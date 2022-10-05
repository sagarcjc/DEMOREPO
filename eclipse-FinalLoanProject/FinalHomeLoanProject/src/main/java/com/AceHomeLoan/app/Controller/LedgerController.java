package com.AceHomeLoan.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AceHomeLoan.app.ServiceI.LedgerServiceI;

import com.AceHomeLoan.app.model.Ledger;

@CrossOrigin("*")
@RestController
public class LedgerController 
{
	@Autowired
	LedgerServiceI ledgerservice;
	
	@PostMapping(value="/Ledger")
	public Ledger saveLedger(@RequestBody Ledger gdetails)
	{
		
		Ledger savel = ledgerservice.saveLedger(gdetails);
		return savel;
	}
	
	
	//http://localhost:8888/Ledger
	@GetMapping(value="/Ledger")
	public List<Ledger> getAllLedgerdata()
	{
		List<Ledger> list = ledgerservice.getAllLedger();
		return list;
	}
	
	@DeleteMapping(value="Ledger/{ledgerId}")
	public String deleteGuarenter(@PathVariable Long  ledgerId)
	{
		ledgerservice.deleteLedger(ledgerId);
		return "Data Delete Succefully";
	}
	

}
