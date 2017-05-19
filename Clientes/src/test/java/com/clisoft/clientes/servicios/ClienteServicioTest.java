package com.clisoft.clientes.servicios;



import java.util.List;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.clisoft.clientes.entidades.Cliente;

//@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(SpringRunner.class)
//@ContextConfiguration

public class ClienteServicioTest {

	private AnnotationConfigApplicationContext contextoSpring = null;
	private IClienteServicio clienteSrv = null;
	
	@Before
	public void iniciaContextoSpring() throws Exception {
		contextoSpring = 
				new AnnotationConfigApplicationContext("com.clisoft.clientes.configuracion");
		clienteSrv = contextoSpring.getBean(IClienteServicio.class);
	}

	@After
	public void paraEjecutarDespues() throws Exception {
		contextoSpring.close();
	}
	
	@Test
	public void crearUnCliente() {


		Cliente cliente = new Cliente();		
		cliente.setApellidos("Herreros García");
		cliente.setNombre("alfonso");
		cliente.setCodpostalFact("28521");
		cliente.setDireccion("Calle Sigrid, 2" );		
		clienteSrv.altaCliente(cliente);

		Cliente cliente2 = new Cliente();
		cliente2.setApellidos("Herreros García");
		cliente2.setNombre("Félix");
		cliente2.setCodpostalFact("28521");
		cliente2.setDireccion("Nervión" );
		
		clienteSrv.altaCliente(cliente2);			
		
	}

	
	@Test
	public void borrarUnCliente() {
// lista y Borra el último que encuentra
		
		crearUnCliente();
		
		long i=0;
		Cliente cliente = new Cliente();	
		cliente.setDireccFact("");
		List<Cliente> listCclientes =clienteSrv.buscarCliente(null);				
		System.out.println("Busqueda Todos con OBJETO");
		for (Cliente clientes: listCclientes){
			System.out.println("Cliente con ID " +clientes.getId() + " y Apellidos: "+ clientes.getApellidos());
			i = clientes.getId();
		}
		
		System.out.println("SE VA A BORRAR EL CLIENTE CON ID "+ i);
		clienteSrv.bajaCliente(i);			
	}
	
	@Test
	public void modificarUnCliente() {
		crearUnCliente();
		Cliente cliente = new Cliente();
		cliente.setId(33);
		cliente.setApellidos("CLIENTE MODIFICADO");
		cliente.setDireccion("Calle Sigrid, 2" );
		
		clienteSrv.modificarCliente(cliente);		

		
	}
	
	@Test
	public void buscarTodosLosClienteSinOBJ() {

		
		List<Cliente> listCclientes =clienteSrv.buscarCliente(null);				
		System.out.println("Busqueda de todos Con NULL");
		for (Cliente clientes: listCclientes){
			System.out.println("Cliente con ID " +clientes.getId() + " y Apellidos: "+ clientes.getApellidos());
		}
		
	}
	@Test
	public void buscarTodosLosCliente() {

		Cliente cliente = new Cliente();	
		cliente.setDireccFact("");
		List<Cliente> listCclientes =clienteSrv.buscarCliente(null);				
		System.out.println("Busqueda Todos con OBJETO");
		for (Cliente clientes: listCclientes){
			System.out.println("Cliente con ID " +clientes.getId() + " y Apellidos: "+ clientes.getApellidos());
		}
		
	}
	
	@Test
	public void buscarUnClientePorID() {
	
		Cliente cliente = new Cliente();
		cliente.setId(33);		
		List<Cliente> listCclientes =clienteSrv.buscarCliente(cliente);				
		System.out.println("Busqueda de un cliente por id");
		for (Cliente clientes: listCclientes){
			System.out.println("Cliente con ID " +clientes.getId() + " y Apellidos: "+ clientes.getApellidos());
		}

	}	
	
	
	@Test
	public void buscarUnClientePorNombre() {

		Cliente cliente = new Cliente();
		cliente.setNombre("Alfonso");
		
		List<Cliente> listCclientes =clienteSrv.buscarCliente(cliente);
				
		System.out.println("Busqueda de un cliente por nombre");
		for (Cliente clientes: listCclientes){
			System.out.println(clientes.getId());
			System.out.println(clientes.getNombre());
			System.out.println(clientes.getApellidos());
		}				
		
	}	
	
	
	
	@Test
	public void buscarUnClientePorApellidos() {

		Cliente cliente = new Cliente();
		cliente.setNombre("Herreros");
		

		List<Cliente> listCclientes =clienteSrv.buscarCliente(cliente);
				
		System.out.println("Busqueda de un cliente por Apellidos");
		for (Cliente clientes: listCclientes){
			System.out.println("Cliente con ID " +clientes.getId() +
					" Nombre: "+ clientes.getNombre()		+			
					" y Apellidos: "+ clientes.getApellidos());
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
