package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class GestorEmpleadosTest {
    private  GestorEmpleados gestorEmpleados;

    @BeforeAll
    
    public void setUp() {
        gestorEmpleados = new GestorEmpleados();
    }

    @Test
    public void testAgregarEmpleado() {
        Empleado empleado = new Empleado("John", 1000);
        gestorEmpleados.agregarEmpleado(empleado);
        assertEquals(1, gestorEmpleados.obtenerNumeroEmpleados());
    }

    @Test
    public void testCalcularSalarioTotal() {
        Empleado empleado1 = new Empleado("John", 1000);
        Empleado empleado2 = new Empleado("Alice", 1500);
        gestorEmpleados.agregarEmpleado(empleado1);
        gestorEmpleados.agregarEmpleado(empleado2);
        assertEquals(2500, gestorEmpleados.calcularSalarioTotal());
    }

    @Test
    public void testEmpleadoConMayorSalario() {
        Empleado empleado1 = new Empleado("John", 1000);
        Empleado empleado2 = new Empleado("Alice", 1500);
        gestorEmpleados.agregarEmpleado(empleado1);
        gestorEmpleados.agregarEmpleado(empleado2);
        assertEquals(empleado2, gestorEmpleados.obtenerEmpleadoConMayorSalario());
    }
}
