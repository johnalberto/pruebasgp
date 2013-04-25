package com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.enumerador;

public enum PrioridadMensajeEnum {
	
	ALTA(1,"prioridadMensajeEnum.mensaje.prioridad.alda"),
	MEDIA(2,"prioridadMensajeEnum.mensaje.prioridad.media"),
	BAJA(3,"prioridadMensajeEnum.mensaje.prioridad.queja.baja");
	
	private int valor;
    private String nameToken;

    PrioridadMensajeEnum(int valor, String nameToken) {
        this.valor = valor;
        this.nameToken = nameToken;
    }

    
    public static PrioridadMensajeEnum tomarTipoPorValor(int valor) {
    	
		if (valor == ALTA.getValor()) {
			return ALTA;
		}
		if (valor == MEDIA.getValor()) {
			return MEDIA;
		}
		if (valor == BAJA.getValor()) {
			return BAJA;
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
