package co.uniquindio.address.model;

import java.util.ArrayList;

public class Asignatura {
	
	//Atributos de la clase
	
		private String codigo;
		private String nombre;
		private int numeroDeCreditos;
		private int intensidadHoraria;
		private int tipoAsignatura;
		private int semestreActual;
		private ArrayList<Profesor>listaProfesores=new ArrayList<>();

		public Asignatura() 
		{
			
		}

		
		
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
		 * @return the numeroDeCreditos
		 */
		public int getNumeroDeCreditos() {
			return numeroDeCreditos;
		}



		/**
		 * @param numeroDeCreditos the numeroDeCreditos to set
		 */
		public void setNumeroDeCreditos(int numeroDeCreditos) {
			this.numeroDeCreditos = numeroDeCreditos;
		}



		/**
		 * @return the intensidadHoraria
		 */
		public int getIntensidadHoraria() {
			return intensidadHoraria;
		}



		/**
		 * @param intensidadHoraria the intensidadHoraria to set
		 */
		public void setIntensidadHoraria(int intensidadHoraria) {
			this.intensidadHoraria = intensidadHoraria;
		}



		/**
		 * @return the tipoAsignatura
		 */
		public int getTipoAsignatura() {
			return tipoAsignatura;
		}



		/**
		 * @param tipoAsignatura the tipoAsignatura to set
		 */
		public void setTipoAsignatura(int tipoAsignatura) {
			this.tipoAsignatura = tipoAsignatura;
		}



		/**
		 * @return the semestreActual
		 */
		public int getSemestreActual() {
			return semestreActual;
		}



		/**
		 * @param semestreActual the semestreActual to set
		 */
		public void setSemestreActual(int semestreActual) {
			this.semestreActual = semestreActual;
		}


		
		/**
		 * @param codigo
		 * @param nombre
		 * @param numeroDeCreditos
		 * @param intensidadHoraria
		 * @param tipoAsignatura
		 * @param semestreActual
		 * @param profesor
		 */

	public void fijarAsignatura(String codigo,String nombre,int numeroDeCreditos,int intensidadHoraria,
								int tipoAsignatura,int semestreActual)
	{
		this.codigo = codigo;
		this.nombre = nombre;
		this.numeroDeCreditos = numeroDeCreditos;
		this.intensidadHoraria = intensidadHoraria;
		this.tipoAsignatura = tipoAsignatura;
		this.semestreActual = semestreActual;


	}
	
	public void añadirProfesorAsignatura(Profesor profesor)
	{
		listaProfesores.add(profesor);
		System.out.println("Profesor agregado");
	}



		@Override
		public String toString() 
		
		{
			return "Asignatura [codigo=" + codigo + ", nombre=" + nombre + ", numeroDeCreditos=" + numeroDeCreditos
					+ ", intensidadHoraria=" + intensidadHoraria + ", tipoAsignatura=" + tipoAsignatura
					+ ", semestreActual=" + semestreActual + "]";
		}
		
		
	
	
	


		
}
