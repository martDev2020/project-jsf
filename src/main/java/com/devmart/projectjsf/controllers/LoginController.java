/**
 * 
 */
package com.devmart.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.devmart.projectjsf.dto.UsuarioDTO;

/**
 * @author Martín 
 * Clase que permite intereactuar con la visa d login.xhtml.
 *
 */
@ManagedBean
public class LoginController {
	private String usuario;
	private String password;
	
	//Bean que mantiene la información en sesión.
	//Esta propiedad inyecta el controaldor o llama para hacerlo funcional en ésta clase.
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;

	public void ingresar() {
		System.out.println("Usuario: " + usuario);
		if (usuario.equals("devmart") && password.equals("123")) {
			try {
				/**
				 * Para que la sesión que se encuentra actica se codifica lo siguiente
				 * de tal forma que la variable que indica o tiene el nombre del atrbuto se mantenga, esto
				 * después de generar los métodos get y set.
				 * */
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(this.usuario);
				usuarioDTO.setPassword(this.password);
				
				this.sessionController.setUsuarioDTO(usuarioDTO);
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La página no existe.", ""));
				e.printStackTrace();
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrectos.", ""));
		}
	}
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec= FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

	/**
	 * @return the usuario Usuario que entra al login.
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
	 * @return the password Passwor que entra al login.
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
	/**
	 * @return the sessionController
	 */
	public SessionController getSessionController() {
		return sessionController;
	}
	/**
	 * @param sessionController the sessionController to set
	 */
	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}

}
