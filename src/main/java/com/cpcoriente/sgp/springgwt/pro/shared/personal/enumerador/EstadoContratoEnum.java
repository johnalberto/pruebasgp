/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.enumerador;

/**
 * @author CPC-04
 *
 */
public enum EstadoContratoEnum {

	POR_LEGALIZAR(1,"estadoContratoEnum.termino.indefinido"),
	ACTIVO(2,"estadoContratoEnum.termino.fijo"),
	CULMINADO(3,"estadoContratoEnum.ops"),
	SUSPENDIDO(4,"estadoContratoEnum.outsourcing");


	private int valor;
	private String nameToken;

	EstadoContratoEnum(int valor, String nameToken) {
		this.valor = valor;
		this.nameToken = nameToken;
	}


	public static EstadoContratoEnum tomarTipoPorValor(int valor) {

		if (valor == POR_LEGALIZAR.getValor()) {
			return POR_LEGALIZAR;
		}
		if (valor == ACTIVO.getValor()) {
			return ACTIVO;
		}   
		if (valor == CULMINADO.getValor()) {
			return CULMINADO;
		} 
		if (valor == SUSPENDIDO.getValor()) {
			return SUSPENDIDO;
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
