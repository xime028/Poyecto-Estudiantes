
package co.uniquindio.address;

import java.io.IOException;

import co.uniquindio.address.model.*;
import co.uniquindio.address.view.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Principal extends Application {
	
	/**
	 * Se declaran los atributos
	 */
		private Stage escenarioPrincipal;
	    private BorderPane layoutRaiz;
	    private Carrera miCarreraNueva;
	    private Asignatura miAsignatura;
	    private Estudiante estudiante;
	    private Profesor profesor;
	    private RegistroDeMaterias registro;
	  /**
	   * Se declara una referencia a la clase principal del mundo de la lógica
	   */
	    private Facultad miFacultad;
	    
	  /**
	   * Metodo start
	   */
	    @Override
	    public void start(Stage primaryStage) {
	    	
	    	miFacultad=new Facultad();
	    	miCarreraNueva=new Carrera();
	    	miAsignatura= new Asignatura();
	    	estudiante= new Estudiante();
	    	profesor= new Profesor();
	    	registro= new RegistroDeMaterias();
	        this.escenarioPrincipal = primaryStage;
	        this.escenarioPrincipal.setTitle("Aplicación sobre un estudiante");
	        inicializarLayoutRaiz();
	        mostrarVistaFacultad();
	    }
	    
	    /**
	     * Inicializa el layout raiz
	     */
	    public void inicializarLayoutRaiz() {
	        try {
	            // Carga el root layout desde un archivo xml
	            FXMLLoader cargador = new FXMLLoader();
	            cargador.setLocation(Principal.class.getResource("view/LayoutRaiz.fxml"));
	            layoutRaiz = (BorderPane) cargador.load();
	            // Muestra la escena que contiene el RootLayout
	            Scene scene = new Scene(layoutRaiz);
	            escenarioPrincipal.setScene(scene);
	            escenarioPrincipal.show();
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	    
	    public void mostrarVistaFacultad() {
	    	
	    	try {
	    		// Carga la vista de la persona.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(Principal.class.getResource("view/FacultadVista.fxml"));
	            AnchorPane vistaFacultad = (AnchorPane) loader.load();
	         // Fija la vista de la person en el centro del root layout.
	            layoutRaiz.setCenter(vistaFacultad);
	         // Acceso al controlador.
	            ControladorFacultad miControlador = loader.getController();
	            miControlador.setMiVentanaPrincipal(this);
	    	}catch (IOException e) {
	            System.out.println(e.getMessage()); 
	        }
	    }
	    
	    public void mostrarVistaCarrera() {
	    	
	    	try {
	    		// Carga la vista de la persona.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(Principal.class.getResource("view/CarreraVista.fxml"));
	            AnchorPane vistaCarrera = (AnchorPane) loader.load();
	         // Fija la vista de la person en el centro del root layout.
	            layoutRaiz.setCenter(vistaCarrera);
	         // Acceso al controlador.
	            ControladorCarrera miControlador = loader.getController();
	            miControlador.setMiVentanaPrincipal(this);
	    	}catch (IOException e) {
	            System.out.println(e.getMessage()); 
	        }
	    }
	    
	    public void mostrarVistaAsignatura() {
	    	
	    	try {
	    		// Carga la vista de la persona.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(Principal.class.getResource("view/AsignaturaVista.fxml"));
	            AnchorPane vistaAsignatura = (AnchorPane) loader.load();
	         // Fija la vista de la person en el centro del root layout.
	            layoutRaiz.setCenter(vistaAsignatura);
	         // Acceso al controlador.
	            ControladorAsignatura miControlador = loader.getController();
	            miControlador.setMiVentanaPrincipal(this);
	    	}catch (IOException e) {
	            System.out.println(e.getMessage()); 
	        }
	    }
	    
	    public void mostrarVistaProfesor() {
	    	
	    	try {
	    		// Carga la vista de la persona.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(Principal.class.getResource("view/ProfesorVista.fxml"));
	            AnchorPane vistaProfesor = (AnchorPane) loader.load();
	         // Fija la vista de la person en el centro del root layout.
	            layoutRaiz.setCenter(vistaProfesor);
	         // Acceso al controlador.
	            ControladorProfesor miControlador = loader.getController();
	            miControlador.setMiVentanaPrincipal(this);
	    	}catch (IOException e) {
	            System.out.println(e.getMessage()); 
	        }
	    }
	    
	    public void mostrarVistaEstudiante() {
	    	
	    	try {
	    		// Carga la vista de la persona.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(Principal.class.getResource("view/EstudianteVista.fxml"));
	            AnchorPane vistaEstudiante = (AnchorPane) loader.load();
	         // Fija la vista de la person en el centro del root layout.
	            layoutRaiz.setCenter(vistaEstudiante);
	         // Acceso al controlador.
	            ControladorEstudiante miControlador = loader.getController();
	            miControlador.setMiVentanaPrincipal(this);
	    	}catch (IOException e) {
	            System.out.println(e.getMessage()); 
	        }
	    }
	    
	    
    public void mostrarVistaRegistroDeMaterias() {
	    	
	    	try {
	    		// Carga la vista de la persona.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(Principal.class.getResource("view/RegistroMateriasVista.fxml"));
	            AnchorPane vistaRegistroDeMaterias = (AnchorPane) loader.load();
	         // Fija la vista de la person en el centro del root layout.
	            layoutRaiz.setCenter(vistaRegistroDeMaterias);
	         // Acceso al controlador.
	            ControladorRegistroMaterias miControlador = loader.getController();
	            miControlador.setMiVentanaPrincipal(this);
	    	}catch (IOException e) {
	            System.out.println(e.getMessage()); 
	        }
	 }
    
    public void mostrarVistaMateriasARegistrar() {
    	
    	try {
    		// Carga la vista de la persona.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Principal.class.getResource("view/materiasARegistrarVista.fxml"));
            AnchorPane vistaMateriasARegistrar = (AnchorPane) loader.load();
         // Fija la vista de la person en el centro del root layout.
            layoutRaiz.setCenter(vistaMateriasARegistrar);
         // Acceso al controlador.
            ControladorMateriasARegistrar miControlador = loader.getController();
            miControlador.setMiVentanaPrincipal(this);
    	}catch (IOException e) {
            System.out.println(e.getMessage()); 
        }
 }
	    
	          
	public static void main(String[] args) {
		launch(args);
	}
	
	/**
	 * Devuelve el escenario principal
	 * @return el escenarioPrincipal
	 */
	public Stage getEscenarioPrincipal() {
		return escenarioPrincipal;
	}
	/**
	 * Permite fijar el escenario principal 
	 * @param escenarioPrincipal
	 */
	public void setEscenarioPrincipal(Stage escenarioPrincipal) {
		this.escenarioPrincipal = escenarioPrincipal;
	}
	
	public void inicializarCarrera(String codigo, String nombre, int duracionSemestre) {
		miCarreraNueva=new Carrera();
		miCarreraNueva.fijarCarrera(codigo, nombre, duracionSemestre);	
		miFacultad.añadirCarrera(miCarreraNueva);
		
	}
	
	public void inicializarAsignatura(String codigo, String nombre, String nombreCarrera, int numeroDeCreditos, int intensidadHoraria,int tipoDeAsignatura,int semestreActual) 
	{
		miAsignatura=new Asignatura();
		miAsignatura.fijarAsignatura(codigo, nombre, numeroDeCreditos,intensidadHoraria,tipoDeAsignatura,semestreActual);
		
		miFacultad.añadirAsignaturaEnCarrera(miAsignatura, nombreCarrera);
	}
	
	public void inicializarEstudiante(String cedula, String nombre, String fechaDeNacimiento,String nombreCarrera)
	{
		estudiante=new Estudiante();
		estudiante.fijarEstudiante(cedula, nombre, fechaDeNacimiento, nombreCarrera);
		
		miFacultad.añadirEstudianteCarrera(estudiante,nombreCarrera);
	}
	
	public void inicializarProfesor(String cedula, String nombre, String profesion, String maximoNivelDeEstudio,String nombreAsignatura) 
	{
		
		profesor=new Profesor();
		profesor.fijarProfesor(cedula, nombre, profesion, maximoNivelDeEstudio);
		
		miFacultad.añadirProfesorAsignatura(profesor, nombreAsignatura);
	}
	
	public void inicializarRegistro(int numeroRegistro, String fecha, String nombreEstudiante, String periodoRegistro) {
		
		registro=new RegistroDeMaterias();
		registro.fijarRegistroDeMaterias(numeroRegistro, fecha, periodoRegistro);
		
		miFacultad.agregarRegistroEstudiante(registro, nombreEstudiante);	
	}
	
	public void aplicarRegistroMateriaEstudiante(String nombreEstudiante, String nombreAsignatura) {
		
		miFacultad.hacerRegistroMateriasEstudiante(nombreEstudiante, nombreAsignatura);
	}

}
