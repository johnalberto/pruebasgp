package com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador;

public enum EstadoProductoEnum {

	EJECUCION(1,"estadoproducto.ejecucion"),
	TERMINADO(2,"estadoproducto.terminado"),
	CANCELADO(3,"estadoproducto.cancelado"),
	CAMBIADO(4,"estadoproducto.cambiado");
	
	
	 private int valor;
	    private String nameToken;

	    EstadoProductoEnum(int valor, String nameToken) {
	        this.valor = valor;
	        this.nameToken = nameToken;
	    }
	
	    
	    public static EstadoProductoEnum tomarTipoPorValor(int valor) {
	    	
 		if (valor == EJECUCION.getValor()) {
				return EJECUCION;
			}
			if (valor == TERMINADO.getValor()) {
				return TERMINADO;
			}   
			if (valor == CANCELADO.getValor()) {
				return CANCELADO;
			} 
			if (valor == CAMBIADO.getValor()) {
				return CAMBIADO;
			} 
		
			return null;
			
 }

 public String getNameToken() {
     return nameToken;
 }

 public int getValor() {
     return valor;
 }
	
	
}
