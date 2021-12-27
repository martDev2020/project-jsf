/**
 * 
 */
package com.devmart.projectjsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Martín
 * Clase para cerrar la sessión de la aplicación.
 *
 */
@ManagedBean
public class SessioCloseController {

	@PostConstruct
public void init() {
	System.out.println("Cerrar sesión");
}
	//Método que permite cerrar la sesión y regresa a la pantalla del login.
	public void cerrarSession() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Método que permite redirecciona a una pantalla.
	 * @Param página {@lnk String} para direccionarse.
	 * @throws IOException para envaira los errores que sucedan en la pagina
	 * al direccinarar el cierre de los sitios abiertos.
	 * */
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec= FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
}
