package com.AceHomeLoan.app.ServiceI;

import java.util.List;

import com.AceHomeLoan.app.model.Mortgage;

public interface MortgageServiceI 
{

	public Mortgage saveMortagedata(Mortgage mortgage);

	List<Mortgage> getMortgage();
	

}
