package com.AceHomeLoan.app.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AceHomeLoan.app.ServiceI.SanctionLetterServiceI;
import com.AceHomeLoan.app.model.SanctionalLetter;
import com.AceHomeLoan.app.repository.SactionletterRepository;

@Service
public class SanctionLetterServiceImpl implements SanctionLetterServiceI
{
	@Autowired
	SactionletterRepository letterRepository;

	@Override
	public SanctionalLetter saveSanctionalLetter(SanctionalLetter sletter) 
	{
		
		return letterRepository.save(sletter);
	}

	@Override
	public List<SanctionalLetter> getSanctionalLetter() 
	{
		List<SanctionalLetter> list = letterRepository.findAll();
	
		return list;
	}

	@Override
	public SanctionalLetter updateData(Long sanctionId, SanctionalLetter sletter)
	{
		sletter.setSanctionId(sanctionId);
		return letterRepository.save(sletter);
		
		}

	@Override
	public void deleteData(Long sanctionId) 
	{
		letterRepository.deleteById(sanctionId);
		
	}

	@Override
	public Optional<SanctionalLetter> getSingleData(Long sanctionId) 
	{ 
		
		Optional<SanctionalLetter> single =letterRepository.findById(sanctionId);
		return single;
	}

}
