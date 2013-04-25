/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.enumerador;

/**
 * @author CPC-04
 *
 */
public enum TipoTiempoDedicacionEnum {
	
	TIEMPO_COMPLETO(1,"tipoTiempoDedicacionEnum.tiempo.completo"),
	MEDIO_TIEMPO(2,"tipoTiempoDedicacionEnum.medio.tiempo"),
	SIN_DEDICACION_DEFINIDA(3,"tipoTiempoDedicacionEnum.sin.dedicacion.definida");


	private int valor;
	private String nameToken;

	TipoTiempoDedicacionEnum(int valor, String nameToken) {
		this.valor = valor;
		this.nameToken = nameToken;
	}


	public static TipoTiempoDedicacionEnum tomarTipoPorValor(int valor) {

		if (valor == TIEMPO_COMPLETO.getValor()) {
			return TIEMPO_COMPLETO;
		}
		if (valor == MEDIO_TIEMPO.getValor()) {
			return MEDIO_TIEMPO;
		}   
		if (valor == SIN_DEDICACION_DEFINIDA.getValor()) {
			return SIN_DEDICACION_DEFINIDA;
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
