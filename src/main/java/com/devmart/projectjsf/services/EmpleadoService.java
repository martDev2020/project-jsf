/**
 * 
 */
package com.devmart.projectjsf.services;

import java.util.*;

import com.devmart.projectjsf.entity.Empleado;

/**
 * @author Martín
 * 
 *         Clase que permite realiza la lógica de empleado.
 *
 */
public class EmpleadoService {
	
//	Método que permite consultar la lista de los empleados de empresas de TI.
//	{@link Empleado} lista de empleado.
	
	public List<Empleado> consultarEmpleados() {
//	Generar la lista de empleados.
		List<Empleado> empleados = new ArrayList<Empleado>();
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoM = new Empleado();
		Empleado empleadoA = new Empleado();

		empleadoIBM.setNombre("Carlos");
		empleadoIBM.setPrimerApellido("Sebas");
		empleadoIBM.setSegundoApellido("Bastián");
		empleadoIBM.setPuesto("Desarrollador");
		empleadoIBM.setEstatus(true);

		empleadoM.setNombre("Miguel");
		empleadoM.setPrimerApellido("Sebas");
		empleadoM.setSegundoApellido("Bastián");
		empleadoM.setPuesto("Desarrollador javascript");
		empleadoM.setEstatus(true);

		empleadoA.setNombre("Verónica");
		empleadoA.setPrimerApellido("Santos");
		empleadoA.setSegundoApellido("Santos");
		empleadoA.setPuesto("Desarrollador React");
		empleadoA.setEstatus(true);

		empleados.add(empleadoA);
		empleados.add(empleadoM);
		empleados.add(empleadoIBM);

		return empleados;
	}
}
