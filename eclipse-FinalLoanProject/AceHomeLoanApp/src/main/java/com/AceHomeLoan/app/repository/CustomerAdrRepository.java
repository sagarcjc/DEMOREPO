package com.AceHomeLoan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AceHomeLoan.app.model.CustomerAddress;

@Repository
public interface CustomerAdrRepository extends JpaRepository<CustomerAddress, Long>
{

}
