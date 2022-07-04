package ar.edu.oof;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcesionariaTest {

	@Test
	public void test() {
		Concesionaria cons = new Concesionaria();
		Auto auto1 = new Auto(1,"Fiesta");
		cons.agregarAuto(auto1);
		assertEquals(1,cons.getAutos().size());
	}
	
	@Test(expected=AutoNoEncontradoException.class)
	public void test2() throws AutoNoEncontradoException{
		Concesionaria cons = new Concesionaria();
		Auto auto2 = new Auto(1,"Corsa");
		cons.agregarAuto(auto2);
		
		Integer VE = 1;
		
		//auto encontrado
		
		Auto AE = cons.buscarAutoPorId(3);
		
	}
	
	@Test
	public void testMensajeDeExcepcion(){
		Concesionaria cons = new Concesionaria();
		Auto auto2 = new Auto(1,"Corsa");
		cons.agregarAuto(auto2);
		
		try {
			Auto AE = cons.buscarAutoPorId(3);
		} catch (Exception e) {
			assertEquals(e.getMessage(),"El auto no se encontro");
		}
	}
}
