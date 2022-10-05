package com.AceHomeLoan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AceHomeLoan.app.model.PreviousLoanBank;

@Repository
public interface PreviousLoanRepository extends JpaRepository<PreviousLoanBank, Long>
{

}
