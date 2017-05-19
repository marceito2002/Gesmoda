package com.clisoft.clientes.negocio;

import java.util.LinkedList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clisoft.clientes.entidades.Cliente;
import com.clisoft.clientes.persistencia.IClienteDao;

@Component
@Transactional
public class ClienteNegocio implements IClienteNegocio{
	

	private IClienteDao clienteDao;
	

	@Autowired
	public ClienteNegocio(IClienteDao clienteDao) {
		super();
		this.clienteDao = clienteDao;
	}

	public void altaCliente(Cliente cliente) {
		clienteDao.save(cliente);
		
	}

	public void bajaCliente(long idCliente) {
		clienteDao.delete(idCliente);		
	}


	public List<Cliente> buscarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		List<Cliente> Listcliente = new LinkedList<Cliente>();
		if (cliente != null){
			if (cliente.getId() != 0){
				Listcliente.add(clienteDao.findOne(cliente.getId()));
			}

			
			else if (cliente.getApellidos()!= null && 
					cliente.getNombre() != null){
				Listcliente = clienteDao.findByNombreAndApellidos(cliente.getNombre(), cliente.getApellidos());
			}
					
			else if (cliente.getNombre()!= null){
				Listcliente = clienteDao.findByNombre(cliente.getNombre());
			}
			else if (cliente.getApellidos()!= null){
				Listcliente = clienteDao.findByApellidos(cliente.getApellidos());
			}	
			 //Devolvemos todos.
			else{
				Listcliente = clienteDao.findAll();
			}
			
				
		}
		else{
			Listcliente = clienteDao.findAll();
		}
		
		
		
		return Listcliente;
	}

	public void modificarCliente(Cliente cliente) {
		clienteDao.save(cliente);
		
	}

}
