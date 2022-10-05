package com.AceHomeLoan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AceHomeLoan.app.model.CustomerApplicationFrom;

@Repository
public interface CustomerApplicationRepository extends JpaRepository<CustomerApplicationFrom, Long>
{

}
