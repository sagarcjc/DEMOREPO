package com.AbcLoan.app.serviceI;

import java.util.List;

import com.AbcLoan.app.model.AllPersonalDocument;

public interface FileServiceI {

	public AllPersonalDocument saveDocuments(AllPersonalDocument docs);

	public List<AllPersonalDocument> getDocument();

	
}
