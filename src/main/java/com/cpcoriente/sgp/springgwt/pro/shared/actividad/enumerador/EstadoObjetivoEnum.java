package com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador;

public enum EstadoObjetivoEnum {

	
	ACTIVO(1,"estadoobjetivo.activo"),
	CANCELADO(2,"estadoobjetivo.cancelado");
	
	private int valor;
    private String nameToken;

    EstadoObjetivoEnum(int valor, String nameToken) {
        this.valor = valor;
        this.nameToken = nameToken;
    }

    
    public static EstadoObjetivoEnum tomarTipoPorValor(int valor) {
    	
		if (valor == ACTIVO.getValor()) {
			return ACTIVO;
		}
		if (valor == CANCELADO.getValor()) {
			return CANCELADO;
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
