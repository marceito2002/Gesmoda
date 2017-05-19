package com.clisoft.clientes.negocio;

import java.util.List;

import com.clisoft.clientes.entidades.Cliente;

public interface IClienteNegocio {
	public void altaCliente(Cliente cliente);
	public void bajaCliente(long idCliente);
	public List<Cliente> buscarCliente(Cliente cliente);
	public void modificarCliente(Cliente cliente);
}
