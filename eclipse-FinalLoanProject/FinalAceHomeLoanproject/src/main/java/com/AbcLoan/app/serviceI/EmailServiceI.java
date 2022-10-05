package com.AbcLoan.app.serviceI;

import org.springframework.web.multipart.MultipartFile;

import com.AbcLoan.app.model.EmailSender;

public interface EmailServiceI 
{

	void mailSanctionLetter(EmailSender m, MultipartFile santionLetter);

}
