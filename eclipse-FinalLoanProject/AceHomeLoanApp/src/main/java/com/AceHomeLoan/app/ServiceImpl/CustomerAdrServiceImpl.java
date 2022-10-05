package com.AceHomeLoan.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AceHomeLoan.app.ServiceI.CustomerAdrServiceI;
import com.AceHomeLoan.app.model.CustomerAddress;
import com.AceHomeLoan.app.repository.CustomerAdrRepository;

@Service
public class CustomerAdrServiceImpl implements CustomerAdrServiceI
{
	@Autowired
	CustomerAdrRepository cadrrepository;

	@Override
	public CustomerAddress saveCaddress(CustomerAddress customeraddress) 
	{
		
		return cadrrepository.save(customeraddress);
	}

	@Override
	public List<CustomerAddress> getAllCAddress() 
	{
		
		return cadrrepository.findAll() ;
	}

	@Override
	public void deleteCaddress(Long cAddressId) 
	{
		 cadrrepository.deleteById(cAddressId);
		
	}

	@Override
	public CustomerAddress updatecaddress(CustomerAddress customeraddress, Long cAddressId)
	{
		customeraddress.setCAddressId(cAddressId);
		return cadrrepository.save(customeraddress);
	}

}
