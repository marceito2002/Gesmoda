package com.clisoft.clientes.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clisoft.clientes.entidades.Cliente;

import java.lang.String;
import java.util.List;

public interface IClienteDao  extends JpaRepository<Cliente, Long>{	
	public List<Cliente> findByNombreAndApellidos(String nombre, String apellidos);
	public List<Cliente> findByNombre(String nombre);
	public List<Cliente> findByApellidos(String apellidos);
}
