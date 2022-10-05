package com.AceHomeLoan.app.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AceHomeLoan.app.ServiceI.cibilInterface;
import com.AceHomeLoan.app.model.Cibil;
import com.AceHomeLoan.app.repository.Cibilrepository;

@Service
public class CibilServiceImpl implements cibilInterface
{
	@Autowired
	Cibilrepository repository;
    @Override
	public Cibil saveCibil(Cibil cibilscore) 
	{	
		
		Cibil cb=new Cibil();
		cb.setCibilScoreDate(cibilscore.getCibilScoreDate());
		
		int  max=850;
		int min= 650;
		
	int score=(int)(Math.random()*(max-min))+min;
	cb.setCibilScore(score);
	 
	if(score<750)
	{
		cb.setStatus("Poor");
		
	}
	else if(score>=750 && score<=850)
	{
		cb.setStatus("Good");
		
	} 
	System.out.println(cb);
	Cibil ci=repository.save(cb);
	return ci;
	}
	@Override
	public Optional<Cibil> getSingleData(Long cibilId)
	{
	  Optional<Cibil> b = repository.findById(cibilId);
	   return b;
	}
	

}
