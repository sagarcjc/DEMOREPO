package com.AbcLoan.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AbcLoan.app.Repository.FileRepository;
import com.AbcLoan.app.model.AllPersonalDocument;
import com.AbcLoan.app.serviceI.FileServiceI;

@Service
public class FileServiceImpl implements FileServiceI{

	@Autowired 
	FileRepository fr;
	@Override
	public AllPersonalDocument saveDocuments(AllPersonalDocument docs) {
		
		return fr.save(docs);
	}
	@Override
	public List<AllPersonalDocument> getDocument() {
		
		return fr.findAll();
	}

	

}
