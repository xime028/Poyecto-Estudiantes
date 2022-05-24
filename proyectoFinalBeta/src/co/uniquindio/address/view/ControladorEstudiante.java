package co.uniquindio.address.view;

import java.awt.Button;
import java.util.ArrayList;

import co.uniquindio.address.Principal;
import co.uniquindio.address.model.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControladorEstudiante {
	
	@FXML
	private TextField cedulaTextField;
	@FXML
	private TextField nombreTextField;
	@FXML
	private TextField fechaDeNacimientoTextField;
	@FXML
	private TextField carreraTextField;
	
	@FXML
	private Button guardarEstudianteButton;
	
	@FXML
	private Button RegistrarMateriasButton;
	
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
	public Principal getMiVentaPrincipal() {
		
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
	private void fijarEstudiante() {
		
		String cedula=cedulaTextField.getText();
		String nombre=nombreTextField.getText();
		String fechaDeNacimiento= fechaDeNacimientoTextField.getText();
		String nombreCarrera=carreraTextField.getText();
		miVentanaPrincipal.inicializarEstudiante(cedula, nombre, fechaDeNacimiento, nombreCarrera);
		cliqueado=true;
		
		
		miVentanaPrincipal.mostrarVistaEstudiante();
	}
	
	@FXML
	private void mostrarVentanaRegistroMaterias() {
		
		miVentanaPrincipal.mostrarVistaRegistroDeMaterias();
		
		cliqueado=true;
	}
	

}
