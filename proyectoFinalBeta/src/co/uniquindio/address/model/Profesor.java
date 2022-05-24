package co.uniquindio.address.model;


public class Profesor {
	
	//Atributos de la clase
	
		private String cedula;
		private String nombre;
		private String profesion;
		private String maximoNivelDeEstudio;
		
		
		public Profesor()
		{
			
		}

		/**
		 * @return the cedula
		 */
		public String getCedula() {
			return cedula;
		}

		/**
		 * @param cedula the cedula to set
		 */
		public void setCedula(String cedula) {
			this.cedula = cedula;
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
		 * @return the profesion
		 */
		public String getProfesion() {
			return profesion;
		}

		/**
		 * @param profesion the profesion to set
		 */
		public void setProfesion(String profesion) {
			this.profesion = profesion;
		}

		/**
		 * @return the maximoNivelDeEstudio
		 */
		public String getMaximoNivelDeEstudio() {
			return maximoNivelDeEstudio;
		}

		/**
		 * @param maximoNivelDeEstudio the maximoNivelDeEstudio to set
		 */
		public void setMaximoNivelDeEstudio(String maximoNivelDeEstudio) {
			this.maximoNivelDeEstudio = maximoNivelDeEstudio;
		}
		
		

		/**
		 * @param cedula
		 * @param nombre
		 * @param profesion
		 * @param maximoNivelDeEstudio
		 */
		public void fijarProfesor(String cedula, String nombre, String profesion, String maximoNivelDeEstudio) 
		{	
			this.cedula = cedula;
			this.nombre = nombre;
			this.profesion = profesion;
			this.maximoNivelDeEstudio = maximoNivelDeEstudio;
		}

		@Override
		public String toString() {
			return "Profesor [cedula=" + cedula + ", nombre=" + nombre + ", profesion=" + profesion
					+ ", maximoNivelDeEstudio=" + maximoNivelDeEstudio + "]";
		}
		
}
