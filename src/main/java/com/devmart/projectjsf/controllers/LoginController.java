/**
 * 
 */
package com.devmart.projectjsf.controllers;

import javax.faces.bean.ManagedBean;

/**
 * @author Martín Clase que permite intereactuar con la visa d login.xhtml.
 *
 */
@ManagedBean
public class LoginController {
	private String usuario;
	private String password;
	
	public void ingresar() {
		System.out.println("Usuario: " + usuario);	
		}

	/**
	 * @return the usuario
	 * Usuario que entra al login.
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 * Passwor que entra al login.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
