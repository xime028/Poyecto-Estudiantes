package co.edu.uniquindio.aerollinea.model;

import java.util.ArrayList;


import co.edu.uniquindio.aerollinea.exceptions.PasajeroException;
import co.edu.uniquindio.aerollinea.model.services.IModelServices;

public class Aerolinea implements IModelServices {
	private String nombre;
	private Tiquete tiquete;
	private Vuelo vuelo;
	private ArrayList<Pasajero>listaPasajeros;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Tiquete getTiquete() {
		return tiquete;
	}
	public void setTiquete(Tiquete tiquete) {
		this.tiquete = tiquete;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	public ArrayList<Pasajero> getListaPasajeros() {
		return listaPasajeros;
	}
	public void setListaPasajeros(ArrayList<Pasajero> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}
	public void crearPasajeroPasajero(String nombre, String apellido, String cedula, String ciudad, String telefono,
			String fechaNacimiento) throws PasajeroException {
		Pasajero nuevoPasajero= null;
		Pasajero pasajeroExistente= obtenerPasajero(cedula);
		if(pasajeroExistente != null) {
			throw new PasajeroException("El empleado con numero de cedula "+cedula+" no se puede crear. Ya existe ");
		}
		else {
		     nuevoPasajero = new Pasajero(nombre, apellido, cedula, ciudad, telefono, fechaNacimiento);
				getListaPasajeros().add(nuevoPasajero);

		}
		
		
		
		
		}
	@Override
	public Pasajero obtenerPasajero(String cedula) {
		// TODO Auto-generated method stub
		Pasajero pasajeroEncontrado= null;
		for(Pasajero pasajero : getListaPasajeros()) {
			if(pasajero.getCedula().equalsIgnoreCase(cedula)) {
				pasajeroEncontrado=pasajero;
				break;
			}
		}
		return pasajeroEncontrado;
	}
	
	

}
