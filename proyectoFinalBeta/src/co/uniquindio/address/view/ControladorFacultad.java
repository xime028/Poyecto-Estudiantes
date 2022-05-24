package co.uniquindio.address.view;

import java.awt.Button;

import co.uniquindio.address.Principal;
import javafx.fxml.FXML;

public class ControladorFacultad {
	
	@FXML
	private Button administrativosButton;
	@FXML
	private Button estudiantesButton;
	
	//para manejar el boton
	private boolean cliqueado = false;
	//VentanaPrincipal
	private Principal miVentanaPrincipal;
	
	

	/**
	* Inicializa la clase contenedor.
	*/
	@FXML
	private void initialize() {
	}
	
	/**
	* Metodo modificador
	*
	* @param dialogo
	*/
	public Principal getMiVentanaPrincipal() {
		
		return miVentanaPrincipal;
	}
	
	public void setMiVentanaPrincipal(Principal miVentanaPrincipal) {
		
		this.miVentanaPrincipal = miVentanaPrincipal;
	}
	
	/**
	* Retorna verdadero si el usuario dio clic sobre el boton
	*
	* @return
	*/
	public boolean isCliqueado() {
		return cliqueado;
	}
	
	
	@FXML
	private void mostrarVentanaCarrera() {
		
		miVentanaPrincipal.mostrarVistaCarrera();
		
		cliqueado=true;
	}
	
	@FXML
	private void mostrarVistaEstudiante() {
		
		miVentanaPrincipal.mostrarVistaEstudiante();
		
		cliqueado=true;
	}

}
