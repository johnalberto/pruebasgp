package com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.enumerador;


public enum TipoMensajeEnum {

	CORREO(1,"tipoMensajeEnum.mensaje.tipo.correo"),
	AVISO(2,"tipoMensajeEnum.mensaje.tipo.aviso"),
	QUEJA_RECLAMO(3,"tipoMensajeEnum.mensaje.tipo.queja.reclamo"),
	AGRADECIMIENTO(4,"tipoMensajeEnum.mensaje.tipo.agradecimiento"),
	SUGERENCIA(5,"tipoMensajeEnum.mensaje.tipo.sugerencia"),
	PREGUNTA(6,"tipoMensajeEnum.mensaje.tipo.pregunta"),
	PETICION(7,"tipoMensajeEnum.mensaje.tipo.peticion");
	
	private int valor;
    private String nameToken;

    TipoMensajeEnum(int valor, String nameToken) {
        this.valor = valor;
        this.nameToken = nameToken;
    }

    
    public static TipoMensajeEnum tomarTipoPorValor(int valor) {
    	
		if (valor == CORREO.getValor()) {
			return CORREO;
		}
		if (valor == AVISO.getValor()) {
			return AVISO;
		}
		if (valor == QUEJA_RECLAMO.getValor()) {
			return QUEJA_RECLAMO;
		}
		if (valor == AGRADECIMIENTO.getValor()) {
			return AGRADECIMIENTO;
		}
		if (valor == SUGERENCIA.getValor()) {
			return SUGERENCIA;
		}
		if (valor == PREGUNTA.getValor()) {
			return PREGUNTA;
		}
		if (valor == PETICION.getValor()) {
			return PETICION;
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
