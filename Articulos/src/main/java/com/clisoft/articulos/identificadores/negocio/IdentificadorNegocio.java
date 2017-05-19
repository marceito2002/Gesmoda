package com.clisoft.articulos.identificadores.negocio;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clisoft.articulos.identificadores.entidades.Identificador;
import com.clisoft.articulos.identificadores.persistencia.IIdentificadorDao;



@Component
@Transactional
public class IdentificadorNegocio implements IIdentificadorNegocio {
	
	
	@Autowired
	private IIdentificadorDao identificadorDao;
	
	public void altaIdentificador(Identificador identificador) {
		identificadorDao.save(identificador);

	}

	public void bajaIdentificador(String idIdentificador) {
		identificadorDao.delete(idIdentificador);

	}

	public Identificador buscarUnIdentificador(String identificador) {
		return identificadorDao.findByIdentificador(identificador);
	}

	public void modificarCliente(Identificador identificador) {
		identificadorDao.save(identificador);

	}

	public List<Identificador> buscarPorCodMarca(String idMarca) {
		return identificadorDao.findBycodMarca(idMarca);
	}

	public List<Identificador> buscarPorcodOrden1(String idOrden1) {
		return identificadorDao.findBycodOrden1(idOrden1);
	}

	public List<Identificador> buscarPorcodOrden2(String idOrden2) {
		return identificadorDao.findBycodOrden2(idOrden2);
	}

	public List<Identificador> buscarPorcodOrden3(String idOrden3) {
		return identificadorDao.findBycodOrden3(idOrden3);
	}

	public List<Identificador> buscarPorycodProv(String idProv) {
		return identificadorDao.findBycodProv(idProv);
	}

	public List<Identificador> buscarPordesOrden4(String idDesOrden4) {
		return identificadorDao.findBydesOrden4(idDesOrden4);
	}

}
