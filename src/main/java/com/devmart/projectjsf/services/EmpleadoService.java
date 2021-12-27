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
		Empleado empleadoCYBER = new Empleado();
		Empleado empleadoJAVA = new Empleado();
		Empleado empleadoC = new Empleado();
		
		empleadoA.setNombre("Armando");
		empleadoA.setPrimerApellido("Sebas");
		empleadoA.setSegundoApellido("Bastián");
		empleadoA.setPuesto("Desarrollador");
		empleadoA.setEstatus(true);

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
		
		empleadoA.setNombre("Verónica");
		empleadoA.setPrimerApellido("Santos");
		empleadoA.setSegundoApellido("Santos");
		empleadoA.setPuesto("Desarrollador React");
		empleadoA.setEstatus(true);
		
		//:::::::::::::::::::::::::::::::::::
		empleadoCYBER.setNombre("Mariel");
		empleadoCYBER.setPrimerApellido("Santos");
		empleadoCYBER.setSegundoApellido("Santos");
		empleadoCYBER.setPuesto("Desarrollador React");
		empleadoCYBER.setEstatus(true);
		
		empleadoJAVA.setNombre("Rafael");
		empleadoJAVA.setPrimerApellido("Santos");
		empleadoJAVA.setSegundoApellido("Santos");
		empleadoJAVA.setPuesto("Desarrollador React");
		empleadoJAVA.setEstatus(true);
		
		empleadoC.setNombre("Sonia");
		empleadoC.setPrimerApellido("Santos");
		empleadoC.setSegundoApellido("Santos");
		empleadoC.setPuesto("Desarrollador React");
		empleadoC.setEstatus(true);
		
		empleados.add(empleadoM);
		empleados.add(empleadoCYBER);
		empleados.add(empleadoJAVA);
		empleados.add(empleadoC);
		empleados.add(empleadoIBM);
		empleados.add(empleadoA);

		return empleados;
	}
}
