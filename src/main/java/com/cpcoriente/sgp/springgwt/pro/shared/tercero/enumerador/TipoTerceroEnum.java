/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador;

/**
 * @author CPC-04
 *
 */
public enum TipoTerceroEnum {

	PROVEEDOR(1,"tipoTercerEnum.tercero.proveedor"),
	PERSONAL_CONTRATADO(2,"tipoTercerEnum.tercero.contratado"),
	OTRO(3,"tipoTercerEnum.tercero.otro");
	
    private int valor;
    private String nameToken;

    TipoTerceroEnum(int valor, String nameToken) {
        this.valor = valor;
        this.nameToken = nameToken;
    }

    public static TipoTerceroEnum tomarTipoPorValor(int valor) {
    	
    		if (valor == PROVEEDOR.getValor()) {
				return PROVEEDOR;
			}
			if (valor == PERSONAL_CONTRATADO.getValor()) {
				return PERSONAL_CONTRATADO;
			}
			if (valor == OTRO.getValor()) {
				return OTRO;
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
