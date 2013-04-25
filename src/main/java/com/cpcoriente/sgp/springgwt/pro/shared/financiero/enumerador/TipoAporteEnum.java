package com.cpcoriente.sgp.springgwt.pro.shared.financiero.enumerador;

public enum TipoAporteEnum {
	
	FINANCIADO(1,"tipoAporteEnum.tipo.financiado"),
	CONTRAPARTIDA(2,"tipoAporteEnum.tipo.contrapartida"),
	OTROS(3,"tipoAporteEnum.tipo.otros");
	
	private int valor;
    private String nameToken;

    TipoAporteEnum(int valor, String nameToken) {
        this.valor = valor;
        this.nameToken = nameToken;
    }

    public static TipoAporteEnum tomarTipoPorValor(int valor) {
    	
    		if (valor == FINANCIADO.getValor()) {
				return FINANCIADO;
			}
			if (valor == CONTRAPARTIDA.getValor()) {
				return CONTRAPARTIDA;
			}
			if (valor == OTROS.getValor()) {
				return OTROS;
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
