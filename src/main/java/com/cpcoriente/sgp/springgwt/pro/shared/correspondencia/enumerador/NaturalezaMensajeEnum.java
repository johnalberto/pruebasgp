package com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.enumerador;

public enum NaturalezaMensajeEnum {
	
	FISICO(1,"naturalezaMensajeEnum.mensaje.estado.fisico"),
	DIGITAL(2,"naturalezaMensajeEnum.mensaje.estado.digital");
	
	
	private int valor;
    private String nameToken;

    NaturalezaMensajeEnum(int valor, String nameToken) {
        this.valor = valor;
        this.nameToken = nameToken;
    }

    
    public static NaturalezaMensajeEnum tomarTipoPorValor(int valor) {
    	
		if (valor == FISICO.getValor()) {
			return FISICO;
		}
		if (valor == DIGITAL.getValor()) {
			return DIGITAL;
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
