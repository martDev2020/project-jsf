/**
 * 
 */
package com.devmart.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devmart.projectjsf.entity.Empleado;
import com.devmart.projectjsf.services.EmpleadoService;

/**
 * @author Martín
 *
 *         Clase controller que se encarga de procesar la pantalla principal
 *         principal.xhtml.
 */

@ManagedBean
@ViewScoped
public class PrinciparConttroller {

	/**
	 * Lista de empleados para la tabla.
	 */
	private List<Empleado> empleados;
	/**
	 * Servicio con los métods que realizan la lógica de negocios de empleados.
	 */
	private EmpleadoService empleadoService = new EmpleadoService();
//Método que se encarga de inicializar la pantalla principal par mostrar los datos.
	@PostConstruct
	public void init() {
		this.consultEmpleados();
	}
//Método que consulta la lista de empleados.
	public void consultEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados();
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
}
