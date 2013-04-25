package com.cpcoriente.sgp.springgwt.pro.shared.financiero.enumerador;


public enum TipoUnidadEnum {

	
	TIEMPO(1,"tipoUnidadEnum.tipo.global"),
	DINERO(2,"tipoUnidadEnum.tipo.hora"),
	LONGITUD(3,"tipoUnidadEnum.tipo.dia"),
	MASA(4,"tipoUnidadEnum.tipo.semana"),
	VOLUMEN(5,"tipoUnidadEnum.tipo.mes");
	
	private int valor;
    private String nameToken;

    TipoUnidadEnum(int valor, String nameToken) {
        this.valor = valor;
        this.nameToken = nameToken;
    }

    public static TipoUnidadEnum tomarTipoPorValor(int valor) {
    	
    		if (valor == TIEMPO.getValor()) {
				return TIEMPO;
			}
			if (valor == DINERO.getValor()) {
				return DINERO;
			}
			if (valor == LONGITUD.getValor()) {
				return LONGITUD;
			}
			if (valor == MASA.getValor()) {
				return MASA;
			}
			if (valor == VOLUMEN.getValor()) {
				return VOLUMEN;
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
