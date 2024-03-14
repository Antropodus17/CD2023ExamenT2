package com.example.project;

import java.util.ArrayList;

public class GestorEmpleados {
	
	ArrayList<Empleado> empleados=new ArrayList<Empleado>();

	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	public Object obtenerNumeroEmpleados() {
		return empleados.size();
	}

	public Integer calcularSalarioTotal() {
		int salarioTotal=0;
		for(Empleado e: empleados) {
			salarioTotal+=e.sueldo;
		}
		return salarioTotal;
	}

	public Object obtenerEmpleadoConMayorSalario() {
		Empleado a=new Empleado(null, 0);
		for(Empleado e:empleados) {
			if(a.sueldo<e.sueldo) {
				a=e;
			}
		}
		return a;
	}

}
