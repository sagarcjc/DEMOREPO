package com.AceHomeLoan.app.ServiceI;

import java.util.List;

import com.AceHomeLoan.app.model.GuarantorDetails;

public interface GuarantorDetailsServiceI 
{

	GuarantorDetails saveGuarantorDetails(GuarantorDetails gdetails);

	List<GuarantorDetails> getAllguarenter();

	void deleteGuarenter(Integer guarantorId);

}
