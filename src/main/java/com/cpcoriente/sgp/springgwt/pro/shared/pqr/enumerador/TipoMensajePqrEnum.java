/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.pqr.enumerador;


/**
 * @author CPC-04
 *
 */
public enum TipoMensajePqrEnum {
	SUGERENCIA(1,"tipoMensajePqr.sugerencia"),
	PETICION(2,"tipoMensajePqr.peticion"),
	QUEJAS_RECLAMOS(3,"tipoMensajePqr.queja.reclamo"),
	PREGUNTAS_INQUIETUDES(4,"tipoMensajePqr.preguntas.inquietudes"),
	AGRADECIMIENTO(5,"tipoMensajePqr.entrada.devolucion.agradecimiento");
	
    private int valor;
    private String nameToken;

    TipoMensajePqrEnum(int valor, String nameToken) {
        this.valor = valor;
        this.nameToken = nameToken;
    }

    public static TipoMensajePqrEnum tomarTipoPorValor(int valor) {
    	
    		if (valor == SUGERENCIA.getValor()) {
				return SUGERENCIA;
			}
			if (valor == PETICION.getValor()) {
				return PETICION;
			}   
			if (valor == QUEJAS_RECLAMOS.getValor()) {
				return QUEJAS_RECLAMOS;
			} 
			if (valor == PREGUNTAS_INQUIETUDES.getValor()) {
				return PREGUNTAS_INQUIETUDES;
			} 
			if (valor == AGRADECIMIENTO.getValor()) {
				return AGRADECIMIENTO;
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
