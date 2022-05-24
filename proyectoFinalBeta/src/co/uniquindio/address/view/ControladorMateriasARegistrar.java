package co.uniquindio.address.view;

import java.awt.Button;

import co.uniquindio.address.Principal;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControladorMateriasARegistrar {
	
	@FXML
	private TextField nombreEstudianteTextField;
	@FXML
	private TextField asignaturaTextField;
	
	@FXML
	private Button registrarAsignaturaButton;
	@FXML
	private Button volverButton;
	
	

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
	private void fijarMateriaRegistrada() {
		
		String nombreEstudiante=nombreEstudianteTextField.getText();
		String asignatura= asignaturaTextField.getText();
		
		miVentanaPrincipal.aplicarRegistroMateriaEstudiante(nombreEstudiante, asignatura);
		
		cliqueado=true;
	}
	
	@FXML
	private void mostrarVentanaRegistroEstudiante() {
		
		miVentanaPrincipal.mostrarVistaRegistroDeMaterias();
		
		cliqueado=true;
	}
	

}
