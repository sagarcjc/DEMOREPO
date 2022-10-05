package com.AceHomeLoan.app.ServiceI;

import java.util.List;

import com.AceHomeLoan.app.model.PropertyAddress;

public interface pAddressServiceI 
{

	void savePropertyAddress(PropertyAddress address);

	List<PropertyAddress> getpAddress();

	

}
