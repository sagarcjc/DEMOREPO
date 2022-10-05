package com.AceHomeLoan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.AceHomeLoan.app.model.LoanDisbursement;

@RestController
public interface LoanDisbursementRepository extends JpaRepository<LoanDisbursement , Integer>
{

}
