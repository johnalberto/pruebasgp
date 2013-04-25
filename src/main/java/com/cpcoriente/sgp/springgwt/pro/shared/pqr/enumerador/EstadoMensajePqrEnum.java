/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.pqr.enumerador;


/**
 * @author CPC-04
 *
 */
public enum EstadoMensajePqrEnum {
	
	
	PENDIENTE(1,"estadoMensajePqr.pendiente"),
	RESPONDIDO(2,"estadoMensajePqr.respondido");

    private int valor;
    private String nameToken;

    EstadoMensajePqrEnum(int valor, String nameToken) {
        this.valor = valor;
        this.nameToken = nameToken;
    }

    public static EstadoMensajePqrEnum tomarTipoPorValor(int valor) {
    	
    		if (valor == PENDIENTE.getValor()) {
				return PENDIENTE;
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
