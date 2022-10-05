package com.AceHomeLoan.app.ServiceI;

import java.util.List;
import java.util.Optional;

import com.AceHomeLoan.app.model.SanctionalLetter;

public interface SanctionLetterServiceI 
{

	SanctionalLetter saveSanctionalLetter(SanctionalLetter sletter);

	List<SanctionalLetter> getSanctionalLetter();

	void deleteData(Long sanctionId);

	Optional<SanctionalLetter> getSingleData(Long sanctionId);

	SanctionalLetter updateData(Long sanctionId, SanctionalLetter sletter);

	
	

}
