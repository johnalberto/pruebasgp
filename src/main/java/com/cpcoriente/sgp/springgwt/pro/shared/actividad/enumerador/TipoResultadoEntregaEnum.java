package com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador;


public enum TipoResultadoEntregaEnum {

	ACTIVIDAD_PRINCIPAL(1,"resultadoTipoEntregaEnum.actividad.principal"),
	ACTIVIDAD_SECUNDARIA_TAREA(2,"resultadoTipoEntregaEnum.actividad.secundaria");
	
	private int valor;
    private String nameToken;

    TipoResultadoEntregaEnum(int valor, String nameToken) {
        this.valor = valor;
        this.nameToken = nameToken;
    }

    
    public static TipoResultadoEntregaEnum tomarTipoPorValor(int valor) {
    	
		if (valor == ACTIVIDAD_PRINCIPAL.getValor()) {
			return ACTIVIDAD_PRINCIPAL;
		}
		if (valor == ACTIVIDAD_SECUNDARIA_TAREA.getValor()) {
			return ACTIVIDAD_SECUNDARIA_TAREA;
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
