package com.AceHomeLoan.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AceHomeLoan.app.ServiceI.MortgageServiceI;
import com.AceHomeLoan.app.model.Mortgage;
import com.AceHomeLoan.app.repository.MortgageRepository;

@Service
public class MortgageServiceImpl implements MortgageServiceI 
{
	@Autowired
	MortgageRepository mrepository;

	@Override
	public Mortgage saveMortagedata(Mortgage mortgage)
	{
		Mortgage mdata= mrepository.save(mortgage);
		return mdata;
	}

	@Override
	public List<Mortgage> getMortgage()
	{
		List<Mortgage> listMortgage = mrepository.findAll();
		return listMortgage;
	}
	
	

}
