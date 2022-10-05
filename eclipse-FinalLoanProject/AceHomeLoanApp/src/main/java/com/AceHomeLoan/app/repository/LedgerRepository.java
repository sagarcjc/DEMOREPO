package com.AceHomeLoan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AceHomeLoan.app.model.Ledger;

@Repository
public interface LedgerRepository extends JpaRepository<Ledger, Long>
{
	

}
