package com.lodigital.util;

import java.nio.charset.StandardCharsets;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import com.lodigital.model.Usuario;

@Component
public class EmailUtil {
	
	@Autowired
	private JavaMailSender emailSender;
	
	@Autowired
	private SpringTemplateEngine templateEngine;
	
	public void enviarMailActivarUsuario(Mail mail,Usuario usuario) {
		try {
			MimeMessage message = emailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED, StandardCharsets.UTF_8.name());
			
			String nombreUsuarioCompleto = usuario.getNombre()+' '+ usuario.getApellidoPaterno()+' '+ usuario.getApellidoMaterno();
			Context context = new Context();
			context.setVariable("nombreUsuarioCompleto",""+nombreUsuarioCompleto);
			context.setVariables(mail.getModel());
			
			String html = templateEngine.process("email/email-template", context);
			
			helper.setTo(mail.getTo());
			helper.setText(html, true);
			helper.setSubject(mail.getSubject());
			helper.setFrom(mail.getFrom());
			emailSender.send(message);
			
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	public void enviarCorreoReestablecerPassword(Mail mail, String claveProvisoria) {
		try {
			MimeMessage message = emailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED, StandardCharsets.UTF_8.name());
			
			Context context = new Context();
			context.setVariables(mail.getModel());
			context.setVariable("claveProvisoria", "su Clave Provisoria es : "+claveProvisoria);
			System.out.print(context.getVariableNames());
			
			String html = templateEngine.process("email/restablecer-template", context);
			
			helper.setTo(mail.getTo());
			helper.setText(html, true);
			helper.setSubject(mail.getSubject());
			helper.setFrom(mail.getFrom());
			emailSender.send(message);
			
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
