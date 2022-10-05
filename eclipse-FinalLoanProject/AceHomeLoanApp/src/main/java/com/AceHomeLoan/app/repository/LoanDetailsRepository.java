package com.AceHomeLoan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AceHomeLoan.app.model.LoanDetails;

@Repository
public interface LoanDetailsRepository  extends JpaRepository<LoanDetails, Long>
{

}
