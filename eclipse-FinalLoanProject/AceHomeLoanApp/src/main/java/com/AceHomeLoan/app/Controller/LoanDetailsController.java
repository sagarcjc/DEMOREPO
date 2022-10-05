package com.AceHomeLoan.app.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AceHomeLoan.app.ServiceI.LoanDetailsServiceI;
import com.AceHomeLoan.app.model.LoanDetails;

@RestController
public class LoanDetailsController {

	@Autowired
	LoanDetailsServiceI loanService;
	
	@PostMapping(value="/loandetails")
	public String saveData(@RequestBody LoanDetails loandetails)
	{
		loanService.saveLoanDetails(loandetails);
		return "Data Saved Successfully";
	}
	
	@GetMapping(value="/loandetails")
	public List<LoanDetails> getAllLoanDetails()
	{
		List<LoanDetails> list=loanService.getAllLoanDetails();
		return list;
	}
	
	@PutMapping(value="/loandetails/{loanId}")
	public String updateData(@RequestBody LoanDetails loandetails, @PathVariable ("loanId") Long loanId)
	{
		loanService.updateLoanDetails(loandetails, loanId);
		return "Data Updated Successfully";
	}
	
	@DeleteMapping(value="/loandetails/{loanId}")
	public String deleteData(@PathVariable ("loanId") Long loanId)
	{
		loanService.deleteData(loanId);
		return "Data Deleted Successfully";
	}
	
	@GetMapping(value="/loandetails/{loanId}")
	public Optional<LoanDetails> getData(@PathVariable Long loanId)
	{
			Optional<LoanDetails> o=loanService.getData(loanId);
			return o;
	}
}
