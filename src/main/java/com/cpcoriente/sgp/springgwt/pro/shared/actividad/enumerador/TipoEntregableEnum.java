package com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador;


public enum TipoEntregableEnum {

	
	FISCO(1,"tipoEntregableEnum.fisico"),
	DOCUMENTO(2,"tipoEntregableEnum.documento"),
	ACTIVIDAD(3,"tipoEntregableEnum.actividad"),
	TECNOLOGICO(4,"tipoEntregableEnum.tecnologico");

	
	private int valor;
    private String nameToken;

    TipoEntregableEnum(int valor, String nameToken) {
        this.valor = valor;
        this.nameToken = nameToken;
    }

    
    public static TipoEntregableEnum tomarTipoPorValor(int valor) {
    	
		if (valor == FISCO.getValor()) {
			return FISCO;
		}
		if (valor == DOCUMENTO.getValor()) {
			return DOCUMENTO;
		}
		if (valor == ACTIVIDAD.getValor()) {
			return ACTIVIDAD;
		}
		if (valor == TECNOLOGICO.getValor()) {
			return TECNOLOGICO;
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
