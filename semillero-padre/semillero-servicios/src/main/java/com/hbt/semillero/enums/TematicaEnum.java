package com.hbt.semillero.enums;

/**
 * 
 * <b>Descripción:<b> Clase que determina la enumeración de los tipos 
 * de tematica aceptados por un comic
 * <b>Caso de Uso:<b> 
 * @author Angie
 * @version
 */

public enum TematicaEnum {

	AVENTURAS("enum.tematica.aventuras"),
	BELICO("enum.tematica.belico"),
	HUMORISTICO("enum.tematica..humoristico"), 
	DEPORTIVO("enum.tematica.deportivo"), 
	FANTASTICO("enum.tematica.fantastico"), 
	CIENCIA_FICCION("enum.tematica.ciencia_ficcion"), 
	HISTORICO("enum.tematica.historico"),
	HORROR("enum.tematica.horror");
	
	private String descripcion;
	
	

	private TematicaEnum(String descripcion) {
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
