package com.AceHomeLoan.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.AceHomeLoan.app.ServiceI.pAddressServiceI;
import com.AceHomeLoan.app.model.PropertyAddress;

@CrossOrigin("*")
@RestController
public class PropertyAddressController 
{
	@Autowired
  pAddressServiceI addrservice;
	
	//http://localhost:8888/PropertyAddress
		@PostMapping(value="/PropertyAddress")
		public String savePropertyAddress(@RequestBody PropertyAddress address)
		{
			
			addrservice.savePropertyAddress(address);
			return "Data Save Succefully";
		}
		
		
		//http://localhost:8888/PropertyAddress
		@GetMapping(value="/PropertyAddress")
		public List<PropertyAddress> getAllEnquiry()
		{
			List<PropertyAddress> listenquiry = addrservice.getpAddress();
			return listenquiry;
		}
  
}
