package com.clisoft.articulos.identificadores.persistencia;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clisoft.articulos.identificadores.entidades.Identificador;
import java.lang.String;

public interface IIdentificadorDao extends JpaRepository<Identificador, String> {
	public List<Identificador> findBycodMarca(String idMarca);
	public List<Identificador> findBycodOrden1(String idOrden1);
	public List<Identificador> findBycodOrden2(String idOrden2);
	public List<Identificador> findBycodOrden3(String idOrden3);
	public List<Identificador> findBycodProv(String idProv);
	public Identificador findByIdentificador(String identificador);
	public List<Identificador> findBydesOrden4(String idDesOrden4);
}
