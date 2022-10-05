package com.AceHomeLoan.app.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AceHomeLoan.app.ServiceI.PreviousLoanServiceI;
import com.AceHomeLoan.app.model.PreviousLoanBank;
import com.AceHomeLoan.app.repository.PreviousLoanRepository;

@Service
public class PreviousLoanServiceImpl implements PreviousLoanServiceI 
{
	@Autowired
	PreviousLoanRepository loanrepository;

	@Override
	public void savePreviousLoan(PreviousLoanBank previousloan) {
	 
		loanrepository.save(previousloan);
	
	}

	@Override
	public List<PreviousLoanBank> getAllDetails() {
		List<PreviousLoanBank> listdetails=loanrepository.findAll();
		return listdetails ;
	}

	@Override
	public void updateData(PreviousLoanBank previousloan, Long branchId) {
	    
		previousloan.setBranchId(branchId);
		loanrepository.save(previousloan);
		
	}

	@Override
	public void deleteData(Long branchId) {
	
	loanrepository.deleteById(branchId);;
	
		
	}

	@Override
	public Optional<PreviousLoanBank> getDetails(Long branchId) {
		Optional<PreviousLoanBank> p=loanrepository.findById(branchId);
		return p;
	}

}
