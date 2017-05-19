package com.clisoft.articulos.identificadores.servicios;

import java.util.List;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.clisoft.articulos.identificadores.entidades.Identificador;
import com.clisoft.articulos.identificadores.entidades.IdentificadorExt;


public class TestIdentificadores {
	private AnnotationConfigApplicationContext contextoSpring = null;
	private IIdentificadorServicio identificadorSrv = null;
	
	@Before
	public void iniciaContextoSpring() throws Exception {
		contextoSpring = 
				new AnnotationConfigApplicationContext("com.clisoft.articulos.identificadores.configuracion");
		identificadorSrv = contextoSpring.getBean(IIdentificadorServicio.class);
	}

	@After
	public void paraEjecutarDespues() throws Exception {
		contextoSpring.close();
	}
	
	@Test
	public void crearUnArticulo() {


		Identificador identificador = new Identificador();
		IdentificadorExt idenfizEXT = new IdentificadorExt();
				
		identificador.setCodColeccion("01");
		identificador.setCodMarca("01");
		identificador.setCodOrden1("01");
		identificador.setCodOrden2("02");
		identificador.setCodOrden3("03");
		identificador.setCodProv("01");
		identificador.setDesAmplia("Descripcion amplia del articulo");
		identificador.setDesOrden4("01");
		identificador.setDesTpv("Descripción para el TPV");
		identificador.setFecha("20160101");
		identificador.setGenerico("cod generico");
		identificador.setIdentificador("01982881T");
		identificador.setMarcaMvt("01");
		identificador.setPrecioXVariante("S");
		identificadorSrv.altaIdentificador(identificador);
		
		idenfizEXT.setIdentificador(identificador.getIdentificador());
		idenfizEXT.setCodebarAuto("CODEBAR01");
		idenfizEXT.setDesCaract1("DESCRIPCION CARACTERISTICA 1");
		idenfizEXT.setDesCaract2("DESCRIPCION CARACTERISTICA 2");
		idenfizEXT.setDesCaract3("DESCRIPCION CARACTERISTICA 3");
		idenfizEXT.setDesCaract4("DESCRIPCION CARACTERISTICA 4");
		idenfizEXT.setDesCaract5("DESCRIPCION CARACTERISTICA 5");
		idenfizEXT.setDesCaract6("DESCRIPCION CARACTERISTICA 6");
		idenfizEXT.setDesCaract7("DESCRIPCION CARACTERISTICA 7");
		idenfizEXT.setDesCaract8("DESCRIPCION CARACTERISTICA 8");
		idenfizEXT.setDesCaract9("DESCRIPCION CARACTERISTICA 9");
		idenfizEXT.setDesCaract10("DESCRIPCION CARACTERISTICA 10");
		idenfizEXT.setDesCaract11("DESCRIPCION CARACTERISTICA 11");
		idenfizEXT.setDesCaract12("DESCRIPCION CARACTERISTICA 12");
		idenfizEXT.setMinimo("MIN");
		idenfizEXT.setSerie1("SERIE 1");
		idenfizEXT.setSerie2("SERIE 3");
		idenfizEXT.setSerie3("SERIE 4");		
		identificador.setIdentificadorExt(idenfizEXT);
				
		identificadorSrv.altaIdentificador(identificador);			
		
	}

	
	@Test
	public void borrarIdentificador() {		
		crearUnArticulo();	
		identificadorSrv.bajaIdentificador("3");
	}
	
	
	@Test
	public void modificarUnCliente() {
		crearUnArticulo();
		Identificador identificador = new Identificador();


		identificador.setCodMarca("MARCA MODIFICADA");
		
		
		identificadorSrv.modificarIdentificador(identificador);

		
	}
	
	@Test
	public void buscarTodosLosClienteSinOBJ() {

		
		List<Identificador> listIdentificadores =identificadorSrv.buscarPorcodOrden3("02");				
		System.out.println("Busqueda de orden 02");
		for (Identificador identificadores: listIdentificadores){
			System.out.println("Cliente con ID " +identificadores.getIdentificador());
		}
		
	}

	
	@Test
	public void buscarUnIdenficadorPorCodProveedor() {			
				
		List<Identificador> listIdenficadores=identificadorSrv.buscarPorycodProv("01");				
		System.out.println("Busqueda de un cliente por id");
		for (Identificador identificadores: listIdenficadores){
			System.out.println("Cliente con ID " +identificadores.getIdentificador());
		}
	}	
	
	
	
	
	@Test
	public void ComprobarMensajes() {

		System.out.println("MENSAJE RECUJPERADO: " +
				contextoSpring.getMessage(
						"page.index.welcome", 
						new Object[]{"Victor"}, 
						Locale.getDefault()));
	
		System.out.println("MENSAJE RECUJPERADO: " +
				contextoSpring.getMessage(
						"page.index.title", 
						null, 
						Locale.getDefault()));		
	}	
}
