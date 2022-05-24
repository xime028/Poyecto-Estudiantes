package co.uniquindio.address.view;

import java.awt.Button;
import java.util.ArrayList;

import com.sun.javafx.image.impl.ByteIndexed.Getter;

import co.uniquindio.address.Principal;
import co.uniquindio.address.model.Profesor;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControladorProfesor {
	
	@FXML
	private TextField cedulaTextField;
	@FXML
	private TextField nombreTextField;
	@FXML
	private TextField profesionTextField;
	@FXML
	private TextField maximoNivelDeEstudioTextField;
	@FXML
	private TextField nombreAsignaturaTextField;
	@FXML
	private Button guardarProfesorButton;
	@FXML
	private Button volverButton;
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
	private void fijarProfesor() {
		
		String cedula= cedulaTextField.getText();
		String nombre=nombreTextField.getText();
		String profesion= profesionTextField.getText();
		String maximoNivelDeEstudio= maximoNivelDeEstudioTextField.getText();
		String nombreAsignatura= nombreAsignaturaTextField.getText();

		miVentanaPrincipal.inicializarProfesor(cedula, nombre,profesion, maximoNivelDeEstudio,nombreAsignatura);
		
		cliqueado=true;
		
		miVentanaPrincipal.mostrarVistaProfesor();
	}
	
	@FXML
	private void mostrarVentanaAsignatura() {
		
		miVentanaPrincipal.mostrarVistaAsignatura();
		
		cliqueado=true;
	}
	
	@FXML
	private void mostrarVistaFacultad() {
		
		miVentanaPrincipal.mostrarVistaFacultad();
		
		cliqueado=true;
	}

}
