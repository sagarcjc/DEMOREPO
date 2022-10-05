package com.AceHomeLoan.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AceHomeLoan.app.ServiceI.ProfessionServiceI;
import com.AceHomeLoan.app.model.Profession;
import com.AceHomeLoan.app.repository.ProfessionRepository;

@Service
public class ProfessionServiceImpl implements ProfessionServiceI
{
	@Autowired
	ProfessionRepository prepo;
	
	@Override
	public void saveProfession(Profession profession) {
    prepo.save(profession);
	
	}

	@Override
	public List<Profession> getAllProfession() {
		List<Profession> listprofession= prepo.findAll();
		return listprofession;
		
	}

	@Override
	public Profession getSingleData(Long professionId) {
		 Profession pro=prepo.findById(professionId).get();
			return pro;
	}

	@Override
	public Profession updateData(Profession p) {
		
		return prepo.save(p);
	}

	@Override
	public void deleteData(Long professionId) {
		
		prepo.deleteById(professionId);	
		}

}
