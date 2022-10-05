package com.AbcLoan.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AbcLoan.app.Repository.EnquiryRepository;
import com.AbcLoan.app.model.Enquiry;
import com.AbcLoan.app.serviceI.EnquiryServiceI;

@Service
public class EquiryServiceImpl implements EnquiryServiceI
{
	@Autowired
	EnquiryRepository repository;

	@Override
	public List<Enquiry> getAllEnquiry() 
	{
		List<Enquiry> listenquiry	 = repository.findAll();
		return listenquiry;
	}

	@Override
	public void saveEnquiry(Enquiry enquiry) 
	{
	   repository.save(enquiry);
		
	   
	}

	
}
