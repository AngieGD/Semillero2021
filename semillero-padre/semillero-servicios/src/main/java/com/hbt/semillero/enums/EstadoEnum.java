package com.hbt.semillero.enums;

/**
 * 
 * <b>Descripción:<b> Clase que determina la enumeración del estado del comic
 * <b>Caso de Uso:<b> 
 * @author Angie
 * @version
 */

public enum EstadoEnum {
	
	ACTIVO("Activo"),
	INACTIVO("Inactivo");
	
	private String descripcion;
	
	

	/**
	 * Constructor de la clase.
	 * @param descripcion
	 */
	private EstadoEnum(String descripcion) {
		this.descripcion = descripcion;
	}



	/**
	 * Metodo encargado de retornar el valor del atributo descripcion
	 * @return El descripcion asociado a la clase
	 */
	public String getDescripcion() {
		return descripcion;
	}


	

}
