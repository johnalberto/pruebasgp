/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.enumerador;


/**
 * @author CPC-04
 *
 */
public enum TipoMovimientoContableEnum {
	
	
	DEBITO(1,"tipoMovimientoContableEnum.debito"),
	CREDITO(2,"tipoMovimientoContableEnum.credito");
	

	private int valor;
    private String nameToken;

    TipoMovimientoContableEnum(int valor, String nameToken) {
        this.valor = valor;
        this.nameToken = nameToken;
    }

    
    public static TipoMovimientoContableEnum tomarTipoPorValor(int valor) {
    	
		if (valor == DEBITO.getValor()) {
			return DEBITO;
		}
		if (valor == CREDITO.getValor()) {
			return CREDITO;
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
