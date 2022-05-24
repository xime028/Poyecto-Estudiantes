package co.uniquindio.address.model;

import java.util.ArrayList;


public class RegistroDeMaterias {
	
	private int numeroDeRegistro;
	private String fechaDeRegistro;
	private Asignatura materiasRegistradas[]=new Asignatura[6];
	private String periodoDeRegistro;
	
	public RegistroDeMaterias()
	{
		
	}
	/**
	 * @return the numeroDeRegistro
	 */
	public int getNumeroDeRegistro() {
		return numeroDeRegistro;
	}
	/**
	 * @param numeroDeRegistro the numeroDeRegistro to set
	 */
	public void setNumeroDeRegistro(int numeroDeRegistro) {
		this.numeroDeRegistro = numeroDeRegistro;
	}
	/**
	 * @return the fechaDeNacimiento
	 */
	public String getFechaDeRegistro() {
		return fechaDeRegistro;
	}
	/**
	 * @param fechaDeNacimiento the fechaDeNacimiento to set
	 */
	public void setFechaDeNacimiento(String fechaDeRegistro) {
		this.fechaDeRegistro = fechaDeRegistro;
	}
	/**
	 * @return the periodoDeRegistro
	 */
	public String getPeriodoDeRegistro() {
		return periodoDeRegistro;
	}
	/**
	 * @param periodoDeRegistro the periodoDeRegistro to set
	 */
	public void setPeriodoDeRegistro(String periodoDeRegistro) {
		this.periodoDeRegistro = periodoDeRegistro;
	}
	/**
	 * @param numeroDeRegistro
	 * @param fechaDeNacimiento
	 * @param estudiante
	 * @param periodoDeRegistro
	 */
	public void fijarRegistroDeMaterias(int numeroDeRegistro, String fechaDeRegistro,String periodoDeRegistro) 
	{
		this.numeroDeRegistro = numeroDeRegistro;
		this.fechaDeRegistro = fechaDeRegistro;
		this.periodoDeRegistro = periodoDeRegistro;
		
	}
	
	public void añadirAsignaturaRegistro(Asignatura asignaturaRegistro) {
		
		for(int i=0;i<materiasRegistradas.length;i++) {
			
			if(materiasRegistradas[i]==null) {
				
				materiasRegistradas[i]=asignaturaRegistro;
			}
		}
	}
	
}
