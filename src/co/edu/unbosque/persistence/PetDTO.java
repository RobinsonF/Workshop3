package co.edu.unbosque.persistence;

import java.util.Date;

public class PetDTO {
	
	private String caso = "";
	private String especie = "";
	private String tamaño = "";
	private String localidad = "";
	private String direccion = "";
	private String nombrePersona = "";
	private String telefonoPersona = "";
	private String emailPersona = "";
	private String comentariPersona = "";
	private String fecha;
	/**
	 * 
	 */
	public PetDTO() {
		
	}
	
	
	/**
	 * @return the caso
	 */
	public String getCaso() {
		return caso;
	}


	/**
	 * @param caso the caso to set
	 */
	public void setCaso(String caso) {
		this.caso = caso;
	}


	/**
	 * @return the especie
	 */
	public String getEspecie() {
		return especie;
	}


	/**
	 * @param especie the especie to set
	 */
	public void setEspecie(String especie) {
		this.especie = especie;
	}


	/**
	 * @return the tamaño
	 */
	public String getTamaño() {
		return tamaño;
	}


	/**
	 * @param tamaño the tamaño to set
	 */
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}


	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}


	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	/**
	 * @return the dirección
	 */
	public String getDireccion() {
		return direccion;
	}


	/**
	 * @param dirección the dirección to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	/**
	 * @return the nombrePersona
	 */
	public String getNombrePersona() {
		return nombrePersona;
	}


	/**
	 * @param nombrePersona the nombrePersona to set
	 */
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}


	/**
	 * @return the telefonoPersona
	 */
	public String getTelefonoPersona() {
		return telefonoPersona;
	}


	/**
	 * @param telefonoPersona the telefonoPersona to set
	 */
	public void setTelefonoPersona(String telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}


	/**
	 * @return the emailPersona
	 */
	public String getEmailPersona() {
		return emailPersona;
	}


	/**
	 * @param emailPersona the emailPersona to set
	 */
	public void setEmailPersona(String emailPersona) {
		this.emailPersona = emailPersona;
	}


	/**
	 * @return the comentariPersona
	 */
	public String getComentariPersona() {
		return comentariPersona;
	}


	/**
	 * @param comentariPersona the comentariPersona to set
	 */
	public void setComentariPersona(String comentariPersona) {
		this.comentariPersona = comentariPersona;
	}


	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}


	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	

}
