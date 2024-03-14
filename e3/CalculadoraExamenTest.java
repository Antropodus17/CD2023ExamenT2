package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraExamenTest {
    
	@Test
	@DisplayName("Getters y setters")
	public void GettersSetters(){
		CalculadoraExamen c=new CalculadoraExamen(1, 2);
		c.setA(5);
		assertEquals(5, c.getA());
		c.setB(9);
		assertEquals(9, c.getB());
	}
	
	@Test
	@DisplayName("Probas Suma")
	public void sumaTest() {
		CalculadoraExamen c=new CalculadoraExamen(2, 5);
		assertEquals(7, c.sumar());
	}
	@Test
	@DisplayName("Probas Resta")
	public void restaTest() {
		CalculadoraExamen c=new CalculadoraExamen(2, 5);
		assertEquals(-3, c.restar());
	}
	
	@Test
	@DisplayName("Probas multilicacion")
	public void multTest() {
		CalculadoraExamen c=new CalculadoraExamen(2, 5);
		assertEquals(10, c.multiplicar());
	}
	
	@Test
	@DisplayName("Probas Division")
	public void divTest() {
		CalculadoraExamen c=new CalculadoraExamen(10, 5);
		assertEquals(2, c.dividir());
	}
	
	@Test
	@DisplayName("Probas Excepcion Division")
	public void excDivTest() {
		CalculadoraExamen c=new CalculadoraExamen(2, 0);
		assertThrows(Exception.class, ()->{
			c.dividir();
		});
	}
}
