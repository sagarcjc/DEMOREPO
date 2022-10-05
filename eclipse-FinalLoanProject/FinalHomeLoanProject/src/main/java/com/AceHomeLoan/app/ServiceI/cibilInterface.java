package com.AceHomeLoan.app.ServiceI;

import java.util.Optional;

import com.AceHomeLoan.app.model.Cibil;

public interface cibilInterface
{

	Cibil saveCibil(Cibil cibilscore);

	Optional<Cibil> getSingleData(Long cibilId);
	
	

}
