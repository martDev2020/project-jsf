/**
 * 
 */
package com.devmart.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.devmart.projectjsf.dto.UsuarioDTO;

/**
 * @author Martín
 * 
 * Clase que mantiene la sesión abierta detnro de la aplicación
 * o vistas por las que navega el usuario.
 *
 */
@ManagedBean
@SessionScoped
public class SessionController {

	//Usuario que se mantendrá en sesión.
	private UsuarioDTO usuarioDTO;

	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}
	//Iniciailiza la sesión del usuario.
	@PostConstruct
	public void init() {
		System.out.println("Cargando información del usuario en la sesión.");
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
}
