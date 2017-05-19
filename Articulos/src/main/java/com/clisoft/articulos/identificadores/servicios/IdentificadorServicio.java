package com.clisoft.articulos.identificadores.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clisoft.articulos.identificadores.entidades.Identificador;
import com.clisoft.articulos.identificadores.negocio.IdentificadorNegocio;



@Component
public class IdentificadorServicio implements IIdentificadorServicio {

	

	private IdentificadorNegocio identificadorNegocio;
	

	@Autowired	
	public IdentificadorServicio(IdentificadorNegocio identificadorNegocio) {
		super();
	}

	
	
	public void altaIdentificador(Identificador identificador) {
		identificadorNegocio.altaIdentificador(identificador);
		
	}


	public void bajaIdentificador(String identificador) {
		identificadorNegocio.bajaIdentificador(identificador);
		
	}

	public Identificador buscarIdentificador(String identificador) {
		return identificadorNegocio.buscarUnIdentificador(identificador);
	}

	public void modificarIdentificador(Identificador identificador) {
		identificadorNegocio.modificarCliente(identificador);
		
	}

	public List<Identificador> buscarPorCodMarca(String idMarca) {
		return identificadorNegocio.buscarPorCodMarca(idMarca);
	}

	public List<Identificador> buscarPorcodOrden1(String idOrden1) {
		return identificadorNegocio.buscarPorcodOrden1(idOrden1);
	}

	public List<Identificador> buscarPorcodOrden2(String idOrden2) {
		return identificadorNegocio.buscarPorcodOrden2(idOrden2);
	}

	public List<Identificador> buscarPorcodOrden3(String idOrden3) {
		return identificadorNegocio.buscarPorcodOrden3(idOrden3);
	}
	
	public List<Identificador> buscarPordesOrden4(String idDesOrden4) {
		return identificadorNegocio.buscarPordesOrden4(idDesOrden4);
	}
	
	public List<Identificador> buscarPorycodProv(String idProv) {
		return identificadorNegocio.buscarPorycodProv(idProv);
	}

}
