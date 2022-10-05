package com.AceHomeLoan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AceHomeLoan.app.model.CustomerAccountDetails;

@Repository
public interface CustomerAccountDetailsRepository extends JpaRepository<CustomerAccountDetails, Long>
{

}
