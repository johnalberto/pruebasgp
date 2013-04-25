/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador;

/**
 * @author CPC-04
 *
 */
public enum EstadoEntregableEnum {
	
	EN_PROCESO(1,"estadoEntregableEnum.en.proceso"),
	ENTREGADO(2,"estadoEntregableEnum.entregado"),
	ANULADO(3,"estadoEntregableEnum.anulado");
	

	
	private int valor;
    private String nameToken;

    EstadoEntregableEnum(int valor, String nameToken) {
        this.valor = valor;
        this.nameToken = nameToken;
    }

    
    public static EstadoEntregableEnum tomarTipoPorValor(int valor) {
    	
		if (valor == EN_PROCESO.getValor()) {
			return EN_PROCESO;
		}
		if (valor == ENTREGADO.getValor()) {
			return ENTREGADO;
		}
		if (valor == ANULADO.getValor()) {
			return ANULADO;
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
