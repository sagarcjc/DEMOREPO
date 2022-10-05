package com.AceHomeLoan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AceHomeLoan.app.model.GuarantorDetails;

@Repository
public interface GuarantorDetailsRepository extends JpaRepository<GuarantorDetails, Integer>
{

}
