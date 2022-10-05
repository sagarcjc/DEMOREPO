package com.AceHomeLoan.app.ServiceI;

import java.util.List;

import com.AceHomeLoan.app.model.CustomerAddress;

public interface CustomerAdrServiceI 
{

	CustomerAddress saveCaddress(CustomerAddress customeraddress);

	List<CustomerAddress> getAllCAddress();

	void deleteCaddress(Long cAddressId);

	CustomerAddress updatecaddress(CustomerAddress customeraddress, Long cAddressId);
	

}
