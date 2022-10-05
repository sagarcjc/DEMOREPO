package com.AceHomeLoan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AceHomeLoan.app.model.Mortgage;

@Repository
public interface MortgageRepository extends JpaRepository<Mortgage, Long>
{

}
