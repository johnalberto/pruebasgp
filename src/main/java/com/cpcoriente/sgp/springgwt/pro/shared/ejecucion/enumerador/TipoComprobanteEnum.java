package com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.enumerador;


public enum TipoComprobanteEnum {

	
	COMPROBANTE_INGRESO(1,"tipoComprobanteEnum.comprobante.ingreso"),
	COMPROVANTE_EGRESO(2,"tipoComprobanteEnum.comprobante.egreso"),
	NOTA_DEBITO(3,"tipoComprobanteEnum.nota.debito"),
	NOTA_CREDITO(4,"tipoComprobanteEnum.nota.credito"),
	NOTA_CONTABILIDAD(5,"tipoComprobanteEnum.nota.contabilidad");
	
	private int valor;
    private String nameToken;

    TipoComprobanteEnum(int valor, String nameToken) {
        this.valor = valor;
        this.nameToken = nameToken;
    }

    
    public static TipoComprobanteEnum tomarTipoPorValor(int valor) {
    	
		if (valor == COMPROBANTE_INGRESO.getValor()) {
			return COMPROBANTE_INGRESO;
		}
		if (valor == COMPROVANTE_EGRESO.getValor()) {
			return COMPROVANTE_EGRESO;
		}
		if (valor == NOTA_DEBITO.getValor()) {
			return NOTA_DEBITO;
		}
		if (valor == NOTA_CREDITO.getValor()) {
			return NOTA_CREDITO;
		}
		if (valor == NOTA_CONTABILIDAD.getValor()) {
			return NOTA_CONTABILIDAD;
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
