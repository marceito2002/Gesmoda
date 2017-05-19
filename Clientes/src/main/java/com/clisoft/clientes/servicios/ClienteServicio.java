package com.clisoft.clientes.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.clisoft.clientes.entidades.Cliente;
import com.clisoft.clientes.negocio.IClienteNegocio;


@Component
public class ClienteServicio implements IClienteServicio{


	private IClienteNegocio clienteNegocio;
	

	@Autowired
	public ClienteServicio(IClienteNegocio clienteNegocio) {
		super();
		this.clienteNegocio = clienteNegocio;
	}

	public void altaCliente(Cliente cliente) {
		clienteNegocio.altaCliente(cliente);
		
	}

	public void bajaCliente(long idCliente) {
		clienteNegocio.bajaCliente(idCliente);		
	}


	public List<Cliente> buscarCliente(Cliente cliente) {
		return clienteNegocio.buscarCliente(cliente);
	}

	public void modificarCliente(Cliente cliente) {
		clienteNegocio.modificarCliente(cliente);
		
	}

}
