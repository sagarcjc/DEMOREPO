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

import com.AceHomeLoan.app.ServiceI.LoanDisbursementServiceI;
import com.AceHomeLoan.app.model.GuarantorDetails;
import com.AceHomeLoan.app.model.LoanDisbursement;

@CrossOrigin("*")
@RestController
public class LoanDisbursementController 
{
	@Autowired
	LoanDisbursementServiceI ldservice;
	
	//   http://localhost:8888/LoanDisbursement
	@PostMapping(value="/LoanDisbursement")
	public LoanDisbursement saveLoanDisbursement(@RequestBody LoanDisbursement agreementid)
	{
		
		LoanDisbursement ldetails = ldservice.saveLoanDisbursement(agreementid);
		return ldetails;
	}
	
	
	//   http://localhost:8888/LoanDisbursement
	@GetMapping(value="/LoanDisbursement")
	public List<LoanDisbursement> getAllEnquiry()
	{
		List<LoanDisbursement> details = ldservice.getAllLoanDisbursement();
		return details;
	}
	
	@DeleteMapping(value="LoanDisbursement/{agreementid}")
	public String deleteGuarenter(@PathVariable Integer agreementid)
	{
		ldservice.deleteLoanDisbursement(agreementid);
		return "Data Delete Succefully";
	}
}
