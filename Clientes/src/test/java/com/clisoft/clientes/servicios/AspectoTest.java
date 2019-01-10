package com.clisoft.clientes.servicios;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.clisoft.clientes.entidades.Cliente;

public class AspectoTest {


			


	@Test
	public void buscarTodosLosClienteSinOBJ() {

		AnnotationConfigApplicationContext contextoSpring = new AnnotationConfigApplicationContext("com.clisoft.clientes.configuracion");;
		IClienteServicio clienteSrv =  contextoSpring.getBean(IClienteServicio.class);
		
		Cliente cliente = new Cliente();
		cliente.setApellidos("HERREROS");
		cliente.setId(33);
		List<Cliente> listCclientes =clienteSrv.buscarCliente(cliente);				
		System.out.println("Busqueda de todos Con NULL");
		for (Cliente clientes: listCclientes){
			System.out.println(clientes.getId());
			System.out.println(clientes.getApellidos());
		}		
		contextoSpring.close();
		
		
		
	}
	
	
}
