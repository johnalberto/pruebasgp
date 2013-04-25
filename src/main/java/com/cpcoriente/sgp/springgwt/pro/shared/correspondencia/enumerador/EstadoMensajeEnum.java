package com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.enumerador;

public enum EstadoMensajeEnum {
	
	ENVIADO(1,"estadoMensajeEnum.mensaje.estado.enviado"),
	RESPONDIDO(2,"estadoMensajeEnum.mensaje.estado.respondido");

	private int valor;
    private String nameToken;

    EstadoMensajeEnum(int valor, String nameToken) {
        this.valor = valor;
        this.nameToken = nameToken;
    }

    
    public static EstadoMensajeEnum tomarTipoPorValor(int valor) {
    	
		if (valor == ENVIADO.getValor()) {
			return ENVIADO;
		}
		if (valor == RESPONDIDO.getValor()) {
			return RESPONDIDO;
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
