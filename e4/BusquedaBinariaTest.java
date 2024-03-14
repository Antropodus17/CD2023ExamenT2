package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BusquedaBinariaTest {

	static int[]a=new int[5];
	
	void ini() {
		for (int i=0;i<a.length;i++) {
			a[i]=i;
		}
	}
	
	@Test
	@DisplayName("Proba 1")
	public void busqueda1Test() {
		ini();
		assertEquals(2,BusquedaBinaria.busquedaBinaria(a, 2 )) ;
	}
	
	@Test
	@DisplayName("Proba 2")
	public void busqueda2Test() {
		ini();
		assertEquals(-1,BusquedaBinaria.busquedaBinaria(a, 5 )) ;
	}
	
	@Test
	@DisplayName("Proba 3")
	public void busqueda3Test() {
		ini();
		a[3]=2;
		assertEquals(4,BusquedaBinaria.busquedaBinaria(a, 4)) ;
	}
	
	@Test
	@DisplayName("Proba 4")
	public void busqueda4Test() {
		ini();
		assertEquals(0,BusquedaBinaria.busquedaBinaria(a, 0 )) ;
	}
	
	@Test
	@DisplayName("Proba 5")
	public void busqueda5Test() {
		ini();
		assertEquals(4,BusquedaBinaria.busquedaBinaria(a, 4 )) ;
	}
	
	@Test
	@DisplayName("Proba 6")
	public void busqueda6Test() {
		a= new int[5];
		assertEquals(-1,BusquedaBinaria.busquedaBinaria(a, 2 )) ;
	}
}
