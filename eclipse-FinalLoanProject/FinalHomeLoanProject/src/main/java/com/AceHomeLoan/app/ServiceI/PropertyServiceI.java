package com.AceHomeLoan.app.ServiceI;

import java.util.List;

import com.AceHomeLoan.app.model.PropertyDetails;

public interface PropertyServiceI 
{

	PropertyDetails savePropertyDetails(PropertyDetails proDetails);

	List<PropertyDetails> getPropertyDetails();
	

}
