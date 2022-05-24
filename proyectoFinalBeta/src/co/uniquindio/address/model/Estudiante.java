package co.uniquindio.address.model;


public class Estudiante {
	
	private String cedula;
	private String nombre;
	private String fechaDeNacimiento;
	private String carrera;
    private RegistroDeMaterias registro;

	
	public Estudiante()
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
	 * @return the fechaDeNacimiento
	 */
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	/**
	 * @param fechaDeNacimiento the fechaDeNacimiento to set
	 */
	public void setFechaDeNacimiento(String  fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	/**
	 * @return the carrera
	 */
	public String getCarrera() {
		return carrera;
	}

	/**
	 * @param carrera the carrera to set
	 */
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	

	/**
	 * @return the registro
	 */
	public RegistroDeMaterias getRegistro() {
		return registro;
	}

	/**
	 * @param registro the registro to set
	 */
	public void setRegistro(RegistroDeMaterias registro) {
		this.registro = registro;
	}

	/**
	 * @param cedula
	 * @param nombre
	 * @param fechaDeNacimiento
	 * @param carrera
	 */
	public void fijarEstudiante(String cedula, String nombre, String fechaDeNacimiento, String carrera) 
	{
			this.cedula = cedula;
			this.nombre = nombre;
			this.fechaDeNacimiento = fechaDeNacimiento;
			this.carrera = carrera;
	
	}
	
	public void asignarAsignaturaRegistro(Asignatura asignaturaRegistro) {
		
		registro.añadirAsignaturaRegistro(asignaturaRegistro);
	}
	
	
	

}
