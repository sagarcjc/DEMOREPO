package com.AceHomeLoan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AceHomeLoan.app.model.Profession;

@Repository
public interface ProfessionRepository extends  JpaRepository<Profession, Long> 
{
	
 

}
