package com.AceHomeLoan.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AceHomeLoan.app.ServiceI.LoanDisbursementServiceI;
import com.AceHomeLoan.app.model.LoanDisbursement;
import com.AceHomeLoan.app.repository.LoanDisbursementRepository;

@Service
public class LoanDisbursementServiceImpl implements LoanDisbursementServiceI
{
	@Autowired
	LoanDisbursementRepository ldrepository;

	@Override
	public LoanDisbursement saveLoanDisbursement(LoanDisbursement agreementid) {
		
		return ldrepository.save(agreementid) ;
	}

	@Override
	public List<LoanDisbursement> getAllLoanDisbursement() {
		List<LoanDisbursement> list = ldrepository.findAll();
		return list;
	}

	@Override
	public void deleteLoanDisbursement(Integer agreementid) {
		ldrepository.deleteById(agreementid);
		
	}
}
