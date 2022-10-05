package com.AceHomeLoan.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AceHomeLoan.app.ServiceI.pAddressServiceI;
import com.AceHomeLoan.app.model.PropertyAddress;
import com.AceHomeLoan.app.repository.PaddressRepository;

@Service
public class pAddressServiceImpl implements pAddressServiceI
{
	@Autowired
	PaddressRepository adrRepository;

	@Override
	public void savePropertyAddress(PropertyAddress address)
	{
		adrRepository.save(address);
		
	}

	@Override
	public List<PropertyAddress> getpAddress()
	{
		List<PropertyAddress> adr= adrRepository.findAll();
		return adr;
	}

}
