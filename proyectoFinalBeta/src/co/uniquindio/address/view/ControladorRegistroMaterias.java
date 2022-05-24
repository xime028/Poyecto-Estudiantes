package co.uniquindio.address.view;

import java.awt.Button;

import co.uniquindio.address.Principal;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControladorRegistroMaterias {
	
	@FXML
	private TextField numeroRegistroTextField;
	@FXML
	private TextField fechaTextField;
	@FXML
	private TextField nombreEstudianteTextField;
	@FXML
	private TextField periodoRegistroTextField;
	@FXML
	private Button registrarEstudianteButton;
	
	@FXML
	private Button registrarMateriasButton;
	
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
		public void fijarRegistro() {
			
			int numeroRegistro=Integer.parseInt(numeroRegistroTextField.getText());
			String fecha=fechaTextField.getText();
			String nombreEstudiante=nombreEstudianteTextField.getText();
			String periodoRegistro=periodoRegistroTextField.getText();
			
			miVentanaPrincipal.inicializarRegistro(numeroRegistro, fecha, nombreEstudiante, periodoRegistro);
			
			cliqueado=true;
		}
		
		@FXML
		public void mostrarVentanaMateriasARegistrar() {
			
			miVentanaPrincipal.mostrarVistaMateriasARegistrar();
			
			cliqueado=true;
		}
		

}
