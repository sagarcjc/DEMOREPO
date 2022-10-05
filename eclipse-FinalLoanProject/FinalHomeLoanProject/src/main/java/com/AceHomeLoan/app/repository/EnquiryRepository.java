package com.AceHomeLoan.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AceHomeLoan.app.model.Enquiry;



@Repository
public interface EnquiryRepository extends JpaRepository<Enquiry, Long>
{
	

}
