package com.AceHomeLoan.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AceHomeLoan.app.ServiceI.DependentDetailsServiceI;
import com.AceHomeLoan.app.model.DependentDetails;
import com.AceHomeLoan.app.repository.DependentDetailsRepository;

@Service
public class DependentDetailsServiceImpl implements DependentDetailsServiceI
{
	@Autowired
	DependentDetailsRepository drepository;

	@Override
	public DependentDetails saveDependentDetails(DependentDetails depdetails) 
	{
		return drepository.save(depdetails);
	}

	@Override
	public List<DependentDetails> getAllDependentDetails() {
		 List<DependentDetails> list = drepository.findAll();
		return list;
	}

	@Override
	public void deleteDependentDetails(Long dependantId) {
		
		drepository.deleteById(dependantId);
	}
}
