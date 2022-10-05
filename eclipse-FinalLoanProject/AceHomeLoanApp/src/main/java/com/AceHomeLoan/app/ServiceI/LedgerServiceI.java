package com.AceHomeLoan.app.ServiceI;

import java.util.List;

import com.AceHomeLoan.app.model.Ledger;

public interface LedgerServiceI 
{

	Ledger saveLedger(Ledger gdetails);

	List<Ledger> getAllLedger();

	void deleteLedger(Long ledgerId); 
	

}
