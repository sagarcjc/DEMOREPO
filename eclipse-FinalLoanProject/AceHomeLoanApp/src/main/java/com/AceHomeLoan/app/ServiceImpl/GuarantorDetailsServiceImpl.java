package com.AceHomeLoan.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AceHomeLoan.app.ServiceI.GuarantorDetailsServiceI;
import com.AceHomeLoan.app.model.GuarantorDetails;
import com.AceHomeLoan.app.repository.GuarantorDetailsRepository;

@Service
public class GuarantorDetailsServiceImpl implements GuarantorDetailsServiceI
{
	@Autowired
	GuarantorDetailsRepository grepository;

	@Override
	public GuarantorDetails saveGuarantorDetails(GuarantorDetails gdetails) {
		
		return grepository.save(gdetails);
	}

	@Override
	public List<GuarantorDetails> getAllguarenter()
	{
		
		return grepository.findAll();
	}

	@Override
	public void deleteGuarenter(Integer guarantorId) {
		grepository.deleteById(guarantorId);
		
	}	

}
