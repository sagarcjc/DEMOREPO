package com.AceHomeLoan.app.ServiceI;

import java.util.List;

import com.AceHomeLoan.app.model.EducationalDetail;

public interface EducationalDetailsService 
{

	List<EducationalDetail> getAllDetails();

	void saveEducationalDetail(EducationalDetail detail);

	EducationalDetail getSingleData(Long educationalDetailId);

	EducationalDetail updateData(EducationalDetail educationalDetail, Long educationalId);

	void deleteData(Long educationalDetailId);

	

}
