package com.AceHomeLoan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AceHomeLoan.app.model.Cibil;

@Repository
public interface Cibilrepository extends JpaRepository<Cibil, Long>
{
	
}
