package com.AbcLoan.app.ServiceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmailService {

	
	@Value("${spring.mail.username}")
	String fromMail;
	
	@Autowired
	 JavaMailSender mailSender;  
	   
	    
	

	public void approvedEmailSend(String userEmailId) {
		
	       SimpleMailMessage message=new SimpleMailMessage();
		
	       message.setTo(userEmailId);
	       message.setFrom(fromMail);
	       message.setSubject("Regarding further loan process, we are in your service.");
	       message.setText("	You are eligible for further home loan which you have enquired.Please carry following documents and Contact with loan officer,who will guide you for further process."
						+"\n"+"Be prepared with document given below."+"\n"+
						"1.	Address proof "+"\n"
						+ "2.	Employment detail"+"\n"
						+ "3.	Educational proof (school/diploma/degree certificates)"+"\n"
						+ "4.	Bank statements"+"\n"
						+ "5.	Property details on which the loan is applied (if finalized)");
		
		if
		(mailSender !=null) {
		mailSender.send(message);
		log.info("mail sends");
		}
			

	    
		
	}
}
