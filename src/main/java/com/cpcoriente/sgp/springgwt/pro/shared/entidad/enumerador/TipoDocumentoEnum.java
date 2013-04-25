package com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador;

public enum TipoDocumentoEnum {
	
	CEDULA(1,"tipoDocumentoEnum.entidad.tipo.cedula"),
	REGISTRO_CIVIL(2,"tipoDocumentoEnum.entidad.tipo.registro.civil"),
	CERTIFICADO_REGISTRADURIA_SIN_IDENTIFICACION(3,"tipoDocumentoEnum.entidad.tipo.certificado.registraduria.sin.identificacion"),
	NIT(4,"tipoDocumentoEnum.entidad.tipo.nit"),
	CEDULA_EXTRANJERIA(5,"tipoDocumentoEnum.entidad.tipo.cedula.extranjeria"),
	TARJETA_EXTRANJERIA(6,"tipoDocumentoEnum.entidad.tipo.tarjeta.extranjeria"),
	PASAPORTE(7,"tipoDocumentoEnum.entidad.tipo.pasaporte"),
	TARJETA_IDENTIDAD(8,"tipoDocumentoEnum.entidad.tipo.tarjeta.identidad");

	 private int valor;
	    private String nameToken;

	    TipoDocumentoEnum(int valor, String nameToken) {
	        this.valor = valor;
	        this.nameToken = nameToken;
	    }

	    
	    public static TipoDocumentoEnum tomarTipoPorValor(int valor) {
	    	
    		if (valor == CEDULA.getValor()) {
				return CEDULA;
			}
			if (valor == REGISTRO_CIVIL.getValor()) {
				return REGISTRO_CIVIL;
			}
			if (valor == CERTIFICADO_REGISTRADURIA_SIN_IDENTIFICACION.getValor()) {
				return CERTIFICADO_REGISTRADURIA_SIN_IDENTIFICACION;
			}
			if (valor == NIT.getValor()) {
				return NIT;
			}
			if (valor == CEDULA_EXTRANJERIA.getValor()) {
				return CEDULA_EXTRANJERIA;
			}
			if (valor == TARJETA_EXTRANJERIA.getValor()) {
				return TARJETA_EXTRANJERIA;
			}
			if (valor == PASAPORTE.getValor()) {
				return PASAPORTE;
			}
			
			if (valor == TARJETA_IDENTIDAD.getValor()) {
				return TARJETA_IDENTIDAD;
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
