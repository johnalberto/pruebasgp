/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.enumerador;


/**
 * @author CPC-04
 *
 */
public enum TipoOperacionImpuestoEnum {

	
	SUMA(0,"tipoOperacionImpuestoEnum.tipo.operacion.suma"),
	RESTA(1,"tipoOperacionImpuestoEnum.tipo.operacion.resta");

    private int valor;
    private String nameToken;

    TipoOperacionImpuestoEnum(int valor, String nameToken) {
        this.valor = valor;
        this.nameToken = nameToken;
    }

    public static TipoOperacionImpuestoEnum tomarTipoPorValor(int valor) {
    	
    		if (valor == SUMA.getValor()) {
				return SUMA;
			}
			if (valor == RESTA.getValor()) {
				return RESTA;
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
