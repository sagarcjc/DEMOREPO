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

import com.AceHomeLoan.app.ServiceI.PreviousLoanServiceI;
import com.AceHomeLoan.app.model.PreviousLoanBank;

@RestController
@CrossOrigin("*")
public class PreviousLoanController {
	@Autowired
	PreviousLoanServiceI loanservice;
	
	@PostMapping(value="/previousloanbank")
	public String savePreviousLoan(@RequestBody PreviousLoanBank previousloan)
	{
		
		 loanservice.savePreviousLoan(previousloan);
			return "Data Saved Successfully";
	}
	
	@GetMapping(value="/previousloanbank")
	public List<PreviousLoanBank> getAllDetails()
	{
		List<PreviousLoanBank> listdetail=loanservice.getAllDetails();
		return listdetail;
	}
	
	@PutMapping(value="/previousloanbank/{branchId}")
	public String updateData(@RequestBody PreviousLoanBank previousloan, @PathVariable ("branchId") Long branchId)
	{
		loanservice.updateData(previousloan, branchId);
		return "Data Updated Successfully";
	}
	
	@DeleteMapping(value="/previousloanbank/{branchId}")
	public String deleteData(@PathVariable ("branchId") Long branchId)
	{
		
		loanservice.deleteData(branchId);
		return "Data Deleted Successfully";
	}
	
	@GetMapping(value="/previousloanbank/{branchId}")
	public Optional<PreviousLoanBank> getDetails(@PathVariable Long branchId)
	{
		 Optional<PreviousLoanBank> single= loanservice.getDetails(branchId); 
		
		return single;
	}
	

}
