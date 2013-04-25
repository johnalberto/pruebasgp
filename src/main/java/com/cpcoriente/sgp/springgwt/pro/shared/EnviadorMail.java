package com.cpcoriente.sgp.springgwt.pro.shared;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class EnviadorMail {

	  	String miCorreo = null;
	    String servidorSMTP = null;
	    String puertoEnvio = null;
	    
		String mailReceptor = null;
	    String asunto = null;
	    String cuerpo = null;
	    String authMode=null;
	    String password =null;
	    
	    public String getMiCorreo() {
			return miCorreo;
		}

		public void setMiCorreo(String miCorreo) {
			this.miCorreo = miCorreo;
		}

		public String getServidorSMTP() {
			return servidorSMTP;
		}

		public void setServidorSMTP(String servidorSMTP) {
			this.servidorSMTP = servidorSMTP;
		}

		public String getPuertoEnvio() {
			return puertoEnvio;
		}

		public void setPuertoEnvio(String puertoEnvio) {
			this.puertoEnvio = puertoEnvio;
		}

		public String getMailReceptor() {
			return mailReceptor;
		}

		public void setMailReceptor(String mailReceptor) {
			this.mailReceptor = mailReceptor;
		}

		public String getAsunto() {
			return asunto;
		}

		public void setAsunto(String asunto) {
			this.asunto = asunto;
		}

		public String getCuerpo() {
			return cuerpo;
		}

		public void setCuerpo(String cuerpo) {
			this.cuerpo = cuerpo;
		}

		public String getAuthMode() {
			return authMode;
		}

		public void setAuthMode(String authMode) {
			this.authMode = authMode;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

	
	 
	    public EnviadorMail(String mailReceptor, String asunto,
	            String cuerpo,String correoOrigen,String servidorSMTP,String puerto,
	            String authMode,String password) {
	        this.setMailReceptor(mailReceptor) ;
	        this.setAsunto(asunto);
	        this.setCuerpo(cuerpo);
	       this.setMiCorreo(correoOrigen);
	       this.setPuertoEnvio(puerto);
	       this.setServidorSMTP(servidorSMTP);
	       this.setAuthMode(authMode);
	       this.setPassword(password);
	       

	        Properties props = new Properties();
	        props.put("mail.smtp.user", getMiCorreo() );
	        props.put("mail.smtp.host", getServidorSMTP());
	        props.put("mail.smtp.port", getPuertoEnvio());
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.auth", getAuthMode());
	        props.put("mail.smtp.socketFactory.port", getPuertoEnvio());
	        props.put("mail.smtp.socketFactory.class",
	                "javax.net.ssl.SSLSocketFactory");
	        props.put("mail.smtp.socketFactory.fallback", "false");


	        try {
	        	
	        	
	            Authenticator auth = new autentificadorSMTP();
	            
	           
	            Session session = Session.getInstance(props, auth);

	          
	           

	            MimeMessage msg = new MimeMessage(session);
	            msg.setText(cuerpo);
	            msg.setSubject(asunto);
	            msg.setFrom(new InternetAddress(getMiCorreo()));
	            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(
	                    mailReceptor));
	            Transport.send(msg);
	        } catch (MessagingException mex) {

	        	System.out.println("<<<<<<ERROR>>>>>>>"+mex.getMessage());
	        }

	    }

	    private class autentificadorSMTP extends javax.mail.Authenticator {
	        public PasswordAuthentication getPasswordAuthentication() {
	        	
	        	
	            return new PasswordAuthentication(getMiCorreo(),getPassword());
	        }
	    }
	    
}


