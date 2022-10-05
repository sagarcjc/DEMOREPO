package com.AceHomeLoan.app.ServiceI;

import java.util.List;

import com.AceHomeLoan.app.model.LoanDisbursement;

public interface LoanDisbursementServiceI {

	LoanDisbursement saveLoanDisbursement(LoanDisbursement agreementid);

	List<LoanDisbursement> getAllLoanDisbursement();

	void deleteLoanDisbursement(Integer agreementid);

}
