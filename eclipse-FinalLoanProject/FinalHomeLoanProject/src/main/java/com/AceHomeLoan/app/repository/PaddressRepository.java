package com.AceHomeLoan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AceHomeLoan.app.model.PropertyAddress;

@Repository
public interface PaddressRepository extends JpaRepository<PropertyAddress, Long>
{
	

}
