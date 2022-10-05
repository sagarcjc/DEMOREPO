package com.AceHomeLoan.app.ServiceI;

import java.util.List;
import java.util.Optional;

import com.AceHomeLoan.app.model.PreviousLoanBank;

public interface PreviousLoanServiceI {
	void savePreviousLoan(PreviousLoanBank previousloan);

	List<PreviousLoanBank> getAllDetails();

	void updateData(PreviousLoanBank previousloan, Long branchId);

	void deleteData(Long branchId);

	Optional<PreviousLoanBank> getDetails(Long branchId);
}
