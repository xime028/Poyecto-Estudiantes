package co.uniquindio.address.view;

import java.awt.Button;
import java.util.ArrayList;

import co.uniquindio.address.Principal;
import co.uniquindio.address.model.*;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControladorAsignatura {
	
	@FXML
	private TextField codigoTextField;
	@FXML
	private TextField nombreTextField;
	@FXML
	private TextField numeroDeCreditosTextField;
	@FXML
	private TextField intensidadHorariaTextField;
	@FXML
	private TextField tipoDeAsignaturaTextField;
	@FXML
	private TextField semestreActualTextField;
	@FXML
	private TextField carreraPertenecienteTextField;
	
	@FXML
	private Button guardarAsignaturaButton;
	@FXML
	private Button registrarCarrera;
	
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
	* Metodo para modificar la persona
	*/
	@FXML
	private void fijarAsignatura() {
		
		String codigo=codigoTextField.getText();
		String nombre=nombreTextField.getText().trim();
		int numeroDeCreditos=Integer.parseInt(numeroDeCreditosTextField.getText());
		int intensidadHoraria= Integer.parseInt(intensidadHorariaTextField.getText());
		int tipoDeAsignatura= Integer.parseInt(tipoDeAsignaturaTextField.getText());
		int semestreActual= Integer.parseInt(semestreActualTextField.getText());
		String carreraPerteneciente=carreraPertenecienteTextField.getText();
		
		miVentanaPrincipal.inicializarAsignatura(codigo, nombre, carreraPerteneciente, numeroDeCreditos, intensidadHoraria
													, tipoDeAsignatura, semestreActual);
		cliqueado=true;
		
		miVentanaPrincipal.mostrarVistaAsignatura();
				
	}
	
	@FXML
	private void mostrarVentanaCarrera() {
		
		miVentanaPrincipal.mostrarVistaCarrera();
		
		cliqueado=true;
	}
	
	@FXML
	private void mostrarVentanaProfesor() {
		
		miVentanaPrincipal.mostrarVistaProfesor();
		
		cliqueado=true;
	}
	
	

}
