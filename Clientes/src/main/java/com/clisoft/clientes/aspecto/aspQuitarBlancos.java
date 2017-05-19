package com.clisoft.clientes.aspecto;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import com.clisoft.clientes.entidades.Cliente;



//@Aspect
@Component
public class aspQuitarBlancos {

 //FUNCINA BIEN.
//    @Before("execution(* com.clisoft.clientes.servicios.IClienteServicio+.*(..)) ")
//    public void advice() {
//        // advise FooService methods as appropriate
//    	System.out.println("INTERCEPTADO");
//    	System.out.println("INTERCEPTADO");
//    	System.out.println("INTERCEPTADO");
//    }
//    
  
	@Before("execution(* com.clisoft.clientes.servicios.IClienteServicio.buscarCliente(..))  && args(cliente)")
	public void aaaadvice(Cliente cliente) {
	      // advise FooService methods as appropriate
	  	System.out.println("ANTES DE LA LLAMADA INTERCEPTADO."  +cliente.getApellidos());
		System.out.println("===================================");	  	  }


	
	@After("execution(* com.clisoft.clientes.servicios.IClienteServicio.buscarCliente(..))  && args(cliente)")
	public void despuesDelTarget(Cliente cliente){
		System.out.println("===================================");
		System.out.println("DESPUES DE LA LLAMADA INTERCEPTADO."  +cliente.getApellidos());
	}
	

	@Around("execution(* com.clisoft.clientes.servicios.IClienteServicio.buscarCliente(..))")
	public Object duranteElTarget(ProceedingJoinPoint pjp) throws Throwable{
	Object[] parametros = pjp.getArgs();	
		System.out.println("===================================");
		System.out.println("El numero recibido es: " + parametros[0]);
		
		//Object resultado = pjp.proceed(parametros);		
		//String resultado = "GANDALF: No puedes pasar!!!!";		
		//System.out.println("El resultado es: " + resultado);		
		//	return resultado;
		return parametros;	
	}
	
}
