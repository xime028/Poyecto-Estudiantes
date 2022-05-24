package co.uniquindio.address.model;

import java.util.ArrayList;

public class Facultad {
	
	private Carrera listaCarreras[]=new Carrera[5];
	private ArrayList<Estudiante>listaEstudiantes=new ArrayList<>();

	
	public Facultad() {
		
	}
	
	public Carrera[] getListaCarreras() {
		return listaCarreras;
	}
	public void setListaCarreras(Carrera[] listaCarreras) {
		this.listaCarreras = listaCarreras;
	}
	public ArrayList<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}
	public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}
	


	
	public boolean añadirCarrera(Carrera carrera) {
		
		boolean encontrado=buscarCarrera(carrera);
		
		for(int i=0;i<listaCarreras.length;i++) {
			
			if(listaCarreras[i]==null) {
				
				if(encontrado==true) {
					
					listaCarreras[i]=carrera;
					System.out.println("Carrera agregada");
					return true;
				}
				else {
					
					System.out.println("Carrera repetida");
					return false;
				}
			}
				
		}
		System.out.println("Lista de carreras llena");
		return false;
	}
		
	
	
	public boolean buscarCarrera(Carrera carrera) {
		
		String nombreCarreraNueva=carrera.getNombre();
		
		for(int i=0;i<listaCarreras.length;i++) {
			
			if(listaCarreras[i]!=null) {
				
				if(listaCarreras[i].getNombre().equals(nombreCarreraNueva)) {
					
					return false;
				}
			}
		}
		
		return true;
	}
	
	public boolean añadirAsignaturaEnCarrera(Asignatura miAsignatura, String nombreCarrera) {
		
		for(int i=0;i<listaCarreras.length;i++) {
			
			if(listaCarreras[i]!=null) {
				
				if(listaCarreras[i].getNombre().equals(nombreCarrera)) {
					
					listaCarreras[i].añadirAsignatura(miAsignatura);
					
					return true;
				}
				
			}
			
		}
		
		System.out.println("Asignatura no agregada");
		return false;
	}
	
	public boolean añadirProfesorAsignatura(Profesor profesor,String nombreAsignatura)
	{
		for(int i=0;i<listaCarreras.length;i++)
		{
			if(listaCarreras[i]!=null)
			{
				listaCarreras[i].añadirProfesorAsignatura(profesor, nombreAsignatura);
				
			}

		}
		
		return true;
		
	}
	
	
	public boolean añadirEstudianteCarrera(Estudiante estudiante,String nombreCarrera)
	{
		
		for(int i=0;i<listaCarreras.length;i++) 
		{
			if(listaCarreras[i]!=null) 
				{
					if(listaCarreras[i].getNombre().equals(nombreCarrera))
					{
						listaEstudiantes.add(estudiante);
						System.out.println("Estudiante agregado");
						return true;
						
					}
				}
				
			}	
		System.out.println("Carrera no encontrada");
		return false;
	}
	
	public boolean agregarRegistroEstudiante(RegistroDeMaterias registro, String nombreEstudiante) {
		
		for(int i=0;i<listaEstudiantes.size();i++) {
			
			if(listaEstudiantes.get(i)!=null) {
				
				if(listaEstudiantes.get(i).getNombre().equals(nombreEstudiante))
				{
					listaEstudiantes.get(i).setRegistro(registro);
					
					System.out.println("Registro exitoso");
					return true;
				}
			}
		}
		
		System.out.println("Estudiante no encontrado");
		return false;
	}
	
	public boolean hacerRegistroMateriasEstudiante(String nombreEstudiante, String nombreAsignatura) {
		
		Asignatura asignaturaRegistro=null;
		String nombreCarrera="";
		
		for(int i=0;i<listaEstudiantes.size();i++) {
			
			if(listaEstudiantes.get(i).getNombre().equals(nombreEstudiante)) {
				
				nombreCarrera=listaEstudiantes.get(i).getCarrera();
				
				for(int j=0;j<listaCarreras.length;j++) {
					
					if(listaCarreras[j]!=null) {
						
						if(listaCarreras[j].getNombre().equals(nombreCarrera)) {
							
							asignaturaRegistro=listaCarreras[j].buscarAsignatura(nombreAsignatura);
							
						}
					}
					
				}
				
				if(asignaturaRegistro!=null) {
					
					listaEstudiantes.get(i).asignarAsignaturaRegistro(asignaturaRegistro);
					
					System.out.println("Registro completado");
					return true;
				}
				else {
					
					System.out.println("Carrera para registrar la materia no encontrada");
				}
				
			}
			
		}
		
		System.out.println("Estudiante no encontrado");
		return false;
		
	}

}
