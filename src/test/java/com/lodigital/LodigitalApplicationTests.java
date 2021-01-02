package com.lodigital;

import static org.junit.Assert.assertTrue;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.lodigital.model.Empresa;
import com.lodigital.model.Usuario;
import com.lodigital.repo.IEmpresaRepo;
import com.lodigital.repo.IUsuarioRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LodigitalApplicationTests {

	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@Autowired
	private IUsuarioRepo usuarioRepo;
	
	@Autowired
	private IEmpresaRepo empresaRepo;
	
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
		us.setNombre("Fernando");
		us.setTelefonoPrincipal("944086220");
		us.setRut("123455678-9");
		Usuario retorno = usuarioRepo.save(us);
		
		assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));
	}
	
	@Test
	public void crearEmpresa() {
		
		Empresa empresa = new Empresa();
		empresa.setIdEmpresa(1);
		empresa.setCargoFuncionContactoComercial(" funcion contacto comercial");
		empresa.setCargoFuncionContactoTecnico("funcion contacto tecnico");
		empresa.setDireccion(" sin direccion ");
		empresa.setEmailContactoComercial("prueba@gmail.com");
		empresa.setEmailContactoTecnico("pruebaTecnico@gmail.com");
		empresa.setFechaCreacion(null);
		empresa.setFechaModificacion(null);
		empresa.setGiroPrincipal("Construccion");
		empresa.setIdEmpresa(null);
		empresa.setNombreContactoComercial("Felipe");
		empresa.setNombreContactoTecnico("Marcelo");
		empresa.setNombreFantasia("Empresa de fantasia");
		empresa.setRazonSocial("Constructora Ltda Coquimbo");
		empresa.setRut("145215689");
		empresa.setTelefonoPrincipalContactoComercial("944086225");
		empresa.setTelefonoPrincipalContactoTecnico("944086229");
		empresa.setTelefonoSecundarioContactoComercial("944086228");
		empresa.setTelefonoSecundarioContactoTecnico("944086227");
		
		empresaRepo.save(empresa);
		
		assertTrue(true);
	}

}
