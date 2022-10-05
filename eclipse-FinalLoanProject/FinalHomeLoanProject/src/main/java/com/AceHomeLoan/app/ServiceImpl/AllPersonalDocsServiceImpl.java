package com.AceHomeLoan.app.ServiceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.AceHomeLoan.app.ServiceI.AllPersonalDocsServiceI;
import com.AceHomeLoan.app.model.AllPersonalDocs;
import com.AceHomeLoan.app.repository.AllPersonalDocsRepository;

@Service
public class AllPersonalDocsServiceImpl implements AllPersonalDocsServiceI
{
 @Autowired
 AllPersonalDocsRepository docsrepository;

@Override
public AllPersonalDocs saveDocuments(AllPersonalDocs docs) 
{
	
	return docsrepository.save(docs);
}

@Override
public List<AllPersonalDocs> getDocument() 
{
	
	return docsrepository.findAll();
}

@Override
public void deleteDocument(Long documentId)
{
	
	docsrepository.deleteById(documentId);
}

}
