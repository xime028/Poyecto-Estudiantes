package co.uniquindio.address.model;

import java.util.ArrayList;

public class Carrera 
{
	//Atributos de la clase
	
		private String codigo;
		private String nombre;
		private int duracionSemestre;
		private ArrayList<Asignatura>listaAsignaturasCarrera=new ArrayList<>();

		
		/**
		 * @return the codigo
		 */
		public String getCodigo() {
			return codigo;
		}
		/**
		 * @param codigo the codigo to set
		 */
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}
		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/**
		 * @return the duracionSemestre
		 */
		public int getDuracionSemestre() {
			return duracionSemestre;
		}
		/**
		 * @param duracionSemestre the duracionSemestre to set
		 */
		public void setDuracionSemestre(int duracionSemestre) {
			this.duracionSemestre = duracionSemestre;
		}
		
		public ArrayList<Asignatura> getListaAsignaturasCarrera() {
			return listaAsignaturasCarrera;
		}
		
		public void setListaAsignaturasCarrera(ArrayList<Asignatura> listaAsignaturasCarrera) {
			this.listaAsignaturasCarrera = listaAsignaturasCarrera;
			fijarCarrera(codigo, nombre, duracionSemestre);
		}
		
		/**
		 * @param codigo
		 * @param nombre
		 * @param duracionSemestre
		 */
		public void fijarCarrera(String codigo, String nombre, int duracionSemestre) 
		{	
			this.codigo = codigo;
			this.nombre = nombre;
			this.duracionSemestre = duracionSemestre;
	
		}
		
		public boolean buscarAsignturaCarrera(Asignatura asignatura) {
			
			String nombreAsignaturaNueva=asignatura.getNombre();
			
			for(int i=0;i<listaAsignaturasCarrera.size();i++) {
				
				if(listaAsignaturasCarrera.get(i)!=null) {
					
					if(listaAsignaturasCarrera.get(i).getNombre().equals(nombreAsignaturaNueva)) 
					{
						return false;
					}
				}
			}
			
			return true;
		}
		
		
		public void añadirAsignatura(Asignatura asignatura)
		{
			boolean encontrado;
			
			for(int i=0;i<listaAsignaturasCarrera.size();i++) 
			{
				
				if(listaAsignaturasCarrera.get(0)==null) 
				{
					listaAsignaturasCarrera.add(asignatura);
					System.out.println("Materia agregada");
				}
				else {
					
					encontrado=buscarAsignturaCarrera(asignatura);
					
					if(listaAsignaturasCarrera.get(i+1)==null)
					{
						if(encontrado==true) {
						
						listaAsignaturasCarrera.add(asignatura);
						System.out.println("Materia agregada");
					}
					else {
						System.out.println("Materia repetida");
					}
				}
			}
		}
	}
		
		
		public boolean añadirProfesorAsignatura(Profesor profesor, String nombreAsignatura) {
			
			for(int i=0;i<listaAsignaturasCarrera.size();i++) {
				
				if(listaAsignaturasCarrera.get(i)!=null) {
					
					if(listaAsignaturasCarrera.get(i).getNombre().equals(nombreAsignatura)) {
						
						listaAsignaturasCarrera.get(i).añadirProfesorAsignatura(profesor);
						
						return true;
					}
					
				}
				
			}
			
			return false;
		}
		
		public Asignatura buscarAsignatura(String nombreAsignatura) {
			
			for(int i=0;i<listaAsignaturasCarrera.size();i++) {
				
				if(listaAsignaturasCarrera.get(i).getNombre().equals(nombreAsignatura)) {
					
					return listaAsignaturasCarrera.get(i);
				}
			}
			
			return null;
		}
		
		
		
		@Override
		public String toString() {
			return "Carrera [codigo=" + codigo + ", nombre=" + nombre + ", duracionSemestre=" + duracionSemestre + "]";
		}		
		
		
		
}
