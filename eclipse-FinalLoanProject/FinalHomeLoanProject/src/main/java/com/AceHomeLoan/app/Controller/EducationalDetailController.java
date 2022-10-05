package com.AceHomeLoan.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.AceHomeLoan.app.ServiceI.EducationalDetailsService;
import com.AceHomeLoan.app.model.EducationalDetail;

@RestController
public class EducationalDetailController 
{
	@Autowired
	EducationalDetailsService edService;
	
	
	//http://localhost:8888/educationalDetail
	@PostMapping(value="/educationalDetail")
	public String saveEducationalDetail(@RequestBody EducationalDetail educationaldetail)
	{
		edService.saveEducationalDetail(educationaldetail);
		return "Educational details save successfully";
	}
	
	//http://localhost:8888/educationalDetail
	@GetMapping(value="/educationalDetail")
	public List<EducationalDetail> getAllDetail()
	{
		List<EducationalDetail> listEducationalDetail = edService.getAllDetails();
		return listEducationalDetail;
		
	}
	
	@GetMapping("/educationalDetail/{educationalDetailId}")
	public EducationalDetail getSingleData(@PathVariable Long educationalDetailId)
	{
		EducationalDetail educationaldetailS=edService.getSingleData(educationalDetailId);
		return educationaldetailS;
	}
	
	@PutMapping("/educationalDetail/{educationalId}")
	public EducationalDetail updateData(@RequestBody EducationalDetail educationalDetail,@PathVariable Long educationalId )
	{
		EducationalDetail educational= edService.updateData(educationalDetail,educationalId);
		return educational;
		
	}
	
	@DeleteMapping("/educationalDetail/{educationalDetailId}")
    public String deleteData(@PathVariable Long educationalDetailId) {
	edService.deleteData(educationalDetailId);
	return "Educational Data Successfully Delete";
	
}

}
