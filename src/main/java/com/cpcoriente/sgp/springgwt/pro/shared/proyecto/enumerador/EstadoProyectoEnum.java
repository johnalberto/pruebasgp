package com.cpcoriente.sgp.springgwt.pro.shared.proyecto.enumerador;


public enum EstadoProyectoEnum {

	EJECUCION(1,"estadoproyecto.ejecucion"),
	TERMINADO(2,"estadoproyecto.terminado"),
	CANCELADO(3,"estadoproyecto.cancelado"),
	PARADO(4,"estadoproyecto.parado");

	
	 private int valor;
	    private String nameToken;

	    EstadoProyectoEnum(int valor, String nameToken) {
	        this.valor = valor;
	        this.nameToken = nameToken;
	    }
	
	    
	    public static EstadoProyectoEnum tomarTipoPorValor(int valor) {
	    	
    		if (valor == EJECUCION.getValor()) {
				return EJECUCION;
			}
			if (valor == TERMINADO.getValor()) {
				return TERMINADO;
			}   
			if (valor == CANCELADO.getValor()) {
				return CANCELADO;
			} 
			if (valor == PARADO.getValor()) {
				return PARADO;
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
