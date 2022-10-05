package com.AceHomeLoan.app.ServiceI;

import java.util.List;

import com.AceHomeLoan.app.model.AllPersonalDocs;

public interface AllPersonalDocsServiceI 
{

	AllPersonalDocs saveDocuments(AllPersonalDocs docs);

	List<AllPersonalDocs> getDocument();

	void deleteDocument(Long documentId);

}
