package com.AbcLoan.app.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AbcLoan.app.model.Enquiry;

@Repository
public interface EnquiryRepository extends JpaRepository<Enquiry, Long>
{
	

}
