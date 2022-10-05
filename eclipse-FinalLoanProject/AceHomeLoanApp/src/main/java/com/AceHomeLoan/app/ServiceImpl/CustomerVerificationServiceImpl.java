package com.AceHomeLoan.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AceHomeLoan.app.ServiceI.CustomerVerificationServiceI;
import com.AceHomeLoan.app.model.CustomerVerification;
import com.AceHomeLoan.app.repository.CustomerVerificationRepository;

@Service
public class CustomerVerificationServiceImpl implements CustomerVerificationServiceI
{
	@Autowired
	CustomerVerificationRepository repository;

	@Override
	public CustomerVerification saveCVerification(CustomerVerification verificationId) {
		
		return repository.save(verificationId);
	}

	@Override
	public List<CustomerVerification> getAllCverification() {
		
		return repository.findAll();
	}

	@Override
	public void deleteDependentDetails(Long verificationId) {
		repository.deleteById(verificationId);
		
	}
}
