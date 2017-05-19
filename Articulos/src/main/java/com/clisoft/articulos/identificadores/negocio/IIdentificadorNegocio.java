package com.clisoft.articulos.identificadores.negocio;

import java.util.List;

import com.clisoft.articulos.identificadores.entidades.Identificador;


public interface IIdentificadorNegocio {
	public void altaIdentificador(Identificador identificador);
	public void bajaIdentificador(String idIdentificador);
	public Identificador buscarUnIdentificador(String identificador);
	public void modificarCliente(Identificador identificador);
	
	public List<Identificador> buscarPorCodMarca(String idMarca);
	public List<Identificador> buscarPorcodOrden1(String idOrden1);
	public List<Identificador> buscarPorcodOrden2(String idOrden2);
	public List<Identificador> buscarPorcodOrden3(String idOrden3);
	public List<Identificador> buscarPorycodProv(String idProv);
	public List<Identificador> buscarPordesOrden4(String idDesOrden4);	
}
