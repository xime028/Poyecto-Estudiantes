package co.uniquindio.address.view;

import java.awt.Button;


import co.uniquindio.address.Principal;
import co.uniquindio.address.model.Carrera;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ControladorCarrera {
	
	@FXML
	private TextField codigoTextField;
	@FXML
	private TextField nombreTextField;
	@FXML
	private TextField duracionSemestreTextField;
	
	@FXML
	private Button guardarCarreraButton;
	@FXML
	private Button volverAlInicioButton;
	
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
	
	/**
	* Metodo para modificar la carrera
	*/
	@FXML
	private void fijarCarrera() {
		
		String codigo=codigoTextField.getText();
		String nombre=nombreTextField.getText();
		int duracionSemestre=Integer.parseInt(duracionSemestreTextField.getText());
		miVentanaPrincipal.inicializarCarrera(codigo, nombre, duracionSemestre);
		
		cliqueado=true;
		
		miVentanaPrincipal.mostrarVistaCarrera();
	}
	
	@FXML
	private void mostrarAsignatura() {
		
		miVentanaPrincipal.mostrarVistaAsignatura();
		
		cliqueado=true;
	}
	
	@FXML
	private void mostrarVistaFacultad() {
		
		miVentanaPrincipal.mostrarVistaFacultad();
		
		cliqueado=true;
	}
	
	

}
