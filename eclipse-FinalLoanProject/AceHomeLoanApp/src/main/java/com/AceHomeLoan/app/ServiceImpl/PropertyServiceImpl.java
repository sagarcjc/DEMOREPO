package com.AceHomeLoan.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AceHomeLoan.app.ServiceI.PropertyServiceI;
import com.AceHomeLoan.app.model.PropertyDetails;
import com.AceHomeLoan.app.repository.PropertyRepository;

@Service
public class PropertyServiceImpl implements PropertyServiceI
{
	@Autowired
	PropertyRepository prepository;

	@Override
	public PropertyDetails savePropertyDetails(PropertyDetails proDetails) 
	{
		PropertyDetails pdetails=prepository.save(proDetails);
		
		return pdetails;
	}

	@Override
	public List<PropertyDetails> getPropertyDetails() 
	{ 
		List<PropertyDetails> list = prepository.findAll();
		return list;
	}

}
