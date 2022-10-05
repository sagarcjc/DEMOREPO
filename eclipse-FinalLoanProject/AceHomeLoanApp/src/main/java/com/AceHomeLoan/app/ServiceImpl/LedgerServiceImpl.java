package com.AceHomeLoan.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AceHomeLoan.app.ServiceI.LedgerServiceI;
import com.AceHomeLoan.app.model.Ledger;
import com.AceHomeLoan.app.repository.LedgerRepository;

@Service
public class LedgerServiceImpl implements LedgerServiceI
{
	@Autowired
	LedgerRepository ledgerrepository;

	@Override
	public Ledger saveLedger(Ledger gdetails) {
	
		return ledgerrepository.save(gdetails);
	}

	@Override
	public List<Ledger> getAllLedger() {
	
		return ledgerrepository.findAll();
	}

	@Override
	public void deleteLedger(Long ledgerId) {
		
		ledgerrepository.deleteById(ledgerId);
	}

}
