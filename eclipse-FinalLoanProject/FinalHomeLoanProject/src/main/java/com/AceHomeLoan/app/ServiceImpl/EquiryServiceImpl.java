package com.AceHomeLoan.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AceHomeLoan.app.ServiceI.EnquiryServiceI;
import com.AceHomeLoan.app.model.Enquiry;
import com.AceHomeLoan.app.repository.EnquiryRepository;



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
