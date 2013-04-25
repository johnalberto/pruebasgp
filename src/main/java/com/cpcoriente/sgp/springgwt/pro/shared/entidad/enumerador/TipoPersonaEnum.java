package com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador;

public enum TipoPersonaEnum {
	
	PERSONA_NATURAL(1,"tipoPersonaEnum.persona.tipo.natural"),
	PERSONA_JURIDICA(2,"tipoPersonaEnum.persona.tipo.juridica"),
	PERSONA_ESTATAL(3,"tipoPersonaEnum.persona.estatal");

	private int valor;
    private String nameToken;

    TipoPersonaEnum(int valor, String nameToken) {
        this.valor = valor;
        this.nameToken = nameToken;
    }

    
    public static TipoPersonaEnum tomarTipoPorValor(int valor) {
    	
		if (valor == PERSONA_NATURAL.getValor()) {
			return PERSONA_NATURAL;
		}
		if (valor == PERSONA_JURIDICA.getValor()) {
			return PERSONA_JURIDICA;
		}

		if (valor == PERSONA_JURIDICA.getValor()) {
			return PERSONA_ESTATAL;
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
