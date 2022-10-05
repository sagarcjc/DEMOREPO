package com.AceHomeLoan.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AceHomeLoan.app.ServiceI.EducationalDetailsService;
import com.AceHomeLoan.app.model.EducationalDetail;
import com.AceHomeLoan.app.repository.EducationalDetailsRepository;

@Service
public class EducationalDetailServiceImpl implements EducationalDetailsService
{
	@Autowired
	EducationalDetailsRepository edrepo;
	
	@Override
	public List<EducationalDetail> getAllDetails()
	{
		List<EducationalDetail> listEducationalDetail = edrepo.findAll();
		return listEducationalDetail;
		
	}
	
	@Override
	public void saveEducationalDetail(EducationalDetail detail)
	{
		edrepo.save(detail);
		
	}

	@Override
	public EducationalDetail getSingleData(Long educationalDetailId) {
EducationalDetail educationalDetailS1= edrepo.findById(educationalDetailId).get(); 
		return educationalDetailS1;
	}

	@Override
	public void deleteData(Long educationalDetailId) {
		edrepo.deleteById(educationalDetailId);
	}

	@Override
	public EducationalDetail updateData(EducationalDetail educationalDetail, Long educationalId) 
	{
		educationalDetail.setEducationalId(educationalId);
		return edrepo.save(educationalDetail);
	}

}
