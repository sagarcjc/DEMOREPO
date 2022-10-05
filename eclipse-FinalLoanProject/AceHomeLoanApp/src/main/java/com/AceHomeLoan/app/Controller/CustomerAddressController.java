package com.AceHomeLoan.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AceHomeLoan.app.ServiceI.CustomerAdrServiceI;
import com.AceHomeLoan.app.model.CustomerAddress;

@CrossOrigin("*")
@RestController
public class CustomerAddressController 
{
	@Autowired
	CustomerAdrServiceI cadrservice;
	
	@PostMapping(value="/CustomerAddress")
	public CustomerAddress savecaddress(@RequestBody CustomerAddress customeraddress)
	{
		System.out.println(customeraddress.getLocaladr());
		System.out.println(customeraddress.getPermanentadr());
		CustomerAddress caddress =cadrservice.saveCaddress(customeraddress);
		return caddress;
	}
	@GetMapping(value="/CustomerAddress")
	public List<CustomerAddress> getCAddress()
	{
		List<CustomerAddress> list = cadrservice.getAllCAddress();
		return list;
	}
	
	@DeleteMapping(value="/CustomerAddress/{cAddressId}")
	public String deleteCaddress(@PathVariable Long cAddressId)
	{
		cadrservice.deleteCaddress(cAddressId);
		return "Data deleted Succefully";
	}
	 
	@PutMapping(value="/CustomerAddress/{cAddressId}")
	public CustomerAddress updatecaddress(@RequestBody CustomerAddress customeraddress,@PathVariable Long cAddressId)
	{
		CustomerAddress updaddress =cadrservice.updatecaddress(customeraddress,cAddressId);
		return updaddress;
	}
	
}
