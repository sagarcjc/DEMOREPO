package com.AceHomeLoan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AceHomeLoan.app.model.DependentDetails;

@Repository
public interface DependentDetailsRepository extends JpaRepository<DependentDetails, Long>
{
  
}
