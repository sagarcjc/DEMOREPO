package com.AbcLoan.app.ServiceImpl;



import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.AbcLoan.app.model.EmailSender;
import com.AbcLoan.app.serviceI.EmailServiceI;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmailService implements EmailServiceI
{
	@Value("${spring.mail.username}")
	String fromEmail;
	
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




	@Override
	public void mailSanctionLetter(EmailSender m, MultipartFile santionLetter) {
		m.setFromEmail(fromEmail);
		m.setToEmail("sagartangade1@gmail.com");
		
		MimeMessage memimeMessage=mailSender.createMimeMessage();
		
		
		MimeMessageHelper helper;
		try {
			helper = new MimeMessageHelper(memimeMessage,true);			
			helper.setTo(m.getToEmail());		  //sending multiple person
			helper.setFrom(fromEmail);
			helper.setSubject("HOME LOAN SANCTION LETTER");
			helper.setText("Dear sir, please find the attached sanction letter");
			
			
//			FileSystemResource file=new FileSystemResource("E:\\day1.pdf");
			helper.addAttachment("SanctionLetter.pdf",santionLetter);
			
		} catch (MessagingException e) {
			
			e.printStackTrace();
		}
		;
		
		
		mailSender.send(memimeMessage);
		
		
	}
	
	public void DisbursementEmailSend(String userEmailId) {
		
	       SimpleMailMessage message=new SimpleMailMessage();
		
	       message.setTo(userEmailId);
	       message.setFrom(fromMail);
	       message.setSubject("Consent Letter for part Disbursement to your Account behalf of me");
	       message.setText("Dear Sir/Mam ---+\"\\n\"+\" I have been sanctioned Housing Loan of Rs.-----/- from AceHomeLoan w.r.t my Loan \"+\"\\n\"+ "
						+"\n"+"Out of which ,so far ,I have got Rs.---  /- disbursed to you.Enclosed is/are the Original Payment Receipt(s) acknowledged by you for past disbursal.  "+"\n"+
						"1.	Name: Sagar Patil "+"\n"
						+ "2. Bank Name:ACE Home Finance"+"\n"
						+ "3.	Branch Address: Karve nagar PWA Complex, 3th Floor, Pune"+"\n"
						+ "4.	Account NUmber:23232322"+"\n"
						+ "5.	IFSC Code:SBI000565"+"\n"
						+ "6.	MICR Code:4004242"+"\n"+"\n"+"\n"+"\n"+"\n"
						
						+ "7.	Thanks & Regards"	  +"\n" +"Loan Officer"    +"\n" +"ACE HOME FINANCE"
						+"\n" +"Email:ace finace"
	    		   
	    		   );
	       
	      
	       
	       
		
		if
		(mailSender !=null) {
		mailSender.send(message);
		log.info("mail sends");
		}
					
	}
		
	}

