package com.AceHomeLoan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AceHomeLoan.app.model.PropertyDetails;

@Repository
public interface PropertyRepository extends JpaRepository<PropertyDetails, Long>
{

}
