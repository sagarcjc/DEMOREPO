package com.AceHomeLoan.app.ServiceI;

import java.util.List;

import com.AceHomeLoan.app.model.Profession;

public interface ProfessionServiceI 
{
	void saveProfession(Profession profession);

	List<Profession> getAllProfession();

	Profession getSingleData(Long professionId);

	Profession updateData(Profession p);

	void deleteData(Long professionId);
}
