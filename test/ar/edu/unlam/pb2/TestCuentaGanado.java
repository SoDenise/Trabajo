package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuentaGanado {

	@Test//Es un metodo de testeo 
	public void testQueIncrementaCuentaGanado() {
		CuentaGanado miCuentaGanado = new CuentaGanado();/*Creo una nueva "variable", la cual igualo a todo lo que 
														 contiene la Clase CuentaGanado. LA INICIALIZO*/
		miCuentaGanado.incrementar();/*Al objeto le incremento lo que tenia en CuentaGanado*/
		assertEquals(1, 1, 0.01);
	}
	@Test
	
		public void testQueResteaCuentaGanado() {
		CuentaGanado miCuentaGanado = new CuentaGanado();
		
		miCuentaGanado.incrementar();
		miCuentaGanado.incrementar();
		miCuentaGanado.incrementar();
		miCuentaGanado.incrementar();
		
		assertEquals(4, 4, 0.01);
		
		miCuentaGanado.resetear();
		
		assertEquals(0, 0, 0.01);

	}
}
