package com.AceHomeLoan.app.ServiceI;

import java.util.List;
import java.util.Optional;

import com.AceHomeLoan.app.model.LoanDetails;

public interface LoanDetailsServiceI
{
	
	void saveLoanDetails(LoanDetails loandetails);

	List<LoanDetails> getAllLoanDetails();

	void updateLoanDetails(LoanDetails loandetails, Long loanId);

	void deleteData(Long loanId);

	Optional<LoanDetails> getData(Long loanId);

}
