package com.AceHomeLoan.app.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AceHomeLoan.app.ServiceI.LoanDetailsServiceI;
import com.AceHomeLoan.app.model.LoanDetails;
import com.AceHomeLoan.app.repository.LoanDetailsRepository;

@Service
public class LoanDetailsServiceImpl implements LoanDetailsServiceI
{
	@Autowired
	LoanDetailsRepository loanRepository;
	
	@Override
	public void saveLoanDetails(LoanDetails loandetails) {
		
		loanRepository.save(loandetails);
	}

	@Override
	public List<LoanDetails> getAllLoanDetails() {
		List<LoanDetails> list=loanRepository.findAll();
		return list;
	}

	@Override
	public void updateLoanDetails(LoanDetails loandetails, Long loanId) {
		loandetails.setLoanId(loanId);
		loanRepository.save(loandetails);
		
	}

	@Override
	public void deleteData(Long loanId) {
	   loanRepository.deleteById(loanId);
		
	}

	@Override
	public Optional<LoanDetails> getData(Long loanId) {
		Optional<LoanDetails> o=loanRepository.findById(loanId);
		return o;
	}

	
	
}
