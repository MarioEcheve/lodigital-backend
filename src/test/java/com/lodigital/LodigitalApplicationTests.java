package com.lodigital;

import static org.junit.Assert.assertTrue;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.lodigital.model.Usuario;
import com.lodigital.repo.IUsuarioRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LodigitalApplicationTests {

	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@Autowired
	private IUsuarioRepo usuarioRepo;
	
	@Test
	public void crearUsuario() {
		Usuario us = new Usuario();
		us.setIdUsuario(2);
		us.setUsername("fvilches@gmail.com");
		us.setPassword(bcrypt.encode("12345"));
		us.setEnabled(true);
		us.setApellidoPaterno("soleman");
		us.setApellidoMaterno("vilches");
		us.setEmailPrincipal("fvilchessoleman@gmail.com");
		us.setEmailSecundario(null);
		us.setProfesionOficio("ingeniero");
		us.setNombre("Fernando Soleman");
		us.setTelefonoPrincipal("944086220");
		us.setRut("123455678-9");
		Usuario retorno = usuarioRepo.save(us);
		
		assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));
	}

}
